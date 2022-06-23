package pages.elementsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox {
    public WebDriver driver;
    public WebDriverWait wdwait;

    public CheckBox(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getTreeNodeHome () {
        return driver.findElement(By.id("tree-node-home"));
    }

    public WebElement getRctText () {
        return driver.findElement(By.className("rct-text"));
    }
}
