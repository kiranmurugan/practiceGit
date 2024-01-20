package stepDefinitions;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;

public class MyAccountLoginStepDefinitions {
	
	WebDriver driver=null;
	
	@Given("Open Browser")
	public void open_browser() {
		ChromeOptions ops= new ChromeOptions();
		ops.addExtensions(new File("./Extensions/5.16.0_0.crx"));
		driver = new ChromeDriver(ops);
		System.setProperty("webdriver.chrome.driver", 
				"C://Users//Murugan Kiran//OneDrive//Desktop//chromedriver.exe/");
		
		driver.manage().window().maximize();
		
		
	   
	    
	}

	@And("Enter the URL\"https:\\/\\/practice.automationtesting.in\\/\"")
	public void enter_the_url_https_practice_automationtesting_in() {
		driver.get("https://practice.automationtesting.in/");
	    
	}

	@And("click on MyAccount Menu")
	public void click_on_my_account_menu() {
	    driver.findElement(By.xpath("//a[text()='My Account']")).click();
	}

	

	@And("Enter the valid username {string} and password {string}")
	public void enter_the_valid_username_and_password(String uname, String pass) {
	  
		driver.findElement(By.xpath("//label[text()='Username or email address ']//following-sibling::input")).sendKeys(uname);
	    driver.findElement(By.xpath("//label[text()='Password ']//following-sibling::input")).sendKeys(passed);
	}

	@And("Click on Login buttona")
	public void click_on_login_buttona() {
		driver.findElement(By.xpath("//input[@name='login']")).click();
	    
	}

	@And("user must be successfully loged into the we page")
	public void user_must_be_successfully_loged_into_the_we_page() {
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Sign out']")).isDisplayed());
		driver.quit();
	    
	}


}
