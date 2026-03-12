package Sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicSndT{
	    WebDriver driver;
		@Test
		public void openBrowser() throws InterruptedException {
	       driver = new ChromeDriver();
		   driver.get("https://www.saucedemo.com/");
		   Thread.sleep(1000);
			System.out.println("Browser opened");
		}
		@Test(dependsOnMethods = "openBrowser")
		public void loginTest() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.id("login-button")).click();
		System.out.println("Login Test executed");
		}

		@Test(dependsOnMethods = "loginTest")
		public void closeBrowser() throws InterruptedException{
			Thread.sleep(1000);
			driver.quit();
			System.out.println("Browser Closed");
		}
}
