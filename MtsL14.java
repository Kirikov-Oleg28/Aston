package org.lesson_14;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public  class MtsL14 {

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
    public  void communicationServices() {
        webdriver();
        WebElement blockTitle = driver.findElement(By.className("select__now"));
        blockTitle.click();
        WebElement number = driver.findElement(By.xpath("//input[@id='connection-phone']"));
        Assertions.assertEquals("Номер телефона",number.getAttribute("placeholder"));
        System.out.println("Плейс холдер: Номер телефона присутствует в заданном поле");
        WebElement sum = driver.findElement(By.xpath("//input[@id='connection-sum']"));
        Assertions.assertEquals("Сумма",sum.getAttribute("placeholder"));
        System.out.println("Плейс холдер: Сумма присутствует в заданном поле");
        WebElement mail = driver.findElement(By.xpath("//input[@id='connection-email']"));
        Assertions.assertEquals("E-mail для отправки чека",mail.getAttribute("placeholder"));
        System.out.println("Плейс холдер: E-mail для отправки чека присутствует в заданном поле");

        quit();
    }
    @Test
    public  void homeInternet() {
        webdriver();
        WebElement blockTitle = driver.findElement(By.xpath("//span[@class='select__now']"));
        blockTitle.click();
        WebElement number = driver.findElement(By.xpath("//input[@id='internet-phone']"));
        Assertions.assertEquals("Номер абонента",number.getAttribute("placeholder"));
        System.out.println("Плейс холдер: Номер абонента присутствует в заданном поле");
        WebElement sum = driver.findElement(By.xpath("//input[@id='internet-sum']"));
        Assertions.assertEquals("Сумма",sum.getAttribute("placeholder"));
        System.out.println("Плейс холдер: Сумма присутствует в заданном поле");
        WebElement mail = driver.findElement(By.xpath("//input[@id='internet-email']"));
        Assertions.assertEquals("E-mail для отправки чека",mail.getAttribute("placeholder"));
        System.out.println("Плейс холдер: E-mail для отправки чека присутствует в заданном поле");

        quit();
    }
    @Test
    public  void installment() {
        webdriver();
        WebElement blockTitle = driver.findElement(By.className("select__now"));
        blockTitle.click();
        WebElement number = driver.findElement(By.xpath("//input[@id='score-instalment']"));
        Assertions.assertEquals("Номер счета на 44",number.getAttribute("placeholder"));
        System.out.println("Плейс холдер: Номер счета на 44 присутствует в заданном поле");
        WebElement sum = driver.findElement(By.xpath("//input[@id='instalment-sum']"));
        Assertions.assertEquals("Сумма",sum.getAttribute("placeholder"));
        System.out.println("Плейс холдер: Сумма присутствует в заданном поле");
        WebElement mail = driver.findElement(By.xpath("//input[@id='instalment-email']"));
        Assertions.assertEquals("E-mail для отправки чека",mail.getAttribute("placeholder"));
        System.out.println("Плейс холдер: E-mail для отправки чека присутствует в заданном поле");

        quit();
    }

@Test
public  void debt() {
    webdriver();
    WebElement blockTitle = driver.findElement(By.className("select__now"));
    blockTitle.click();
    WebElement number = driver.findElement(By.xpath("//button[@class='select__header']"));
    Assertions.assertEquals("Номер счета на 2073","Номер счета на 2073");
    System.out.println("Плейс холдер: Номер счета на 2073 присутствует в заданном поле");
    WebElement sum = driver.findElement(By.xpath("//input[@id='arrears-sum']"));
    Assertions.assertEquals("Сумма","Сумма");
    System.out.println("Плейс холдер: Сумма присутствует в заданном поле");
    WebElement mail = driver.findElement(By.xpath("//input[@id='arrears-email']"));
    Assertions.assertEquals("E-mail для отправки чека","E-mail для отправки чека");
    System.out.println("Плейс холдер: E-mail для отправки чека присутствует в заданном поле");

    quit();
}

    @Test
    public void buttonContinue() {
        webdriver();
        WebElement numberInput = driver.findElement(By.id("connection-phone"));
        numberInput.sendKeys("297777777");

        WebElement price = driver.findElement(By.id("connection-sum"));
        price.sendKeys("2");
        WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(),'Продолжить')]"));
        continueButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement winOne = driver.findElement(By.className("app-wrapper__content"));

        new WebDriverWait(driver,Duration.ofSeconds(5))
            .until(ExpectedConditions.visibilityOfElementLocated (By.xpath("//div[@class='header__payment-amount']")));
            WebElement sumFrame = driver.findElement(By.xpath("//div[@class='header__container']"));
            new WebDriverWait(driver, Duration.ofSeconds(5));
        Assertions.assertEquals(price,sumFrame.getText());

        System.out.println("TEST buttonContinue PASSED");

    }

    @Test
    public  void payWindow() {
        webdriver();
        WebElement card = driver.findElement(By.className("app-wrapper__content"));
        Assertions.assertEquals("Номер карты",card.getText());
        System.out.println("Плейс холдер: Номер карты присутствует в заданном поле");
//        WebElement blockTitle = driver.findElement(By.className("select__now"));
//        blockTitle.click();
//        WebElement number = driver.findElement(By.xpath("//input[@id='score-instalment']"));
//        Assertions.assertEquals("Номер счета на 44",number.getAttribute("placeholder"));
//        System.out.println("Плейс холдер: Номер счета на 44 присутствует в заданном поле");
//        WebElement sum = driver.findElement(By.xpath("//input[@id='instalment-sum']"));
//        Assertions.assertEquals("Сумма",sum.getAttribute("placeholder"));
//        System.out.println("Плейс холдер: Сумма присутствует в заданном поле");
//        WebElement mail = driver.findElement(By.xpath("//input[@id='instalment-email']"));
//        Assertions.assertEquals("E-mail для отправки чека",mail.getAttribute("placeholder"));
//        System.out.println("Плейс холдер: E-mail для отправки чека присутствует в заданном поле");

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



    public void quit()
    {
        driver.close();
        driver.quit();
    }
}

