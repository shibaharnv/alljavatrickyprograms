import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SeleniumInterfaceTest {



    @Test
    public void interfaceTest()
    {
       // WebDriver driver = new ChromeDriver();

        ChromeDriver driver = new ChromeDriver();

        driver.getTitle();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES) ;



    }
}