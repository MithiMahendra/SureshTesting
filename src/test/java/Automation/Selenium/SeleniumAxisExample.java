package Automation.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumAxisExample extends IDExample{

	@Test
	public void axisExample() {
		int a[];
		String[] str;
		//Collections
		//List
		//Set
		//for(initialization;condition;increment/decrement)
		List<WebElement> elements= driver.findElements(By.xpath("//table[@id='product']//tbody//tr[2]//td"));
		for(int i=0;i<elements.size();i++) {
			String text = elements.get(i).getText();
			//Assertions
			Assert.assertEquals(text, "Rahul Shetty");
					}
	}
}
