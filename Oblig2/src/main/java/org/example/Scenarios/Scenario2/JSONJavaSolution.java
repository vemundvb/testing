package org.example.Scenarios.Scenario2;

import org.json.JSONObject;
import org.json.XML;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JSONJavaSolution {


    public static String getHtmlElements() throws IOException {
        Document document = Jsoup.connect("https://www.euronews.com/").get();

        String titles = document.getElementsByClass("m-object__title__link").toString();

        return titles;
    }


    public static void Solution() throws IOException {

        String htmlElements = getHtmlElements();   //Getting all elements containing the titles of the news articles


        JSONObject xmlJSONObj = XML.toJSONObject(htmlElements);
        String jsonPrettyPrintString = xmlJSONObj.toString(4);

        System.out.println(jsonPrettyPrintString);


    }



    public static void main(String[] args) throws IOException {
        Solution();
    }
}
