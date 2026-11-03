package Automation.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchFB {
	//Annotations
	@Test
	public void launchFacebook() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@aria-label='Create new account']")).click();
		Thread.sleep(5000);
		boolean surname = driver.findElement(By.xpath("//label[text()='Surname']")).isDisplayed();
		if(surname) {
			System.out.println("Surname field is displayed "+surname);
		}
		else {
			System.out.println("Surname field is not displayed "+surname);
		}
		
		
		
	}

}
