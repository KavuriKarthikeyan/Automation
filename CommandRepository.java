package com.kavuri.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommandRepository {
	
	public void openApplication(WebDriver browser,String url) {
		browser.get(url);
	}
	public void type(WebDriver browser,By element,String value) {
		browser.findElement(element).sendKeys(value);
	}
	public void type(WebDriver browser,By element,int value) {
		browser.findElement(element).sendKeys(String.valueOf(value));
	}
	public void choose(WebDriver browser,By element,String value) {
		browser.findElement(element).sendKeys(value);
	}
	
	public void click(WebDriver browser,By element) {
		 browser.findElement(element).click();
	}
	
}
