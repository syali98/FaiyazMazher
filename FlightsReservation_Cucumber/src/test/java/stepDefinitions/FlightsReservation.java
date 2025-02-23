package stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlightsReservation 
{
	WebDriver driver;

	@Given("i open the browser with url {string}")
	public void i_open_the_browser_with_url(String url) 
	{
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);		
	}
	
	
	@Then("i should see login page")
	public void i_should_see_login_page() 
	{
		boolean res = driver.findElement(By.linkText("Register")).isDisplayed();
		if (res) 
		{
			System.out.println("System displayed login page");
		}
	}
	
	
	@When("i click Register link")
	public void i_click_register_link() 
	{
	 	driver.findElement(By.linkText("Register")).click();;
	}
	
	
	@Then("i should see user registration page")
	public void i_should_see_user_registration_page() 
	{
	  String current_url = driver.getCurrentUrl();
	  if (current_url.contains("register")) 
	  {
		System.out.println("System displayed user registration page");
	  }
	}
	
	
	@When("i enter name {string}")
	public void i_enter_name(String name) 
	{
	    driver.findElement(By.id("name")).sendKeys(name);
	}
	
	
	@When("i enter contact number {string}")
	public void i_enter_contact_number(String number) 
	{
	    driver.findElement(By.id("contact")).sendKeys(number);
	}
	
	
	@When("i enter email {string}")
	public void i_enter_email(String email) 
	{
	    driver.findElement(By.id("email")).sendKeys(email);
	}
	
	
	@When("i enter password {string}")
	public void i_enter_password(String pwd) 
	{
	   driver.findElement(By.name("password")).sendKeys(pwd);
	}
	
	
	
	@When("i enter gender as {string}")
	public void i_enter_gender_as(String gender) 
	{
	    driver.findElement(By.name("gender")).sendKeys(gender);
	}
	
	
	@When("i enter DOB {string}")
	public void i_enter_dob(String DOB) 
	{
	    driver.findElement(By.id("popupDatepicker")).sendKeys(DOB);
	}
	
	
	@When("i click privacy policy check box")
	public void i_click_privacy_policy_check_box() 
	{
	    driver.findElement(By.id("flexCheckChecked")).click();
	}
	
	
	@When("i click Register button")
	public void i_click_register_button() 
	{
		driver.findElement(By.name("submit")).click();
	}
	
	
	@Then("i should see user registration successful")
	public void i_should_see_user_registration_successful() 
	{
		String url = driver.getCurrentUrl();
		if (url.contains("success")) 
		{
			System.out.println("User Registration Successful");
		}
	}
	
	
	@When("i close the browser")
	public void i_close_the_browser() 
	{
		driver.quit();
	}
	
	@When("i enter username {string}")
	public void i_enter_username(String uname) 
	{
	    driver.findElement(By.name("email")).sendKeys(uname);
	}
	
	
	@When("i click signin")
	public void i_click_signin() 
	{
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
	@Then("it should display user dashboard")
	public void it_should_display_user_dashboard() 
	{
	    String msg = driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/h2")).getText().toLowerCase();
	    if (msg.contains("user")) 
	    {
			System.out.println("System displayed user dashboard");
		}
	}
	
	
	@When("i click logout")
	public void i_click_logout() 
	{
	    driver.findElement(By.xpath("/html/body/header/nav/div/div[3]/ul/li[2]/div/a/i")).click();
	    driver.findElement(By.linkText("Logout")).click();
	}
	
	
	@Then("i should see appropriate error message")
	public void i_should_see_appropriate_error_message() 
	{
		String errorMsg = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]")).getText().toLowerCase();
		if (errorMsg.contains("invalid"))
		{
			System.out.println("System displayed appropriate error message");
		}
		

	}
	
	
	
	
	
	
}
