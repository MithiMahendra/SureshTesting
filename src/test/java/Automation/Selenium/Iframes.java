package Automation.Selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Iframes extends IDExample{
	@Test
	public void iFrame() {
				driver.switchTo().frame("courses-iframe");
				driver.findElement(By.xpath("//a[text()='Courses']")).click();
				}

}
