package Automation.Selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageObjects.ClassExamplePage;
import pageObjects.Reusable;

public class ClassExample extends IDExample {
	@Test
	public void classExample() throws InterruptedException {
		System.out.println("**********************Executing scenario*******************************");
		Reusable reuse = new Reusable(driver);
		ClassExamplePage classPage = new ClassExamplePage(driver);
		reuse.clickOnElement(classPage.radioButton1);
		reuse.enterText(classPage.countryInput,"India");
		
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
	@Test
	public void git_status() throws InterruptedException {
		System.out.println("**********************status scenario*******************************");
		System.out.print("exclude");
		
	}

}
