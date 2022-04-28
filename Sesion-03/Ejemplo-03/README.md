# Ejemplo 3 - TestNG

## :dart: Objetivo

- Analizar algunas características de TestNG para pruebas Java

## ⚙ Requisitos

- IntelliJ IDEA
- Java
- Gradle
- TestNG

## Desarrollo

El siguiente es un ejemplo del uso de TestNG en código Java


build.gradle
```java
plugins {
    id 'java'
}

group 'org.example'
version '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    implementation 'junit:junit:4.13.1'
    testImplementation 'org.testng:testng:7.4.0'
    implementation 'org.seleniumhq.selenium:selenium-java:3.141.59'
    implementation 'org.seleniumhq.selenium:selenium-support:3.141.59'
}

test {
    useTestNG() {
        // To generate reports by TestNG library
        useDefaultListeners = true
    }
}

```

TestGitHub.java
```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class TestGitHub {

  private WebDriver driver;


  @BeforeTest
  public void setup() {
    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver_linux64/chromedriver");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("start-maximized"); // open Browser in maximized mode
    options.addArguments("disable-infobars"); // disabling infobars
    options.addArguments("--disable-extensions"); // disabling extensions
    options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
    options.addArguments("--no-sandbox"); // Bypass OS security model
    driver = new ChromeDriver(options);
  }

  @AfterTest
  public void teardown() {
    if (driver != null) {
      driver.quit();
    }
  }

  @Test
  public void verifyGitHubTitle() {
    driver.get("https://www.github.com");
    assertEquals(driver.getTitle(), "GitHub");
  }
}
```
