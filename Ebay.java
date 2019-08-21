package com.kavuri.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Ebay {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.id("gh-ac")).sendKeys("Mobile");
		driver.findElement(By.id("gh-btn")).click();
		driver.findElement(By.xpath("//*[@id=\\\"srp-river-results-listing1\\\"]/div/div[2]/a")).click();
		driver.findElement(By.id("msku-sel-1")).sendKeys("Black");
		driver.findElement(By.id("qtyTextBox")).sendKeys("6");
		driver.findElement(By.id("isCartBtn_btn")).click();
		driver.findElement(By.id("//button[@class='faux-link' and @data-test-id='cart-to-sfl']")).click();
		driver.findElement(By.id("//button[@class='call-to-action btn btn--large btn--primary' and @data-test-id='cta-top']")).click();
		
		
		 
		   String number=driver.findElement(By.id("gh-cart-n")).getText();
		   Assert.assertEquals(number, "1");
		  
}
}

////*[@id="qtySubTxt"] if this xpath value is

//>
//this xpath value
////*[@id="w1-12-_errMsg"]
//true
//else
//false
