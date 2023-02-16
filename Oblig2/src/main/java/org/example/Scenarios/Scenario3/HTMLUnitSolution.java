package org.example.Scenarios.Scenario3;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebRequest;
import com.gargoylesoftware.htmlunit.WebResponse;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class HTMLUnitSolution {

    private static final String userAgent = "Mozilla/5.0 (X11; Linux x86_64; rv:109.0) Gecko/20100101 Firefox/109.0";
    private static final int timeout = 10*1000; //10 seconds



    public static void Solution() throws IOException {


            WebClient webClient = new WebClient();
            webClient.getOptions().setUseInsecureSSL(true);
            webClient.getOptions().setCssEnabled(false);
            webClient.getOptions().setJavaScriptEnabled(false);
            webClient.addRequestHeader("User-Agent", userAgent);
            webClient.getOptions().setTimeout(timeout);


            HtmlPage page1 = webClient.getPage("https://www.amazon.com");

            HtmlForm form = page1.getFormByName("site-search");
            HtmlSubmitInput button = form.getInputByValue("Go");
            HtmlTextInput textField = form.getInputByName("field-keywords");

            textField.type("anime");

            HtmlPage page2 = button.click();


            System.out.println(page2.asXml());
        }










    public static void main(String[] args) throws IOException {
        Solution();
    }

}
