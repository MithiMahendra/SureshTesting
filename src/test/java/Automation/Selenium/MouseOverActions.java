package Automation.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MouseOverActions extends IDExample{
@Test
public void mouseActions() throws InterruptedException {
	Actions action = new Actions(driver);
	WebElement mainWindow = driver.findElement(By.id("mousehover"));
	WebElement childWindow = driver.findElement(By.xpath("//a[text()='Reload']"));
	//Waits//Synchronization
	//Implicit wait , explicit wait and fluent wait
	WebDriverWait waits = new WebDriverWait(driver,Duration.ofSeconds(10));
	waits.until(ExpectedConditions.visibilityOf(mainWindow));
	action.moveToElement(mainWindow).moveToElement(childWindow).click().build().perform();
	Thread.sleep(3000);
}
}
