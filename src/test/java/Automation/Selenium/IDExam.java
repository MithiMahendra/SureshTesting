package Automation.Selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class IDExam extends IDExample{
	@Test
	public void launchrahul() {
		System.out.println("**********************Executing scenario*******************************");
	driver.findElement(By.id("checkBoxOption1")).click();
	driver.findElement(By.id("checkBoxOption2")).click();
	driver.findElement(By.id("checkBoxOption3")).click();
	driver.findElement(By.id("name")).sendKeys("Mahendra");
	driver.findElement(By.id("confirmbtn")).click();
	driver.switchTo().alert().accept();
	}
}
