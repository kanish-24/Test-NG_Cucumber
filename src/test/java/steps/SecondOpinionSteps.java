package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SecondOpinionSteps {

	WebDriver driver;
	
	@Given("Open the browser, enter the Sparsh hospital url")
	public void open_the_browser_enter_the_sparsh_hospital_url() {
	    // Write code here that turns the phrase above into concrete actions
	    
	    driver = new ChromeDriver();

	    driver.manage().window().maximize();

	    driver.get("https://www.sparshhospital.com/");

	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    
	}

	@Given("Select SPARSH Hospital, Yeswanthpur from the hospital dropdown and click on Second Opinion link")
	public void select_sparsh_hospital_yeswanthpur_from_the_hospital_dropdown_and_click_on_second_opinion_link() {
	    // Write code here that turns the phrase above into concrete actions
	   
	    // Hospital dropdown
	    driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[3]")).click();

	    // click on any hospital from the dropdown
	    driver.findElement(By.linkText("SPARSH Hospital, Yeswanthpur")).click();
	    
	   //driver.findElement(By.linkText("Second Opinion")).click();
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    js.executeScript("arguments[0].click()", driver.findElement(By.linkText("Second Opinion")));
	    
	    
	}

	@When("user enters firstName, lastName, phoneNumber, emailAddress")
	public void user_enters_first_name_last_name_phone_number_email_address() {
	    // Write code here that turns the phrase above into concrete actions
	    
	    
	    //enter firstname
	    driver.findElement(By.id("secondopinion_first_name")).sendKeys("LaxmiNarayan");
	  		
	    // enter lastname
	    driver.findElement(By.name("secondopinion_last_name")).sendKeys("Sharma");
	  		
	  	//enter phoneNumber
	  	driver.findElement(By.cssSelector("[placeholder='Phone Number *']")).sendKeys("8890089889");
	  		
	  	//enter email id
	  	driver.findElement(By.cssSelector("[type='email']")).sendKeys("LaxSh555@gmail.com");

	  	

	}

	@When("write a message and click on send button")
	public void write_a_message_and_click_on_send_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    
	    
	    driver.findElement(By.name("secondopinion_message")).sendKeys("This is my opinion");
	    
	    Thread.sleep(2000);
	    driver.findElement(By.id("secondopinion_submit")).click();
	    
	}

	@Then("Thank you message should be displayed")
	public void thank_you_message_should_be_displayed() {
		
		driver.findElement(By.id("secondopinion_submit")).click();
	   
	 // Soft Assertion
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(driver.getTitle(), "Thank You - SPARSH Hospital");
		
		sa.assertAll();
		
		 
	}

	@Then("bank info should be available in the page")
	public void bank_info_should_be_available_in_the_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	    
	 // Assert the bankInfo text using - hard assert
		String expectedBankInfo = "Make UPI Payment:";
			
		String actualBankInfo = driver.findElement(By.xpath("//h5[text()='Make UPI Payment:']")).getText();
			
		Assert.assertEquals(actualBankInfo, expectedBankInfo);
			
		// Assert the url
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.sparshhospital.com/thank-you/");
			
		String url = driver.getCurrentUrl();
			
		boolean status = url.contains("thank-you");
			
		Assert.assertTrue(status);
		
		driver.close();
	}

	@When("user enters {string}, {string}, {string}, {string}")
	public void user_enters(String firstname, String lastname, String phonenumber, String emailaddress) {
	    // Write code here that turns the phrase above into concrete actions
		
		//enter firstname
	    driver.findElement(By.id("secondopinion_first_name")).sendKeys(firstname);
	  		
	    // enter lastname
	    driver.findElement(By.name("secondopinion_last_name")).sendKeys(lastname);
	  		
	  	//enter phoneNumber
	  	driver.findElement(By.cssSelector("[placeholder='Phone Number *']")).sendKeys(phonenumber);
	  		
	  	//enter email id
	  	driver.findElement(By.cssSelector("[type='email']")).sendKeys(emailaddress);
		
	    
	}

}