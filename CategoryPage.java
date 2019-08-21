package com.kavuri.IkmanPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage extends CommandRepository {
	
By category=By.xpath("//*[@id=\"app-wrapper\"]/div/div[1]/div/div/div[2]/div[1]/div/div/div[2]/div[2]/div/div[2]/button");
	
	public void categoryClick(WebDriver browser) {
		// TODO Auto-generated method stub
		click(browser,category);
		
		
	}


}
