package com.kavuri.IkmanPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MobilePage extends CommandRepository{

	
	By firstMobile=By.xpath("//*[@id=\"app-wrapper\"]/div/div[1]/div/div/div[2]/div[3]/div/div/div[2]/div[1]/ul/li[1]");
//By firstMobile=By.xpath("//button[text()='Select Category']/following::li[@class='top-ads-container--1Jeoq gtm-top-ad'][1]");
	
	public void mobileClick(WebDriver browser) {
		// TODO Auto-generated method stub
		   browser.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		   click(browser,firstMobile);
	}
	
}
