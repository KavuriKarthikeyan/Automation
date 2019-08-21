package com.kavuri.IkmanPOM;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExecuteRegression {
   Searchpage search=new Searchpage();
   CategoryPage category=new CategoryPage();
   SubCategory sub=new SubCategory();
   MobilePage mobile=new MobilePage();
   SelectLocation loc=new SelectLocation();
   SubLocation subloc=new SubLocation();
   WebDriver browser;
   
   @BeforeMethod
   public void OpenBrowsetr() {
	   System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	    browser=new ChromeDriver();
   }
   
   
   @Test(dataProvider="getData")
   public void Searchapplication(String url) {
	  search.searchfunction(browser,url);
	 //  search.searchfunction(browser, url, srchValue);
	  // System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	  loc.locationClick(browser);
	   subloc.locationClick1(browser);
	   category.categoryClick(browser);
	   sub.subCategory(browser);
	   mobile.mobileClick(browser);
	  
   }
   
   
   
   @DataProvider
   public Object[][] getData(){
	   return new Object[][] {
			new Object[] {"https://ikman.lk/",}
		 };
		 }
   
   
   @AfterMethod
   public void Closebrowser() {
	 browser.close();
 }
}
