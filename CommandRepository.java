package com.kavuri.IkmanPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommandRepository {
	public void openApplication(WebDriver browser,String url) {
		browser.get(url);
	}
	
	/*public void click1(WebDriver browser,By element) {
		 browser.findElement(element).click();
	}*/
	
	public void type(WebDriver browser,By element,String value) {
		browser.findElement(element).sendKeys(value);
	}
	
	
	public void click(WebDriver browser,By element) {
		 browser.findElement(element).click();
	}
	
	
	/*public void click2(WebDriver browser,By element) {
		 browser.findElement(element).click();
	}*/
	
	
	/*public void pause(WebDriver browser,Integer value) {
		browser.manage().timeouts().implicitlyWait(value, TimeUnit.SECONDS);
	}*/
}


////*[@id="app-wrapper"]/div/div[1]/div[3]/div/div[2]/div[2]/div/div/div[2]/div[1]/ul/li[1]