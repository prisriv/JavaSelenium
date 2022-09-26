package com.demo.Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class SwagLabsTest {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//points to google chrome browser, add chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\cgijasel44\\Desktop\\chromedriver.exe");
		//open browser
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		// typing and redirecting to given url
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("user-name")); 
		WebElement password=driver.findElement(By.id("password")); 
		WebElement loginbtn=driver.findElement(By.id("login-button")); 
		//or driver.findElement(By.id(“user-name”)).sendKeys(“standard_user”);	 
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce"); 
		loginbtn.click();
		Thread.sleep(2000);
		//WebElement dropdown= driver.findElement(By.className("bm-icon"));
		WebElement addproduct= driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		Actions actions=new Actions(driver);
		//Action mousemovement=actions.moveToElement(dropdown).click().build();
		//mousemovement.perform();
		Action addtocart=actions.moveToElement(addproduct).click().build();
		addtocart.perform();
		driver.findElement(By.className("shopping-cart-link")).click();
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(3000);
		WebElement fname= driver.findElement(By.id("first-name"));
		Action keyEvents= actions.moveToElement(fname).keyDown(Keys.SHIFT).sendKeys("john").keyUp(Keys.SHIFT).build();
		keyEvents.perform();
		Thread.sleep(3000);
		//driver.findElement(By.linkText("LOGOUT")).click();
		
		
		//wait 2 seconds i.e. synchronization wait 
		/*driver.findElement(By.linkText("Sauce Labs Backpack")).click(); 
		Thread.sleep(2000); 
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div[2]/button")).click(); 
		Thread.sleep(3000); 
		driver.findElement(By.xpath("“//button[@id=”add-to-cart-sauce-labs-backpack”]”")).click(); 
		//driver.manager.timeouts().implicitlywait(5,TimeUnit.SECONDS); 
		 
				//driver.close(); */
		driver.close();
	}

}
