/*package com.kavuri.IkmanPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ikman {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ikman.lk/");
		driver.findElement(By.xpath("//span[text()='All ads' and contains(@class, 'hide-for-inactive')]"));
		driver.findElement(By.id("input_2")).sendKeys("Mobile");
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		driver.findElement(By.xpath("//span[text()='\"Mobile\" ']/following::li[1]/a/div/div/img")).click();
	}

}


////*[@id="app-wrapper"]/div/div[1]/div[3]/div/div[2]/div[2]/div/div/div[2]/div[1]/ul/li[1]/a

*/