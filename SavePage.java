package com.kavuri.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SavePage extends CommandRepository {
	By save=By.xpath("//button[@class='faux-link' and @data-test-id='cart-to-sfl']");
    By checkout=By.xpath("//button[@class='call-to-action btn btn--large btn--primary' and @data-test-id='cta-top']");
	public void saveItem(WebDriver browser) {
		// TODO Auto-generated method stub
		click(browser,save);
		
	}
	
	public void Checkout(WebDriver browser) {
		// TODO Auto-generated method stub
		click(browser,checkout);
		
	}

	

}
