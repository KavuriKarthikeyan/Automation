package com.kavuri.IkmanPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubCategory extends CommandRepository {
	///html/body/div[4]/div/div/div/div/div[1]/div[1]/div/ul/li[2]/button/div

	
	By subCat=By.xpath("/html/body/div[4]/div/div/div/div/div[1]/div[1]/div/ul/li[2]/button/div");
	By Mobile=By.xpath("/html/body/div[4]/div/div/div/div/div[1]/div[2]/div/ul/li[2]/button");
		
		public void subCategory(WebDriver browser) {
			// TODO Auto-generated method stub
		  browser.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
			click(browser,subCat);
			click(browser,Mobile);
		
		}
}
