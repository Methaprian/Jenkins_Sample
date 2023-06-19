package github_Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import github_sample.BaseClass;

public class SampleTest extends BaseClass{

	@Test
	public void sampleTest() throws AWTException {
		
		driver.get("https://www.mictests.com");
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("mic-launcher"))));
		driver.findElement(By.id("mic-launcher")).click();
		Robot rbt=new Robot();
		rbt.keyPress(KeyEvent.VK_TAB);
		rbt.keyRelease(KeyEvent.VK_TAB);
		rbt.keyPress(KeyEvent.VK_TAB);
		rbt.keyRelease(KeyEvent.VK_TAB);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		
		wait.until(ExpectedConditions.visibilityOf
				(driver.findElement(By.xpath("//li[contains(text(),'Testing was completed successfully and it seems your microphone works properly.')]"))));
	}
}
