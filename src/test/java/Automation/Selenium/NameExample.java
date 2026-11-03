package Automation.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NameExample extends IDExample{
	@Test
	public void nameExample() {
		System.out.println("**********************Executing scenario*******************************");
		driver.findElement(By.name("checkBoxOption1")).click();
		driver.findElement(By.name("checkBoxOption2")).click();
		driver.findElement(By.name("checkBoxOption3")).click();
		driver.findElement(By.name("enter-name")).sendKeys("Mahendra");
		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().accept();	
	}

}
