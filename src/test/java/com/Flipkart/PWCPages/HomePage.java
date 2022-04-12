package com.Flipkart.PWCPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Flipkart.BasePage.Basepage;

public class HomePage extends Basepage {
	
	public  HomePage() {
		PageFactory.initElements(driver, this);
		
		
	}
	

	@FindBy(xpath="//input[@type='text']")
	WebElement SearchBox;
	
	public SearchResult EnterItemtoSearch() {
		
		SearchBox.click();
		SearchBox.sendKeys("Iphone13");
		SearchBox.sendKeys(Keys.ENTER);
		
		
		
	
		return new SearchResult();
	}
	
	
	

}
