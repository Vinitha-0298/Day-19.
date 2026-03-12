package Sampletest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadriven {
   WebDriver driver;
	@DataProvider(name="urls")
	public Object[][] Listofdata(){
		return new Object[][] {
			{"https://www.saucedemo.com/"},
			{"https://www.tutorialspoint.com/selenium/practice/text-box.php"},
			{"https://qa-practice.netlify.app/checkboxes"}
		};
	}
	@Test(dataProvider = "urls" )
	public void openWebSites(String url) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(2000);
		System.out.println("Websites opened: "+url);
		driver.quit();
	}
}
