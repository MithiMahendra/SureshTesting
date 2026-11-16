package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reusable {
	
	public WebDriver driver;
	public WebDriverWait wait;
	public Reusable(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, driver);
		
	}
	
	public void clickOnElement(By locator) {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		driver.findElement(locator).click();
	}
	public void enterText(By locator,String text) {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		driver.findElement(locator).sendKeys(text);
	}

}
