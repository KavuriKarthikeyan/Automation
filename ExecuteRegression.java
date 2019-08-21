package com.kavuri.ebay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ExecuteRegression {
	//ExtentReports rep=ExtentManager.getInstance();
	
	//https://www.ebay.com/
	
	   SearchPage search=new SearchPage();
	   MobilePage mobile=new MobilePage();
	   AddToCardPage add=new AddToCardPage();
	   SavePage save=new SavePage();
	   
	   WebDriver browser;
	   
	   @BeforeMethod
	   public void OpenBrowsetr() {
		   System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		    browser=new ChromeDriver();
	   }
	   
	   
	   @Test(dataProvider="getData")
	   public void Searchapplication(String url , String srchValue, String srchValue1,int srchVal) {
		  // search.searchfunction(browser,url,srchValue);
		   search.searchfunction(browser, url, srchValue);
		   mobile.mobileClick(browser);
		   add.addItem(browser,srchValue1);
		   add.addItem1(browser,srchVal);
		   save.saveItem(browser);
		   save.Checkout(browser);
		   
	   }
	   
	  
	   
	   
	   @DataProvider
	   public Object[][] getData(){
		   return new Object[][] {
				new Object[] {"https://www.ebay.com/","Mobile","Black",6},
				//new Object[] {"https://www.ebay.com/","Mobile","Blue"},
				//new Object[] {"https://www.ebay.com/","Mobile","Gold"}
			 };
			 }
	  
	  
	   
	   @AfterMethod
	   public void Closebrowser() {
		browser.close();
	  }

}

