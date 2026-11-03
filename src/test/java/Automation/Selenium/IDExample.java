package Automation.Selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IDExample {
	public WebDriver driver;
	
	//https://rahulshettyacademy.com/AutomationPractice/
	@BeforeMethod
	public void lanuchChrome() {
		System.out.println("**********************Launching Browser*******************************");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	@BeforeClass
	public void beforeClassExample() {
		System.out.println("************Running before class********");
	}
	@AfterClass
	public void browserClose() {
		driver.close();
	}
	@BeforeTest
	public void beforeTextExample() {
		System.out.println("************Started Test folder Execution*********");
	}
	@AfterTest
	public void afterTestExample() {
		System.out.println("************All test cases executed*********");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("***BeforeSuite****");
	}
	@AfterSuite
	public void afterSuiteExample() {
		System.out.println("**After suite***");
	}

}
