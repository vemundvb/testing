package org.example.Scenarios.Scenario3;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import java.util.Map;
import org.jsoup.nodes.Document;
import java.io.IOException;
import org.jsoup.Connection.Response;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.print.Doc;

public class JsoupSolution {

    private static final String userAgent = "Mozilla/5.0 (X11; Linux x86_64; rv:109.0) Gecko/20100101 Firefox/109.0";

    private static int timeout = 10*1000; //10 seconds


    private static void Solution() throws IOException {

        Response response =
                Jsoup.connect("https://www.amazon.com/s/ref=nb_sb_noss_2")
                        .userAgent(userAgent)
                        .timeout(timeout)
                        .method(Connection.Method.GET)
                        .data("field-keywords", "anime")
                        .followRedirects(true)
                        .execute();

        Document doc = response.parse();
        System.out.println(doc);


    }

        public static void main(String[] args) throws IOException {
        Solution();

    }


}
