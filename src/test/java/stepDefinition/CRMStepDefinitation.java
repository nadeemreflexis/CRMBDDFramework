package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class CRMStepDefinitation {
	
	WebDriver driver;
	
	@Given("^User is already on login page$")
	public void user_is_already_on_login_page() throws Throwable {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.manage().window().maximize();
	    driver.get("https://classic.crmpro.com");
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
	    driver.findElement(By.name("username")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^User click on login button$")
	public void user_click_on_login_button() throws Throwable {
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("^Verify user is on Home page$")
	public void verify_user_is_on_Home_page() throws Throwable {
	    String actual = driver.getTitle();
	    Assert.assertEquals(actual, "CRMPRO");
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
	   driver.quit();
	}
}
