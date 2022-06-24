package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BookStoreApp {
    public WebDriver driver;
    public WebDriverWait wdwait;

    public BookStoreApp(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    private WebElement getUnorderedList () {
        return driver.findElements(By.tagName("ul")).get(5);
    }
    public WebElement getLoginItem () {
        return getUnorderedList().findElement(By.id("item-0"));
    }
    public WebElement getBookStoreItem () {
        return getUnorderedList().findElement(By.id("item-2"));
    }
    public WebElement getProfileItem () {
        return getUnorderedList().findElement(By.id("item-3"));
    }
    public WebElement getBookStoreAPIItem () {
        return getUnorderedList().findElement(By.id("item-4"));
    }
}
