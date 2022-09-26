package com.demo.Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\cgijasel44\\Desktop\\chromedriver.exe");
		//open browser
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.demo.guru99.com/test/delete_customer.php/");
		// typing and redirecting to given url
		driver.manage().window().maximize();
		driver.findElement(By.name("cusid")).sendKeys("101");
		driver.findElement(By.name("submit")).submit();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		
	}

}
