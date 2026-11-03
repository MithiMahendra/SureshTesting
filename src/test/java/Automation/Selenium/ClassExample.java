package Automation.Selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ClassExample extends IDExample {
	@Test
	public void classExample() throws InterruptedException {
		System.out.println("**********************Executing scenario*******************************");
		driver.findElement(By.className("radioButton")).click();
		driver.findElement(By.className("ui-autocomplete-input")).sendKeys("India");
		Thread.sleep(5000);
		
	}
	@Test
	public void include() throws InterruptedException {
		System.out.println("**********************Executing scenario*******************************");
		System.out.print("include");
		
	}
	@Test
	public void exclude() throws InterruptedException {
		System.out.println("**********************Executing scenario*******************************");
		System.out.print("exclude");
		
	}

}
