package Automation.Selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageObjects.IDExamPage;
import pageObjects.Reusable;

public class IDExam extends IDExample{
	@Test
	public void launchrahul() {
		System.out.println("**********************Executing scenario*******************************");
		Reusable reuse = new Reusable(driver);
		IDExamPage idExamPage = new IDExamPage(driver);
		reuse.clickOnElement(idExamPage.checkBox1);
		reuse.clickOnElement(idExamPage.checkBox2);
		reuse.clickOnElement(idExamPage.checkBox3);
		reuse.enterText(idExamPage.textInput, "Mahendra");
		reuse.clickOnElement(idExamPage.confirmButton);
		driver.switchTo().alert().accept();
	}
}
