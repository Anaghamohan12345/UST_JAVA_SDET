package StepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition1 {
	WebDriver d = null;
	@Given("the user opens the browser")
	public void the_user_opens_the_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ustjavasdetb411\\\\Desktop\\\\chromedriver.exe");
		d = new ChromeDriver();
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("the user navigates to MercuryTours register page")
	public void the_user_navigates_to_mercury_tours_register_page() {
		d.get("http://demo.guru99.com/test/newtours/register.php");
		d.getTitle().contains("Tours");
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("the user enters lands on the page")
	public void the_user_enters_lands_on_the_page() {
		d.findElement(By.name("firstName")).sendKeys("Hero ranger");	
		  d.findElement(By.name("lastName")).sendKeys("Richard");	
		  d.findElement(By.name("phone")).sendKeys("7530020250");	
		  d.findElement(By.name("userName")).sendKeys("qwertyrockers@gmail.com");	
		  d.findElement(By.name("address1")).sendKeys("qwertyqwerty hover colony");	
		  d.findElement(By.name("city")).sendKeys("Persia");	
		  d.findElement(By.name("state")).sendKeys("City Melbourne");	
		  d.findElement(By.name("postalCode")).sendKeys("5252525");
		  d.findElement(By.name("country")).click();
	  	  d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select/option[108]")).click();
		  d.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("rangerrathore@gmail.com");
		  d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input")).sendKeys("abcd");
		  d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input")).sendKeys("abcd");
		  d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input")).click();
		  d.findElement(By.linkText("Home")).click();
		  d.findElement(By.name("userName")).sendKeys("abcd");	
		  d.findElement(By.name("password")).sendKeys("abcd");
		  d.findElement(By.name("submit")).click();
		  d.findElement(By.linkText("Flights")).click();
		  d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();	
		  d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select/option[2]")).click();
		  d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select/option[5]")).click();
		  d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[1]/option[6]")).click();
		  d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[2]/option[2]")).click();
		 
		  //click on the Business class
	      d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")).click();
	      // click on Blue Skies Airlines
	      d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select/option[2]")).click();
	      //Then click continue
	      d.findElement(By.xpath(" /html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input")).click();
		  
	}
	
	
	

}