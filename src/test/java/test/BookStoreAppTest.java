package test;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BookStoreAppTest extends BasePage {
    @BeforeMethod
    public void setUpTest() {
        driver.manage().window().maximize();
        driver.navigate().to(url);
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(homePage.svgs));
        actions.moveToElement(homePage.getBookStoreApp()).click().build().perform();
        homePage.getBookStoreApp().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("left-pannel")));
    }
    @Test
    public void goToLoginPage() {
        bookStoreApp.getLoginItem().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("login")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/login");

    }
    @Test
    public void goToBooksPage() {
        bookStoreApp.getBookStoreItem().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("-pageInfo")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/books");
    }

    @Test
    public void goToProfilePage() {
        bookStoreApp.getProfileItem().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("-pageInfo")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/profile");
    }

    @Test
    public void goToBookStoreAPIPage() {
        bookStoreApp.getProfileItem().click();
        //wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("-pageInfo")));
        //Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/profile");
    }
}