package github_sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;

	@BeforeClass
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
