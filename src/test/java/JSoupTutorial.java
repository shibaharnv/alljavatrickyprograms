/*
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;

public class JSoupTutorial {

*/
/*
    WebDriver driver;

    @BeforeTest
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src//test//resources//drivers//chromedriver.exe");
        this.driver = new ChromeDriver();
    }
*//*

Document document;

    @Test

    //.	How do you check an option is present in a dropdown or not? *New
    public void scanItems() throws InterruptedException, IOException {

        //this.driver.get("https://www.revengeofficial.com/");

        final String URL = "https://www.revengeofficial.com";
        System.setProperty("https.proxyHost", "proxy-chain.intel.com");
        System.setProperty("https.proxyPort", "912");
        System.setProperty("http.proxyPort", "911");

        HashMap<String, String> items = new HashMap<>();



        try {

            // document = Jsoup.connect("https://www.revengeofficial.com").get();

            document = Jsoup.connect(URL).get();


        } catch (IOException ignored) {
            System.out.println("Could not scan the items");
            return;
        }


        Elements elements = document.getElementsByClass("grid-view-item__link grid-view-item__image-container full-width-link");

        for (Element element : elements) {

            String link = element.attributes().get("href");

            System.out.println(link);

        }
    }

        @Test
        public void priceMethod(){
        Elements elementss =document.getElementsByClass("price-item price-item--regular");

        for (Element elementnew : elementss) {

            String elementnewtext = elementnew.text();

            System.out.println(elementnewtext);

        }

        }


    }

}*/