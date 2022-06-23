package pages.elementsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Text_Box {
    public WebDriver driver;
    public WebDriverWait wdwait;

    public Text_Box(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getFullNameInput (){
        return driver.findElement(By.id("userName"));
    }
    public WebElement getEmailInput (){
        return driver.findElement(By.id("userEmail"));
    }
    public WebElement getCurrentAddressInput (){
        return driver.findElement(By.id("currentAddress"));
    }
    public WebElement getpermanentAddressInput (){
        return driver.findElement(By.id("permanentAddress"));
    }
    public WebElement getSubmitButton (){
        return driver.findElement(By.id("submit"));
    }
    public List<WebElement> getParagraphs (){
        return driver.findElements(By.tagName("p"));
    }

}
