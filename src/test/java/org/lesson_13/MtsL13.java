package org.lesson_13;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Test;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public  class MtsL13 {

    private WebDriver driver;
    private WebDriverWait wait;

    void webdriver() {

        System.setProperty("webdriver.chrome.driver", "/Users/ONE/Downloads/chromedriver-mac-x64 4/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.mts.by");
        WebElement cookie = driver.findElement(By.id("cookie-agree"));
        cookie.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));

    }

    @Test
     public  void test1() {
        webdriver();
        WebElement blockTitle = driver.findElement(By.xpath("//div[@class='col-12 col-xl-8']//h2[1]"));
        Assertions.assertEquals("Онлайн пополнение\nбез комиссии",blockTitle.getText());
        System.out.println("TEST 1 PASSED");
        quit();
    }

    @Test
    public void test2() {
        webdriver();
        WebElement logos = driver.findElement(By.cssSelector("img[alt='Visa']"));
        Assertions.assertEquals("Visa",logos.getAttribute("alt"));
        System.out.println("TEST 2 PASSED");
        quit();
    }
    @Test
    public void test2_2() {
        webdriver();
        WebElement logos = driver.findElement(By.cssSelector("img[alt='МИР']"));
        Assertions.assertEquals("МИР",logos.getAttribute("alt"));
        System.out.println("TEST 2_2 PASSED");
        quit();
    }


    @Test
    public void test3() {
        webdriver();
        WebElement moreLink = driver.findElement(By.linkText("Подробнее о сервисе"));
        moreLink.click();
        System.out.println("TEST 3 PASSED");
        quit();
    }

    @Test
    public void test4 () {
        webdriver();
        WebElement numberInput = driver.findElement(By.id("connection-phone"));
        numberInput.sendKeys("297777777");

        WebElement price = driver.findElement(By.id("connection-sum"));
        price.sendKeys("2");

        WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(),'Продолжить')]"));
        continueButton.click();
        System.out.println("TEST 4 PASSED");
        quit();

    }

    public void quit()
    {
            driver.close();
            driver.quit();
        }
    }

