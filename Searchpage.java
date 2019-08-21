package com.kavuri.IkmanPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Searchpage extends CommandRepository {

	
	By srch=By.id("input_2");
	By Adds_btn=By.xpath("//span[text()='All ads' and contains(@class, 'hide-for-inactive')]");
	//By Search_btn=By.xpath("//button[text()='Search']");

	
	public void searchfunction(WebDriver browser,String url) {
		// TODO Auto-generated method stub
		openApplication(browser, url);
		click(browser,Adds_btn);
	//	type(browser,srch,srchValue);
	//	click(browser,Search_btn);
	   browser.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		
		
		
	}

}
