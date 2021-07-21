package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SmokeTest {
	
	WebDriver driver;
	
	@Given("Open firefox and start application")
	public void open_firefox_and_start_application() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@When("I provide valid {string} and {string}")
	public void i_provide_valid_username_and_password(String uname, String pass) {
		driver.findElement(By.id("email")).sendKeys(uname);;
		driver.findElement(By.id("pass")).sendKeys(pass);;
	}
	
	@Then("User should be able to login")
	public void user_should_be_able_to_login() {
		driver.findElement(By.name("login")).click();
		driver.quit();
	}
	
}
