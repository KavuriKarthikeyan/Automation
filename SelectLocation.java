package com.kavuri.IkmanPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectLocation extends CommandRepository {

	
By location=By.xpath("//*[@id=\"app-wrapper\"]/div/div[1]/div/div/div[2]/div[1]/div/div/div[2]/div[1]/div/button");
//By sublocation=By.xpath("");


	public void locationClick(WebDriver browser) {
		// TODO Auto-generated method stub
		click(browser,location);
		//click(browser,sublocation);
		
		
	}
}
