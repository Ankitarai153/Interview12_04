package com.Flipkart.PWCTestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Flipkart.BasePage.Basepage;
import com.Flipkart.PWCPages.HomePage;
import com.Flipkart.PWCPages.LandingPage;
import com.Flipkart.PWCPages.SearchResult;

public class Iphone13PriceTest extends Basepage {
	
	 LandingPage landingPage;
	 HomePage homePage;
	SearchResult searchResult;


	public Iphone13PriceTest() {
		super();
		
	}
	
	@BeforeMethod
	public void setup() {
		super.initialization();
		
	}
	
	@Test
	public void iphone13Pricecheck() throws InterruptedException {
		landingPage=new LandingPage();
		homePage=landingPage.EnterCredentials(config.getProperty("username"), config.getProperty("password"));
		searchResult=homePage.EnterItemtoSearch();
	}
	
	
	@AfterMethod
	public void teardown() {
		
	}

}
