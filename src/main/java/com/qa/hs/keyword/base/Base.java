package com.qa.hs.keyword.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * 
 * @author NaveenKhunteta
 *
 */
public class Base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver init_driver(String browserName){
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
			if(prop.getProperty("headless").equals("yes")){
				//headless mode:
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless");
				driver = new ChromeDriver(options);
			}else{
				driver = new ChromeDriver();
			}
		} else if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "/Users/NaveenKhunteta/Downloads/geckodriver");
			driver = new FirefoxDriver();
		}
		return driver;
	}
	
	public Properties init_properties(){
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("/Users/NaveenKhunteta/Documents/workspace/KeywordDrivenHubSpot"
					+ "/src/main/java/com/qa/hs/keyword/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
	
	
	
	

}
