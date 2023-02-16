package org.example.Scenarios.Scenario2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import org.htmlcleaner.CleanerProperties;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import javax.xml.crypto.Data;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.jsoup.nodes.Document.OutputSettings.Syntax.xml;

public class JacksonSolution {


    public static String getHTMLdocument() throws IOException {

        Document document = Jsoup.connect("https://www.euronews.com/").get();

        return document.toString();

    }


    public static void Solution() throws IOException {
        String htmlDocument = getHTMLdocument();

        HtmlCleaner cleaner = new HtmlCleaner();
        TagNode node = cleaner.clean(htmlDocument);

        System.out.println(node);


    }




    public static void main(String[] args) throws IOException {
        Solution();
    }


}