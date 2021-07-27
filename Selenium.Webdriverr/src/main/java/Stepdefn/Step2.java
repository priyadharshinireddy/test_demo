package Stepdefn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step2 {
	
	WebDriver d1;

	
	@Given("Open chrome and url of the application")
	public void open_chrome_and_url_of_the_application() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d1=new ChromeDriver();
        d1.get("https://opensource-demo.orangehrmlive.com/");		
	}
		
		@When("Enter Username and password")
		public void enter_username_and_password() {
			d1.findElement(By.id("txtUsername")).sendKeys("Admin");
	        d1.findElement(By.id("txtPassword")).sendKeys("admin123");
	        
	        d1.findElement(By.id("btnLogin")).click();
		}
	        @Then("Login to account")
	        public void login_to_account() {
	           
	        }

			
		    
		
	}
	
	

