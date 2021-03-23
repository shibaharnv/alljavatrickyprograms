import org.apache.http.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class SeleniumTest {
    WebDriver driver;
    @BeforeTest

    public void setUp() {

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//src//test//resources//drivers//chromedriver.exe");
        this.driver =new ChromeDriver();
    }


    @Test

    //.	How do you check an option is present in a dropdown or not? *New
    public void registrationPage() throws InterruptedException, IOException {

        this.driver.get("https://www.saucedemo.com/inventory.html");




        Select dropdown = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));

        List<WebElement> allOptions = dropdown.getOptions();

        System.out.println(allOptions.get(1).getText());

        Boolean valuepresent = false;

        for(int i=0; i<allOptions.size(); i++) {

            if(allOptions.get(i).getText().equalsIgnoreCase(("Name (A to Z)"))) {
                valuepresent=true;
                break;
            }


        }
        if(valuepresent) {
            System.out.println("Value exists");
        }


        WebDriver driver = new ChromeDriver();

        RemoteWebDriver robj = (RemoteWebDriver)driver;
        //TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
        File screenshot = robj.getScreenshotAs(OutputType.FILE);


    }


    @Test
    public void isEnabled() throws InterruptedException, IOException {

        this.driver.get("https://ark.intel.com/content/www/us/en/ark/products/series/123588/intel-core-x-series-processors.html");
          Boolean test=  driver.findElement(By.xpath("//a[@class='none disabled ark-accessible-color']")).isEnabled();

          if(test=true)
          {
              System.out.println("Test passed");
          }

//if the attribute contains disabled

        WebElement webElement = driver.findElement(By.xpath("//a[@class='none disabled ark-accessible-color']"));
        if(!webElement.getAttribute("class").contains("disabled")){
            webElement.click();
        }


        // is displayed

        Boolean testing=  driver.findElement(By.xpath("//a[@class='none disabled ark-accessible-color']")).isDisplayed();

        if(testing=true)
        {
            System.out.println("Test passed");
        }


        WebElement mywebelement = driver.findElement(By.xpath("//a[@class='none disabled ark-accessible-color']"));



        System.out.println("size element" +mywebelement);

        WebElement visibleElement = ExpectedConditions.visibilityOf(mywebelement).apply(driver);

        System.out.println(ExpectedConditions.elementToBeClickable(mywebelement).apply(driver));


        try {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.elementToBeClickable(mywebelement));

        }

        catch (Exception e)
        {

        }


    }

    public void isClickable(WebElement webe)
    {       String isenabledstatus="";
        try
        {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.elementToBeClickable(webe));
            isenabledstatus="true";
        }
        catch (Exception e)
        {
            isenabledstatus="false";
        }

        if(isenabledstatus.equalsIgnoreCase("true"))
        {
            System.out.println("Element displayed");
        }
    }




    //System.out.println(isClickable(mywebelement));




    @Test(priority = 1)
    public void listElementtest()
    {
        driver.get("http://demo.guru99.com/test/ajax.html");
        List<WebElement> elements = driver.findElements(By.name("name"));
        System.out.println("Number of elements:" +elements.size());

        if(elements.size()>1)
        {
            System.out.println("List contains more than one webelement");
        }
        else
        {
            System.out.println("List contains only one webelement");
        }


        Actions actions = new Actions(driver);
        WebElement menu = driver.findElement(By.xpath("//htmltag[@attribute='value']"));
        actions.moveToElement(menu);

    }

    @Test(priority = 1)
    public void googleSearch()
    {
        driver.get("https://www.google.co.in/");

        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Global");

        List<WebElement> suggestions = driver.findElements(By.xpath("//div[@role='option']"));

        System.out.println("Number of elements:" +suggestions.size());

            int count =0;

        for(int i=0;i<suggestions.size();i++)
        {
            if(suggestions.get(i).getText().contains("Global"))
            {
                count=count+1;
            }

        }
        System.out.println(count + "Global suggestions ares shown ");

    }



    @Test(priority = 1)
    public void zoomtest() {
        driver.get("https://zoom.us/");

        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()='Plans & Pricing']")))).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@data-link-label=\"Pro - Buy Now\"]")))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[contains(@class, 'zm-button__slot') and text() = ' Save & Continue ']")))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[contains(@class, 'zm-button__slot') and text() = ' No, thanks ']")))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[contains(@class, 'zm-button__slot') and text() = ' Skip This Step ']")))).click();

        Boolean isElementPresent = driver.findElements(By.xpath("//div[@class='zm-select-input']")).size() > 0;

        if (isElementPresent) {


            WebElement monthdropdownelement = driver.findElement(By.xpath("//*[contains(@class,\"zm-select-span__inner is-placeholder\") and contains(@aria-label,'month')]"));

            monthdropdownelement.click();

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='select-item-select-0-2']")))).click();

            WebElement daydropdownelement = driver.findElement(By.xpath("//*[contains(@class,\"zm-select-span__inner is-placeholder\") and contains(@aria-label,'day')]"));
            daydropdownelement.click();

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='select-item-select-1-3']")))).click();

            WebElement yeardropdownelement = driver.findElement(By.xpath("//*[contains(@class,\"zm-select-span__inner is-placeholder\") and contains(@aria-label,'year')]"));

            yeardropdownelement.click();

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='select-item-select-2-4']")))).click();

            driver.manage().window().maximize();

            WebElement continuebuttonelement = driver.findElement(By.xpath("//span[@class='zm-button__slot' and contains(text(), ' Continue ')]"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", continuebuttonelement);
            jsClick(continuebuttonelement);
            createAccount();

        } else {
            createAccount();
        }
    }

            public void createAccount() {

                driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("test");
                driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("last test");
                driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testmail@gmail.com");
                driver.findElement(By.xpath("//input[@id='confirmEmail']")).sendKeys("testmail@gmail.com");
                driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Shibahar@1");
                driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("Shibahar@1");
                driver.findElement(By.xpath("//button[@class='zm-button--primary zm-button--large zm-button']")).click();

            }


            public void jsClick(WebElement element)
            {
                JavascriptExecutor executor = (JavascriptExecutor)driver;
                executor.executeScript("arguments[0].click();", element);
            }



            @Test
            public void interfaceTest()
            {

            }


    }







    /*    for (int i=0; i<elements.size();i++){
        System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
        }*/