package Automation.Selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class XpathExample extends IDExample{
	@Test
	public void xpathXample() {
		//standard xpath
			driver.findElement(By.xpath("//input[@value='radio2']")).click();
			//xpath with text
			String text = driver.findElement(By.xpath("//button[contains(text(),'Home')]")).getText();
			System.out.println(text);
			//index xpath
			driver.findElement(By.xpath("(//input[@name='radioButton'])[1]")).click();
			
			
	}

}
