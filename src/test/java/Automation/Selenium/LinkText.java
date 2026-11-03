package Automation.Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LinkText extends IDExample {
	@Test
	public void linkTextExample() throws InterruptedException {
		System.out.println("**********************Executing scenario*******************************");
		//driver.findElement(By.linkText("🎯 I’ll help you prepare for your next QA job — Explore the QA Career Accelerator.")).click();
		System.out.println(driver.getWindowHandle());

		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.partialLinkText("🎯 I’ll help you prepare for your next QA job")).click();
		Thread.sleep(5000);
		//window handling
		//32
		Set<String> windowHandles =driver.getWindowHandles();
		for(String window:windowHandles) {
			if(!window.equals(parentWindow)){
		driver.switchTo().window(window);
		}
		}
		//waits-explict wait and implicit wait and fluent
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		
		
	
	}
	}
