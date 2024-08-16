package steps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SimpleForm_Steps {
	
	WebDriver driver;
	
	@Given("Open the browser, enter the training-support-selenium url")
	public void open_the_browser_enter_the_training_support_selenium_url() {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://v1.training-support.net/selenium/simple-form?");
	    
	}

	@When("user enters firstname, lastname, email, contact number, message")
	public void user_enters_firstname_lastname_email_contact_number_message() {
		
		driver.findElement(By.id("firstName")).sendKeys("Gabbar");
		
		driver.findElement(By.cssSelector("[placeholder='Last Name']")).sendKeys("Singh");
		
		driver.findElement(By.id("email")).sendKeys("GabkitneAdmiThe4@gmail.com");

		driver.findElement(By.id("number")).sendKeys("0055005500");
		
		driver.findElement(By.cssSelector("[rows='2']")).sendKeys("Aaj Hoga Maut ka khel hahahahaaaaa...");
	}

	@When("click on submit button")
	public void click_on_submit_button() {
	   
		driver.findElement(By.cssSelector("[value='submit']")).click();
		
		//driver.findElement(By.cssSelector("[value='Clear']")).click();
		
	}

	@Then("Thank You for reaching out to us, Gabbar message should be displayed")
	public void thank_you_for_reaching_out_to_us_gabbar_message_should_be_displayed() {
	
		Alert ele = driver.switchTo().alert();
		
		String confirmationMsg = ele.getText();
		
		System.out.println(confirmationMsg);
		
		
	
	}

	@Then("click on OK button")
	public void click_on_ok_button() {
		
		Alert ele = driver.switchTo().alert();
		
		String confirmationMsg = ele.getText();
		
		ele.accept(); //this will click on OK button
		
		driver.close();
	}
	@When("user enters {string}, {string}, {string}, {string}, {string}")
	public void user_enters(String firstName, String LastName, String Email, String PhoneNo, String Message) {
	 
		driver.findElement(By.id("firstName")).sendKeys(firstName);
		
		driver.findElement(By.cssSelector("[placeholder='Last Name']")).sendKeys(LastName);
		
		driver.findElement(By.id("email")).sendKeys(Email);

		driver.findElement(By.id("number")).sendKeys(PhoneNo);
		
		driver.findElement(By.cssSelector("[rows='2']")).sendKeys(Message);

		
		
		
	}

}
