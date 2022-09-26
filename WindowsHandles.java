package com.demo.Automation;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\cgijasel44\\Desktop\\chromedriver.exe");
		//open browser
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		// typing and redirecting to given url
		driver.manage().window().maximize();
		//sdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(2000);
		String mainWindowHandle=driver.getWindowHandle();
		Set<String> allWindowHandles=driver.getWindowHandles();
		Iterator<String> it=allWindowHandles.iterator();
		while(it.hasNext())
		{
			String childWindow=it.next();
			if(!mainWindowHandle.equalsIgnoreCase(childWindow))
			{
				driver.switchTo().window(childWindow);
				WebElement text=driver.findElement(By.id("sampleHeading"));
				System.out.println("Text is: "+text);
			}
			
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
