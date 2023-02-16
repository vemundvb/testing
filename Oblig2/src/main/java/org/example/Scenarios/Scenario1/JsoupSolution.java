package org.example.Scenarios.Scenario1;

import org.jsoup.nodes.Document;
import org.jsoup.*;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class JsoupSolution {
    public static void Solution() throws IOException {
        //Getting the HTML document from the website
        Document document = Jsoup.connect("https://www.euronews.com/").get();

        Elements titles = document.getElementsByClass("m-object__title qa-article-title");     //Getting all elements containing the titles of the news articles
        Elements postsLinks = document.getElementsByClass("m-object__title__link"); //Getting all elements containing the links to the news articles
        Elements imageLinks = document.getElementsByClass("m-img");                 //Getting all the elements containing the links to the images of the news articles


        
        //Iterating over all the elements, in order to extract the values of each individual element
        for (int i = 0; i < imageLinks.toArray().length; i++) {
            System.out.println("Title: " + titles.get(i).text());            //Extracting the attribute of the element containing the title
            System.out.println("Link to post: " + postsLinks.get(i).attr("href"));  //Extracting the attribute of the element containing the link to the post
            System.out.println("Link to image: " + imageLinks.get(i).attr("src"));  //Extracting the attribute of the element containing the link to the image

            System.out.println();

        }
    }


    public static void main(String[] args) throws IOException {
        JsoupSolution.Solution();
    }




}
