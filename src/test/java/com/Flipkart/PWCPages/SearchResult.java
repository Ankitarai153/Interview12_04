package com.Flipkart.PWCPages;

import org.openqa.selenium.support.PageFactory;

import com.Flipkart.BasePage.Basepage;

public class SearchResult extends Basepage {
	public  SearchResult() {
		PageFactory.initElements(driver, this);
		
		
	}
}
