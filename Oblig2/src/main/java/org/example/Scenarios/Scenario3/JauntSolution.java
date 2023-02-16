package org.example.Scenarios.Scenario3;


import org.jsoup.nodes.Element;

import com.jaunt.UserAgent;
import com.jaunt.Element;


public class JauntSolution {

    public static void Solution() {


    // create a new user agent
        UserAgent userAgent = new UserAgent();

    // visit the form page
        userAgent.visit("http://example.com/form-page");

    // fill in the form data
        userAgent.doc.getForm(0).set("username", "myusername");
        userAgent.doc.getForm(0).set("password", "mypassword");

    // submit the form
        userAgent.doc.getForm(0).submit();

    // get the response page
        Element response = userAgent.doc.getElement();

    // do something with the response
        System.out.println(response.innerHTML());


    }


    public static void main(String[] args) {
        Solution();
    }

}
