package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elements {
    public WebDriver driver;
    public WebDriverWait wdwait;

    public Elements(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getTextBoxItem (){
        return driver.findElement(By.id("item-0"));
    }
    public WebElement getCheckBoxItem (){
        return driver.findElement(By.id("item-1"));
    }
    public WebElement getRadioButtonItem (){
        return driver.findElement(By.id("item-2"));
    }
    public WebElement getWebTablesItem (){
        return driver.findElement(By.id("item-3"));
    }
    public WebElement getButtonsItem (){
        return driver.findElement(By.id("item-4"));
    }
    public WebElement getLinksItem (){
        return driver.findElement(By.id("item-5"));
    }
    public WebElement getBrokenLinksImagesItem (){
        return driver.findElement(By.id("item-6"));
    }
    public WebElement getUploadAndDownloadItem (){
        return driver.findElement(By.id("item-7"));
    }
    public WebElement getDynamicPropertiesItem (){
        return driver.findElement(By.id("item-8"));
    }
}
