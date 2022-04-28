# Ejemplo 2 - Features de JUnit

## :dart: Objetivo

- Analizar algunas características de JUnit5 para pruebas Java

## ⚙ Requisitos

- IntelliJ IDEA
- Java
- Gradle
- JUnit
- JUnit 5
- Code with me
- Una cuenta de GitHub

## Desarrollo

#### Condiciones de sistema operativo

Un contenedor o prueba se puede habilitar o deshabilitar en un sistema operativo en particular a través de las
anotaciones @EnabledOnOs y @DisabledOnOs.

```java
@Test
@EnabledOnOs(MAC)
void onlyOnMacOs(){
// ...
        }

@TestOnMac
void testOnMac(){
// ...
        }

@Test
@EnabledOnOs({LINUX, MAC})
void onLinuxOrMac(){
// ...
        }

@Test
@DisabledOnOs(WINDOWS)
void notOnWindows(){
// ...
        }
```

```java
@Test
@EnabledOnOs(MAC)
void onlyOnMacOs(){
// ...
        }

@TestOnMac
void testOnMac(){
// ...
        }

@Test
@EnabledOnOs({LINUX, MAC})
void onLinuxOrMac(){
// ...
        }

@Test
@DisabledOnOs(WINDOWS)
void notOnWindows(){
// ...
        }
```

#### Condiciones del entorno de ejecución de Java

Un contenedor o prueba puede habilitarse o deshabilitarse en versiones particulares de Java Runtime Environment (JRE) a
través de las anotaciones @EnabledOnJre y @DisabledOnJre o en un rango particular de versiones del JRE a través de las
anotaciones @EnabledForJreRange y @DisabledForJreRange. El rango predeterminado es JRE.JAVA_8 como el borde inferior (
min) y JRE.OTHER como el borde superior (max), lo que permite el uso de rangos medio abiertos.

```java
@Test
@EnabledOnJre(JAVA_8)
void onlyOnJava8(){
        // ...
        }

@Test
@EnabledOnJre({JAVA_9, JAVA_10})
void onJava9Or10(){
        // ...
        }

@Test
@EnabledForJreRange(min = JAVA_9, max = JAVA_11)
void fromJava9to11(){
        // ...
        }

@Test
@EnabledForJreRange(min = JAVA_9)
void fromJava9toCurrentJavaFeatureNumber(){
        // ...
        }

@Test
@EnabledForJreRange(max = JAVA_11)
void fromJava8To11(){
        // ...
        }
```

#### Condiciones de variables de entorno

Un contenedor o una prueba se puede habilitar o deshabilitar según el valor de la variable de entorno nombrada del
sistema operativo subyacente a través de las anotaciones @EnabledIfEnvironmentVariable y @DisabledIfEnvironmentVariable.
El valor proporcionado a través del atributo de coincidencias se interpretará como una expresión regular.

```java

@Test
@EnabledIfEnvironmentVariable(named = "ENV", matches = "staging-server")
void onlyOnStagingServer(){
        // ...
        }

@Test
@DisabledIfEnvironmentVariable(named = "ENV", matches = ".*development.*")
void notOnDeveloperWorkstation(){
        // ...
        }


```

### Pruebas parametrizadas

Las pruebas parametrizadas permiten ejecutar una prueba varias veces con diferentes argumentos. Se declaran igual que
los métodos @Test normales, pero utilizan la anotación @ParameterizedTest en su lugar. Además, debe declarar al menos
una fuente que proporcionará los argumentos para cada invocación y luego consumirá los argumentos en el método de
prueba.

El siguiente ejemplo muestra una prueba parametrizada que usa la anotación @ValueSource para especificar un arreglo de
strings como fuente de argumentos.

```java

@ParameterizedTest
@ValueSource(strings = {"anita lava la tina", "hola", "oso"})
void palindromes(String candidate){
        assertTrue(StringUtils.isPalindrome(candidate));
        }

```

### Plantilla de pruebas

Un método @TestTemplate no es un caso de prueba normal, sino una plantilla para casos de prueba. Como tal, está diseñado
para ser invocado varias veces dependiendo del número de contextos de invocación devueltos por los proveedores
registrados. Por lo tanto, debe usarse junto con una extensión TestTemplateInvocationContextProvider registrada. Cada
invocación de un método de plantilla de prueba se comporta como la ejecución de un método @Test normal con soporte
completo para las mismas devoluciones de llamada y extensiones del ciclo de vida.

Las pruebas repetidas y las pruebas parametrizadas son especializaciones integradas de las plantillas de prueba.

Un método @TestTemplate solo se puede ejecutar cuando al menos un TestTemplateInvocationContextProvider está registrado.
Cada uno de estos proveedores es responsable de proporcionar una secuencia de instancias de
TestTemplateInvocationContext. Cada contexto puede especificar un nombre de visualización personalizado y una lista de
extensiones adicionales que solo se utilizarán para la próxima invocación del método @TestTemplate.

El siguiente ejemplo muestra cómo escribir una plantilla de prueba y cómo registrar e implementar un
TestTemplateInvocationContextProvider.

```java


final List<String> fruits=Arrays.asList("apple","banana","lemon");

@TestTemplate
@ExtendWith(MyTestTemplateInvocationContextProvider.class)
void testTemplate(String fruit){
        assertTrue(fruits.contains(fruit));
        }

public class MyTestTemplateInvocationContextProvider
        implements TestTemplateInvocationContextProvider {

    @Override
    public boolean supportsTestTemplate(ExtensionContext context) {
        return true;
    }

    @Override
    public Stream<TestTemplateInvocationContext> provideTestTemplateInvocationContexts(
            ExtensionContext context) {

        return Stream.of(invocationContext("apple"), invocationContext("banana"));
    }

    private TestTemplateInvocationContext invocationContext(String parameter) {
        return new TestTemplateInvocationContext() {
            @Override
            public String getDisplayName(int invocationIndex) {
                return parameter;
            }

            @Override
            public List<Extension> getAdditionalExtensions() {
                return Collections.singletonList(new ParameterResolver() {
                    @Override
                    public boolean supportsParameter(ParameterContext parameterContext,
                                                     ExtensionContext extensionContext) {
                        return parameterContext.getParameter().getType().equals(String.class);
                    }

                    @Override
                    public Object resolveParameter(ParameterContext parameterContext,
                                                   ExtensionContext extensionContext) {
                        return parameter;
                    }
                });
            }
        };
    }
}
```

En este ejemplo, la plantilla de prueba se invocará dos veces. Los nombres para mostrar de las invocaciones serán apple
y banana según lo especificado por el contexto de invocación. Cada invocación registra un ParameterResolver
personalizado que se utiliza para resolver el parámetro del método

La API de extensión TestTemplateInvocationContextProvider está diseñada principalmente para implementar diferentes tipos
de pruebas que se basan en la invocación repetitiva de un método similar a una prueba, aunque en diferentes contextos,
por ejemplo, con diferentes parámetros, preparando la instancia de la clase de prueba de manera diferente o varias veces
sin modificar el contexto. Consulte las implementaciones de pruebas repetidas o pruebas parametrizadas que utilizan este
punto de extensión para proporcionar su funcionalidad.
