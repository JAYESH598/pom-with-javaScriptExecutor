package com.qa.dw.box;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class DarwinBox extends BaseDWbox{
	
	
	 public static void enterUsername() {
		 
		  DarwinBox db = new DarwinBox();
		  
		  
		  WebElement Username = driver.findElement(db.Username1);
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].value='18280';", Username);
		
	 
	 
		
	
		WebElement Password = driver.findElement(db.Password1);
		 JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		 jse1.executeScript("arguments[0].value='LAMBORGHINI@7';",Password );
		 
	 
	 
	
		 
		 WebElement Button = driver.findElement(db.Button1);
		 JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		 jse2.executeScript("arguments[0].click();",Button);
		 
	 
	 }

	
	 }
