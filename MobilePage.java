package com.kavuri.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MobilePage extends CommandRepository {

	
	By firstMobile=By.xpath("//*[@id=\"srp-river-results-listing1\"]/div/div[2]/a");
	
	public void mobileClick(WebDriver browser) {
		// TODO Auto-generated method stub
		click(browser,firstMobile);
		
		
	}

}
