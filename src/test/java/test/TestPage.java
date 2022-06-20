package test;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPage extends BasePage {

    @BeforeMethod
    public void setUpTest() {
        driver.manage().window().maximize();
        driver.navigate().to(url);
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(homePage.svgs));
    }

    @Test
    public void clickOnHomeLink() {
        homePage.getHomeLink().click();
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(homePage.svgs));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");

    }

    @Test
    public void goToElements() {
        homePage.getElements().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("left-pannel")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/elements");

    }

    @Test
    public void goToForms() {
        homePage.getForms().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("left-pannel")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/forms");

    }

    @Test
    public void goToAFW() {
        homePage.getAFW().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("left-pannel")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/alertsWindows");

    }

    @Test
    public void goToWidgets() {
        homePage.getWidgets().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("left-pannel")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/widgets");

    }

    @Test
    public void goToInteractions() {
        homePage.getInteractions().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("left-pannel")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/interaction");

    }

    @Test
    public void goBookStoreApp() {
        homePage.getBookStoreApp().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("left-pannel")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/books");
    }
}
