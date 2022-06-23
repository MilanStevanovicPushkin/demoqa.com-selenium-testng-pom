package test;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementsTest extends BasePage {
    @BeforeMethod
    public void setUpTest() {
        driver.manage().window().maximize();
        driver.navigate().to(url);
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(homePage.svgs));
        homePage.getElements().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("left-pannel")));
    }

    @Test
    public void goToTextBoxPage() {
        elements.getTextBoxItem().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("submit")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/text-box");

    }
    @Test
    public void goToCheckBoxPage() {
        elements.getCheckBoxItem().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("rct-text")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/checkbox");
    }
    @Test
    public void goToRadioButtonPage() {
        elements.getRadioButtonItem().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("impressiveRadio")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/radio-button");
    }
    @Test
    public void goToWebTablesPage() {
        elements.getWebTablesItem().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("rt-table")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/webtables");
    }


    @Test
    public void goToButtonsPage() {
        elements.getButtonsItem().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("rightClickBtn")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/buttons");
    }

    @Test
    public void goToLinksPage() {
        elements.getLinksItem().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("linkWrapper")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/links");
    }

    @Test
    public void goToBrokenPage() {
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        elements.getBrokenLinksImagesItem().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Click Here for Valid Link")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/broken");
    }

    @Test
    public void goToUploadDownloadPage() {
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        elements.getUploadAndDownloadItem().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("downloadButton")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/upload-download");
    }

    @Test
    public void goToDynamicPropertiesPage() {
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        elements.getDynamicPropertiesItem().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("enableAfter")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/dynamic-properties");
    }
}