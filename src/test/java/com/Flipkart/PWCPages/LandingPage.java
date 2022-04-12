package com.Flipkart.PWCPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Flipkart.BasePage.Basepage;

public class LandingPage extends Basepage {

	
	public  LandingPage() {
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement Username;
	
	
	@FindBy(xpath="//input[@type='password']")
	WebElement Password;
	
	
	@FindBy(xpath="(//span[text()='Login'])[2]")
	//(//button[@type='submit'])[2]
	WebElement LoginClick;
	
	@FindBy(xpath="//span[text()='Login']/../../../../../button")
	//(//button[@type='submit'])[2]
	WebElement CrossIcon;
	

	
	public HomePage EnterCredentials(String username,String password) throws InterruptedException {
		
		Username.sendKeys(username);
		Password.sendKeys(password);
		LoginClick.click();
		//driver.close();
		CrossIcon.click();
		Thread.sleep(5);
		return new HomePage();
	}

}
