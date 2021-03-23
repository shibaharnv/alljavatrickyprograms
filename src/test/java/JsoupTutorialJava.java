import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JsoupTutorialJava {

    public static final String URL = "https://www.revengeofficial.com";


    HashMap<String, String> items;

    Document document;

    public JsoupTutorialJava()
    {
        items = new HashMap<>();
    }

    public static void main(String args[]) {

        JsoupTutorialJava obj = new JsoupTutorialJava();
        obj.setProxy();
        obj.scanItems();
        obj.print();


    }



    public void scanItems() {
        try {

            document = Jsoup.connect(URL).get();
        } catch (IOException ignored) {
            System.out.println("Could not scan the items");
            return;
        }


        Elements elements = document.getElementsByClass("grid-view-item__link grid-view-item__image-container full-width-link");

        for (Element element : elements) {

            String link = element.attributes().get("href");

            findPrice(link);
        }

    }



    public void findPrice(String link) {
        try {

            document = Jsoup.connect(URL).get();

        } catch (IOException ignored) {

            System.out.println("Could not scan the items");
            return;
        }
        Elements elementss =document.getElementsByClass("price-item price-item--regular");

        for (Element elementnew : elementss) {

            String elementnewtext = elementnew.text();
            System.out.println(elementnewtext);
            items.put(link,elementnewtext);

        }





    }

    void print()
    {
        for (Map.Entry<String, String> stringStringEntry : items.entrySet()) {

         String keystring=   stringStringEntry.getKey();


            String valueString=   stringStringEntry.getValue();

            System.out.println("link :"+keystring);
            System.out.println("value :"+valueString);

        }
    }

    public void setProxy()
    {
        System.setProperty("https.proxyHost", "proxy-chain.intel.com");
        System.setProperty("https.proxyPort", "912");
        System.setProperty("http.proxyPort", "911");
    }
}