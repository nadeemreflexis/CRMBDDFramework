package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CRMStepDefinition2 {

	WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable {
	   
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.manage().window().maximize();
	    driver.get("https://classic.crmpro.com");
	}

	@When("^title of login page is \"([^\"]*)\"$")
	public void title_of_login_page_is(String Title) throws Throwable {
	    String ActualTitle = driver.getTitle();
	    Assert.assertEquals(ActualTitle, Title);
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
	  
		driver.findElement(By.name("username")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	    
	}

	@Then("^verify user is on Home Page$")
	public void verify_user_is_on_Home_Page() throws Throwable {
		String actual = driver.getTitle();
	    Assert.assertEquals(actual, "CRMPRO");
	   
	}

	@Then("^user hover on Contacts and click on New Contact$")
	public void user_hover_on_Contacts_and_click_on_New_Contact() throws Throwable {
	    WebElement contact = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
	    driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
	    action.moveToElement(contact).perform();
	    driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
	   
	}

	@Then("^user fill \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_fill(String title, String First_Name, String Last_Name, String Company) throws Throwable {
		Select select = new Select(driver.findElement(By.name("title")));
		select.selectByValue(title);
		driver.findElement(By.id("first_name")).sendKeys(First_Name);
		driver.findElement(By.id("surname")).sendKeys(Last_Name);
		driver.findElement(By.id("client_lookup")).sendKeys(Company);
	    
	}

	@Then("^user click on Save button$")
	public void user_click_on_Save_button() throws Throwable {
	    driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
	   
	}

	@Then("^verify \"([^\"]*)\" is created$")
	public void verify_is_created(String contact) throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400);");
		WebElement checkbox=driver.findElement(By.xpath("//form[@id='vContactsForm']/table/tbody/tr/td[2]/a[contains(text(),'"+contact+"')]/"
				+ "parent::td/parent::tr/td/input"));
		checkbox.click();
		Assert.assertTrue(checkbox.isSelected());
	  
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	   
		driver.quit();
	   
	}

}
