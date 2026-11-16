package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IDExamPage {
	public WebDriver driver;
	public WebDriverWait wait;
	public IDExamPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, driver);
	}
	public By checkBox1 = By.id("checkBoxOption1");
	public By checkBox2 = By.id("checkBoxOption1");
	public By checkBox3 = By.id("checkBoxOption1");
	public By textInput = By.id("name");
	public By confirmButton = By.id("confirmbtn");
}
