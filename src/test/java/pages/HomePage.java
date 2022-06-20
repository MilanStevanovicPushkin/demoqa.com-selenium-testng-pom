package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public By svgs = By.tagName("svg");



    public HomePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    private WebElement getHeader() {
        return driver.findElement(By.tagName("header"));
    }

    public WebElement getHomeLink() {
        return getHeader().findElement(By.tagName("a"));
    }

    public WebElement getElements (){
        return driver.findElements(svgs).get(0);
    }
    public WebElement getForms (){
        return driver.findElements(svgs).get(1);
    }
    public WebElement getAFW (){
        return driver.findElements(svgs).get(2);
    }
    public WebElement getWidgets (){
        return driver.findElements(svgs).get(3);
    }
    public WebElement getInteractions (){
        return driver.findElements(svgs).get(4);
    }
    public WebElement getBookStoreApp (){
        return driver.findElements(svgs).get(5);
    }
}
