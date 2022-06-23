package test.elementsPages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RadioButtonTest extends BasePage {
    @BeforeMethod
    public void setUpTest() {
        driver.manage().window().maximize();
        driver.navigate().to(url);
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(homePage.svgs));
        homePage.getElements().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("left-pannel")));
        elements.getRadioButtonItem().click();
        //driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        // wdwait.until(ExpectedConditions.elementToBeClickable(checkBox.getTreeNodeHome()));

    }

    @Test
    public void clickOnYes() {

        //wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("input")));
        wdwait.until(ExpectedConditions.visibilityOf(radioButton.getRadios().get(0)));
        //driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        //System.out.println(checkBox.getTreeNodeHome() + " " + checkBox.getTreeNodeHome().getTagName());
        radioButton.getRadios().get(0).click();
        // Assert.assertEquals(text_box.getParagraphs().get(3).getText(), "Permananet Address :" + permanentAddress);

    }
}