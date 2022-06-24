package pages.bookStorePages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTest extends BasePage {
    @BeforeMethod
    public void setUpTest() {
        driver.manage().window().maximize();
        driver.navigate().to(url);
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(homePage.svgs));
        homePage.getBookStoreApp().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("left-pannel")));
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        bookStoreApp.getLoginItem().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("login")));
    }

    @Test
    public void logIn() {
        login.getUserNameInput().sendKeys("MardyFish");
        login.getPasswordInput().sendKeys("Fish123.!?");
        login.getLoginButton().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("userName-value")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/profile");

    }
}