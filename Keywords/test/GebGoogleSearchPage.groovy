package test

import org.openqa.selenium.Keys

import geb.Page

public class GebGoogleSearchPage extends Page {
	
    static url = "https://www.google.com"
	
    static content = {
        searchField { $("[name=q]") }
    }

    void searchFor(String text) {
		searchField << text
        searchField << Keys.ENTER
    }
}
