package by.itacademy.rybalko;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KvitkiTest {
    @Test
    public void testKvitki() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.kvitki.by/");
        Kvitki kvitki = new Kvitki();
        Thread.sleep(3000);
        WebElement buttonCoocie = driver.findElement(By.xpath(kvitki.buttonCoocie));
        buttonCoocie.click();
        Thread.sleep(3000);
        WebElement buttonEnter = driver.findElement(By.xpath(kvitki.buttonEnter));
        buttonEnter.click();
        Thread.sleep(3000);
        WebElement fieldEnter = driver.findElement(By.xpath(kvitki.fieldEnter));
        String actualFieldEnter = fieldEnter.getText();
        Assertions.assertEquals("Вход", actualFieldEnter);
        driver.quit();
    }

    @Test
    public void testClickTwoFields() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.kvitki.by/");
        Kvitki kvitki = new Kvitki();
        Thread.sleep(1000);
        WebElement buttonCoocie = driver.findElement(By.xpath(kvitki.buttonCoocie));
        buttonCoocie.click();
        Thread.sleep(1000);
        WebElement buttonReclama = driver.findElement(By.xpath(kvitki.buttonReclama));
        buttonReclama.click();
        Thread.sleep(1000);
        WebElement buttonEnter = driver.findElement(By.xpath(kvitki.buttonEnter));
        buttonEnter.click();
        Thread.sleep(1000);
        WebElement fieldClickMail = driver.findElement(By.xpath(kvitki.fieldClickMail));
        fieldClickMail.click();
        Thread.sleep(1000);
        WebElement fieldPasswordClick = driver.findElement(By.xpath(kvitki.fieldPasswordClick));
        fieldPasswordClick.click();
        Thread.sleep(1000);
        WebElement pleaseWrightMailTextField = driver.findElement(By.xpath(kvitki.pleaseWrightMailTextField));
        String actualPleaseWrightMailTextField = pleaseWrightMailTextField.getText();
        Assertions.assertEquals("Пожалуйста, заполните поле (Эл. почта)", actualPleaseWrightMailTextField);
        Thread.sleep(1000);
        WebElement fieldPasswordClickTwo = driver.findElement(By.xpath(kvitki.fieldPasswordClickTwo));
        fieldPasswordClickTwo.click();
        Thread.sleep(1000);
        WebElement fieldClickMailTwo = driver.findElement(By.xpath(kvitki.fieldClickMailTwo));
        fieldClickMailTwo.click();
        Thread.sleep(1000);
        WebElement pleaseWrightPasswordTextField = driver.findElement(By.xpath(kvitki.pleaseWrightPasswordTextField));
        String actualPleaseWrightPasswordTextField = pleaseWrightPasswordTextField.getText();
        Assertions.assertEquals("Пожалуйста, заполните поле (Эл. почта)", actualPleaseWrightMailTextField);
        driver.quit();
    }

    @Test
    public void testFieldMail() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.kvitki.by/");
        Kvitki kvitki = new Kvitki();
        Thread.sleep(1000);
        WebElement buttonCoocie = driver.findElement(By.xpath(kvitki.buttonCoocie));
        buttonCoocie.click();
        Thread.sleep(1000);
        WebElement buttonReclama = driver.findElement(By.xpath(kvitki.buttonReclama));
        buttonReclama.click();
        Thread.sleep(1000);
        WebElement buttonEnter = driver.findElement(By.xpath(kvitki.buttonEnter));
        buttonEnter.click();
        Thread.sleep(3000);
        WebElement inputTextMail = driver.findElement(By.xpath(kvitki.inputTextMail));
        inputTextMail.sendKeys("mail");
        Thread.sleep(1000);
        WebElement fieldPasswordClick = driver.findElement(By.xpath(kvitki.fieldPasswordClick));
        fieldPasswordClick.click();
        Thread.sleep(1000);
        WebElement pleaseWrightAdressMail = driver.findElement(By.xpath(kvitki.pleaseWrightAdressMail));
        String actualPleaseWrightAdressMail = pleaseWrightAdressMail.getText();
        Assertions.assertEquals("Пожалуйста, введите адрес электронной почты в правильном формате: name@example.com", actualPleaseWrightAdressMail);
        driver.quit();
    }

}
