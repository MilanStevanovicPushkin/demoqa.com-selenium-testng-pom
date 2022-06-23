package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.Elements;
import pages.HomePage;
import pages.elementsPages.CheckBox;
import pages.elementsPages.RadioButton;
import pages.elementsPages.Text_Box;

import java.time.Duration;

public class BasePage {
    public String url = "https://demoqa.com/";
    public WebDriverManager wdm;
    public WebDriver driver;
    public WebDriverWait wdwait;
    public HomePage homePage;
    public Elements elements;
    public Text_Box text_box;
    public CheckBox checkBox;
    public RadioButton radioButton;


    @BeforeClass
    public void setUp() {
        wdm = new ChromeDriverManager();
        wdm.setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        homePage = new HomePage(driver, wdwait);
        elements = new Elements(driver, wdwait);
        text_box = new Text_Box(driver, wdwait);
        checkBox = new CheckBox(driver, wdwait);
        radioButton = new RadioButton(driver, wdwait);
        //System.out.println(driver);

    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

}
