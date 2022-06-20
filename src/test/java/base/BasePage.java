package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    String url = "https://demoqa.com/";
    public WebDriverManager wdm;
    public WebDriver driver;
    public WebDriverWait wdwait;


}
