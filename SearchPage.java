package com.kavuri.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends CommandRepository {

	By srch=By.id("gh-ac");
	By Search_btn=By.id("gh-btn");
	
	
	public void searchfunction(WebDriver browser, String url, String srchValue) {
		// TODO Auto-generated method stub
		openApplication(browser, url);
		type(browser,srch,srchValue);
		click(browser,Search_btn);
		
	}

}
