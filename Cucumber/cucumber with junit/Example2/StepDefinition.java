package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
WebDriver driver =null;

	

	@Given("the user opens the browser")
	public void the_user_opens_the_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ustjavasdetb411\\Desktop\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	    

	@When("the user navigates to google")
	public void the_user_navigates_to_google() {
		driver.get("https://www.google.com");
	}

	@Then("search aluva")
	public void search_aluva() {
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Aluva");

		
	}

}

