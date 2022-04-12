package com.Flipkart.BasePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Basepage {
	
	public static WebDriver driver;
	public static Properties config;
	
	public Basepage() {
		config=new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\config.properties");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			config.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void initialization() {
		if (driver == null) {
			if (config.getProperty("browser").equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();

			}

			if (config.getProperty("browser").equals("Edge")) {
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}

			if (config.getProperty("browser").equals("IE")) {
				WebDriverManager.iedriver().setup();
				driver=new InternetExplorerDriver();

			}
			
			driver.get(config.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
		}
	}
	

}
