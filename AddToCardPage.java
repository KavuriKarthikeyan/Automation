package com.kavuri.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCardPage extends CommandRepository {

	By srch=By.id("msku-sel-1");
	By qtySelect=By.id("qtyTextBox");
	By Cart_btn=By.id("isCartBtn_btn");
	//isCartBtn_btn


	public void addItem(WebDriver browser,String colorValue) {
		// TODO Auto-generated method stub
		choose(browser,srch,colorValue);
		click(browser,Cart_btn);
		
		
	}


	public void addItem1(WebDriver browser, int srchVal) {
		// TODO Auto-generated method stub
		type(browser,qtySelect,srchVal);
		
	}
}
