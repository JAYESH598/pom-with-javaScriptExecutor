package com.qa.dw.box;
import org.testng.annotations.Test;

public class DarwinBoxtest {
	@Test(priority=1)
	public static void Test1() {
		
		BaseDWbox.baseBrowser();
		System.out.println("browser launch");
	}
	@Test(priority=2)
	 public static void Test2() {
		 DarwinBox.enterUsername();
		 
		 System.out.println("value");
	 }
	@Test(priority=3)
	 public static void closeBoswe() throws Throwable{
		 
		 BaseDWbox.closeBrowser();
		 System.out.println("utton was clicked");
		 
	 }

}
