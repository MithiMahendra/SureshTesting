package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClassExamplePage {
	public WebDriver driver;
	public WebDriverWait wait;
	public ClassExamplePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, driver);
	}
	public By radioButton1 = By.className("radioButton");
	public By countryInput = By.className("ui-autocomplete-input");

}
