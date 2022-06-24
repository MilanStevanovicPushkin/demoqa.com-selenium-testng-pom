package test.elementsPages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RadioButtonTest extends BasePage {
    @BeforeMethod
    public void setUpTest() {
        driver.manage().window().maximize();
        driver.navigate().to(url);
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(homePage.svgs));
        homePage.getElements().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("left-pannel")));
        elements.getRadioButtonItem().click();

    }

    @Test
    public void clickOnYes() {
        actions.moveToElement(radioButton.getRadios().get(0)).click().build().perform();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(radioButton.info));
        Assert.assertEquals(radioButton.getInfo().getText(),"You have selected Yes");
    }

    @Test
    public void clickOnImpressive() {
        actions.moveToElement(radioButton.getRadios().get(1)).click().build().perform();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(radioButton.info));
        Assert.assertEquals(radioButton.getInfo().getText(),"You have selected Impressive");

    }
}