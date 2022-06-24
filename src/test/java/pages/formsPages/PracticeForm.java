package pages.formsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class PracticeForm {
    public WebDriver driver;
    public WebDriverWait wdwait;

    public PracticeForm(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getFirstNameInput () {
        return driver.findElement(By.id("firstName"));
    }
    public WebElement getLastNameInput () {
        return driver.findElement(By.id("lastName"));
    }
    public WebElement getUserEmailInput () {
        return driver.findElement(By.id("userEmail"));
    }
    public WebElement getGenderRadio1Input () {
        return driver.findElement(By.id("gender-radio-1"));
    }
    public WebElement getGenderRadio2Input () {
        return driver.findElement(By.id("gender-radio-2"));
    }
    public WebElement getGenderRadio3Input () {
        return driver.findElement(By.id("gender-radio-3"));
    }
    public WebElement getUserNumberInput () {
        return driver.findElement(By.id("userNumber"));
    }
    public WebElement getDateOfBirthInput () {
        return driver.findElement(By.id("dateOfBirthInput"));
    }
    public WebElement getSubjectInput () {
        return driver.findElement(By.id("subjectsInput"));
    }
    public WebElement getCheckBoxSports () {
        return driver.findElement(By.id("hobbies-checkbox-1"));
    }
    public WebElement getCheckBoxReading () {
        return driver.findElement(By.id("hobbies-checkbox-2"));
    }
    public WebElement getCheckBoxMusic () {
        return driver.findElement(By.id("hobbies-checkbox-3"));
    }
    public WebElement getuploadPictureInput () {
        return driver.findElement(By.id("uploadPicture"));
    }
    public WebElement getCurrentAddressInput () {
        return driver.findElement(By.id("currentAddress"));
    }
    public WebElement getSelectState () { return driver.findElement(By.id("react-select-3-input")); }
    public WebElement getSelectCity () { return driver.findElement(By.id("react-select-4-input")); }

    public  WebElement getSubmitButton () {return driver.findElement(By.id("submit"));}
    //document.getElementsByTagName("tr")[1].getElementsByTagName("td")[1].innerText
    public List<String> getResults () {
        List<String> ret = new ArrayList<>();
        List<WebElement> rows = driver.findElements(By.tagName("tr"));
        //System.out.println(rows.get(0).findElements(By.tagName("td")).get(0).getText());
        //System.out.println(rows.get(0).findElements(By.tagName("td")).get(1).getText());
        for (int i=1; i<rows.size(); i++) ret.add(rows.get(i).findElements(By.tagName("td")).get(1).getText());
        return ret;
    }

    public boolean tableRowsExist () {
        List<WebElement> rows = driver.findElements(By.tagName("tr"));
        if (rows.size()>0) return true;
        else return false;
    }
}
