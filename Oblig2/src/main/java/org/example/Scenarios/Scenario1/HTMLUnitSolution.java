package org.example.Scenarios.Scenario1;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlDivision;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.apache.hadoop.yarn.webapp.view.Html;
import org.jsoup.select.Elements;

import javax.swing.text.html.HTML;
import java.io.IOException;
import java.util.List;

public class HTMLUnitSolution {

    private static final String url = "https://www.euronews.com/";

    public static void Solution() throws IOException {
        WebClient webClient = new WebClient();
        webClient.getOptions().setUseInsecureSSL(true);
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setJavaScriptEnabled(false);

        HtmlPage page = webClient.getPage(url);

        System.out.println("--------------------------------------------------------");
        List<HtmlElement> titles = (List<HtmlElement>) page.getByXPath("//h3[@class='m-object__title qa-article-title']");
        List<HtmlElement> links = (List<HtmlElement>) page.getByXPath("//a[@class='m-object__title__link   ']");
        List<HtmlElement> imageLinks = (List<HtmlElement>) page.getByXPath("//img[@class='m-img']");

        for (int i = 0; i < titles.size(); i++) {
            System.out.println("Title: " + titles.get(i).getTextContent());
            System.out.println("Link to article: " + links.get(i).getAttribute("href"));
            System.out.println("Link to image of article: " + imageLinks.get(i).getAttribute("src"));


            System.out.println();
        }



        //Elements titles = document.getElementsByClass("m-object__title__link");     //Getting all elements containing the titles of the news articles
        //Elements postsLinks = document.getElementsByClass("m-object__title__link"); //Getting all elements containing the links to the news articles
        //Elements imageLinks = document.getElementsByClass("m-img");
    }


    public static void main(String[] args) throws IOException {

    Solution();
    }





}
/*

WebClient webClient = new WebClient();

// navigate to the web page
HtmlPage page = webClient.getPage("http://example.com");

// find the div element by its ID
HtmlDivision div = page.getHtmlElementById("myDiv");

// get all the attributes of the div element
Map<String, String> attributes = div.getAttributesMap();

// print all the attributes of the div element
for (Map.Entry<String, String> entry : attributes.entrySet()) {
    String name = entry.getKey();
    String value = entry.getValue();
    System.out.println(name + " = " + value);
}
 */