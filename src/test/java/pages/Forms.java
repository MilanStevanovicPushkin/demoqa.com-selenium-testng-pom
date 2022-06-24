package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Forms {
    public WebDriver driver;
    public WebDriverWait wdwait;

    public Forms(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getPracticeFormItem (){
        List<WebElement> items = driver.findElements(By.id("item-0"));
        return items.get(1);
    }
}
