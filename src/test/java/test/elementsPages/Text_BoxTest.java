package test.elementsPages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Text_BoxTest extends BasePage {
    private String fullName;
    private String email;
    private String currentAddress;
    private String permanentAddress;
    @BeforeMethod
    public void setUpTest() {
        fullName = "Marko Nikolic";
        email = "giga.moravac@gigamail.yu";
        currentAddress = "Mlatisumina 11";
        permanentAddress = "Topolska 18";
        driver.manage().window().maximize();
        driver.navigate().to(url);
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(homePage.svgs));
        homePage.getElements().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("left-pannel")));
        elements.getTextBoxItem().click();
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        wdwait.until(ExpectedConditions.visibilityOf(text_box.getSubmitButton()));
        wdwait.until(ExpectedConditions.elementToBeClickable(text_box.getSubmitButton()));

    }

    @Test
    public void submitValidData() {
        text_box.getFullNameInput().sendKeys(fullName);
        text_box.getEmailInput().sendKeys(email);
        text_box.getCurrentAddressInput().sendKeys(currentAddress);
        text_box.getpermanentAddressInput().sendKeys(permanentAddress);
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        text_box.getSubmitButton().click();
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("p")));
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        Assert.assertEquals(text_box.getParagraphs().get(0).getText(), "Name:" + fullName);
        Assert.assertEquals(text_box.getParagraphs().get(1).getText(), "Email:" + email);
        Assert.assertEquals(text_box.getParagraphs().get(2).getText(), "Current Address :" + currentAddress);
        Assert.assertEquals(text_box.getParagraphs().get(3).getText(), "Permananet Address :" + permanentAddress);

    }

    @Test
    public void submitEmptyFullNameAndValidData() {
        fullName = "";
        text_box.getFullNameInput().sendKeys(fullName);
        text_box.getEmailInput().sendKeys(email);
        text_box.getCurrentAddressInput().sendKeys(currentAddress);
        text_box.getpermanentAddressInput().sendKeys(permanentAddress);
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        text_box.getSubmitButton().click();
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("p")));
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        Assert.assertEquals(text_box.getParagraphs().get(0).getText(), "Email:" + email);
        Assert.assertEquals(text_box.getParagraphs().get(1).getText(), "Current Address :" + currentAddress);
        Assert.assertEquals(text_box.getParagraphs().get(2).getText(), "Permananet Address :" + permanentAddress);

    }

    @Test
    public void submitEmptyEmailAndValidData() {
        email = "";
        text_box.getFullNameInput().sendKeys(fullName);
        text_box.getEmailInput().sendKeys(email);
        text_box.getCurrentAddressInput().sendKeys(currentAddress);
        text_box.getpermanentAddressInput().sendKeys(permanentAddress);
        //driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        text_box.getSubmitButton().click();
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("p")));
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        Assert.assertEquals(text_box.getParagraphs().get(0).getText(), "Name:" + fullName);
        Assert.assertEquals(text_box.getParagraphs().get(1).getText(), "Current Address :" + currentAddress);
        Assert.assertEquals(text_box.getParagraphs().get(2).getText(), "Permananet Address :" + permanentAddress);

    }

}