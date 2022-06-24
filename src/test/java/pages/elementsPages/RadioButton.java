package pages.elementsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class RadioButton {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public By info = By.className("mt-3");

    public RadioButton(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public List<WebElement> getRadios () {
        return driver.findElements(By.tagName("input"));
    }
    public WebElement getInfo () { return driver.findElement(info);}
}
