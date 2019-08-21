package com.kavuri.IkmanPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubLocation extends CommandRepository{
	By sublocation1=By.xpath("/html/body/div[4]/div/div/div/div/div/div/div/div[2]/div/ul/li[1]/button");
	By sublocation2=By.xpath("/html/body/div[4]/div/div/div/div/div/div[2]/div/div[2]/ul/li[2]/button/div/div");

	public void locationClick1(WebDriver browser) {
		// TODO Auto-generated method stub
		click(browser,sublocation1);
		click(browser,sublocation2);
		
		///html/body/div[4]/div/div/div/div/div/div/div/div[2]/div/ul/li[1]/button
		
	}
}
