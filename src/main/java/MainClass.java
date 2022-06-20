import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager wdm = new ChromeDriverManager();
        wdm.setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("svg")));
        List<WebElement> h5s = driver.findElements(By.tagName("svg"));
        for (WebElement h5:h5s) System.out.println(h5);
        //Actions action = new Actions(driver);
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        //Thread.sleep(1000);
        h5s.get(2).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("left-pannel")));
        driver.findElement(By.className("left-pannel")).click();
        //driver.findElement(By.name("Elements")).click(); //No such element
    }
}
