package test.formsPages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PracticeFormTest extends BasePage {
    @BeforeMethod
    public void setUpTest() {
        driver.manage().window().maximize();
        driver.navigate().to(url);
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(homePage.svgs));
        homePage.getForms().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("left-pannel")));
        forms.getPracticeFormItem().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("uploadPicture")));
    }

    @Test
    public void fillOutAndSubmit(){
        practiceForm.getFirstNameInput().sendKeys("Steva");
        practiceForm.getLastNameInput().sendKeys("Kajganic");
        practiceForm.getUserEmailInput().sendKeys("Veljko@vmail.com");
        actions.moveToElement(practiceForm.getGenderRadio1Input()).click().build().perform();
        practiceForm.getUserNumberInput().sendKeys("0691234567");
        for (int i=1; i<11; i++) practiceForm.getDateOfBirthInput().sendKeys(Keys.BACK_SPACE);
        practiceForm.getDateOfBirthInput().sendKeys("09/25/2013");
        for (int i=1; i<11; i++) practiceForm.getDateOfBirthInput().sendKeys(Keys.ARROW_LEFT);
        practiceForm.getDateOfBirthInput().sendKeys(Keys.BACK_SPACE);
        practiceForm.getDateOfBirthInput().sendKeys(Keys.ENTER);
        practiceForm.getSubjectInput().sendKeys("English");
        practiceForm.getSubjectInput().sendKeys(Keys.TAB);
        practiceForm.getSubjectInput().sendKeys("Hindi");
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        actions.moveToElement(practiceForm.getCheckBoxSports()).click().build().perform();
        actions.moveToElement(practiceForm.getCheckBoxMusic()).click().build().perform();
        practiceForm.getuploadPictureInput().sendKeys("C:\\Users\\Mikica\\IdeaProjects\\Demoqa_Full_Test\\src\\resources\\Capture.PNG");
        practiceForm.getCurrentAddressInput().sendKeys("Nikole Tesle 12");
        practiceForm.getSelectState().sendKeys("NCR\n");
        practiceForm.getSelectCity().sendKeys("Noida\n");
        practiceForm.getSubmitButton().submit();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("tr")));
        Assert.assertEquals(practiceForm.getResults().get(0),"Steva Kajganic");
        Assert.assertEquals(practiceForm.getResults().get(1),"Veljko@vmail.com");
    }

    @Test
    public void fillOutAndSubmitWithoutFirstName(){
        //practiceForm.getFirstNameInput().sendKeys("Steva");
        practiceForm.getLastNameInput().sendKeys("Kajganic");
        practiceForm.getUserEmailInput().sendKeys("Veljko@vmail.com");
        actions.moveToElement(practiceForm.getGenderRadio1Input()).click().build().perform();
        practiceForm.getUserNumberInput().sendKeys("0691234567");
        for (int i=1; i<11; i++) practiceForm.getDateOfBirthInput().sendKeys(Keys.BACK_SPACE);
        practiceForm.getDateOfBirthInput().sendKeys("09/25/2013");
        for (int i=1; i<11; i++) practiceForm.getDateOfBirthInput().sendKeys(Keys.ARROW_LEFT);
        practiceForm.getDateOfBirthInput().sendKeys(Keys.BACK_SPACE);
        practiceForm.getDateOfBirthInput().sendKeys(Keys.ENTER);
        practiceForm.getSubjectInput().sendKeys("English");
        practiceForm.getSubjectInput().sendKeys(Keys.TAB);
        practiceForm.getSubjectInput().sendKeys("Hindi");
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        actions.moveToElement(practiceForm.getCheckBoxSports()).click().build().perform();
        actions.moveToElement(practiceForm.getCheckBoxMusic()).click().build().perform();
        practiceForm.getuploadPictureInput().sendKeys("C:\\Users\\Mikica\\IdeaProjects\\Demoqa_Full_Test\\src\\resources\\Capture.PNG");
        practiceForm.getCurrentAddressInput().sendKeys("Nikole Tesle 12");
        practiceForm.getSelectState().sendKeys("NCR\n");
        practiceForm.getSelectCity().sendKeys("Noida\n");
        practiceForm.getSubmitButton().submit();
        try {wdwait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("tr")));}
        catch (Exception e){
            System.out.println("No Table rows");
        }
        Assert.assertFalse(practiceForm.tableRowsExist());

    }
}