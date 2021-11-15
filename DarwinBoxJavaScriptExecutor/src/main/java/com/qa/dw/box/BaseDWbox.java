package com.qa.dw.box;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDWbox extends DarwinBoxWebElementsPropertiespage{
	
	
		public static WebDriver  driver;
		/*public static DarwinBox db;*/
		
		public static void baseBrowser() {
			
			WebDriverManager.chromedriver().setup();
			/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\jv20273\\eclipse-workspace\\Selenium 11-NOV-2021\\"
					+ "DarwinBoxJavaScriptExecutor\\Chrom\\chromedriver.exe");*/
			
			driver = new ChromeDriver();
			//db = new DarwinBox();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			
			driver.get("https://ojasit.darwinbox.com/user/login");
			driver.manage().deleteAllCookies();
			
			
		}
		
		/*public static void DarwinBoxj() {
			db = new DarwinBox();
		}*/
		public static void closeBrowser() throws Exception {
			Thread.sleep(2000);
			driver.close();
		}

	}

