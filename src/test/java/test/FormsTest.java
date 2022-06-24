package test;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FormsTest extends BasePage {
    @BeforeMethod
    public void setUpTest() {
        driver.manage().window().maximize();
        driver.navigate().to(url);
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(homePage.svgs));
        homePage.getForms().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("left-pannel")));
    }
    @Test
    public void goToPracticeFormsPage() {
        forms.getPracticeFormItem().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("uploadPicture")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/automation-practice-form");
    }
}