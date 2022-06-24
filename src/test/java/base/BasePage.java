package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.Elements;
import pages.Forms;
import pages.HomePage;
import pages.elementsPages.CheckBox;
import pages.elementsPages.RadioButton;
import pages.elementsPages.Text_Box;
import pages.formsPages.PracticeForm;

import java.time.Duration;

public class BasePage {
    public String url = "https://demoqa.com/";
    public WebDriverManager wdm;
    public WebDriver driver;
    public WebDriverWait wdwait;
    public Actions actions;
    public HomePage homePage;
    public Elements elements;
    public Text_Box text_box;
    public CheckBox checkBox;
    public RadioButton radioButton;
    public Forms forms;
    public PracticeForm practiceForm;



    @BeforeClass
    public void setUp() {
        wdm = new ChromeDriverManager();
        wdm.setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        actions = new Actions(driver);
        homePage = new HomePage(driver, wdwait);
        elements = new Elements(driver, wdwait);
        text_box = new Text_Box(driver, wdwait);
        checkBox = new CheckBox(driver, wdwait);
        radioButton = new RadioButton(driver, wdwait);
        forms = new Forms(driver, wdwait);
        practiceForm = new PracticeForm(driver, wdwait);
        //System.out.println(driver);

    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

}
