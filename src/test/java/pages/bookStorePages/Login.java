package pages.bookStorePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
    public WebDriver driver;
    public WebDriverWait wdwait;

    public Login(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getUserNameInput () {
        return driver.findElement(By.id("userName"));
    }
    public WebElement getPasswordInput () { return driver.findElement(By.id("password")); }
    public WebElement getLoginButton () { return driver.findElement(By.id("login"));   }
    public WebElement getNewUserButton () { return driver.findElement(By.id("newUser")); }
}
