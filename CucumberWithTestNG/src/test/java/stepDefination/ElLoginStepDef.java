package stepDefination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjectmodel.ELLoginPage;

public class ElLoginStepDef {
	
	WebDriver driver;
	public ELLoginPage obj;
	@Given("User should launch the browser")
	public void user_should_launch_the_browser() {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   obj=new ELLoginPage(driver);	
	}

	@Given("Naviagate to the SignIn Page")
	public void naviagate_to_the_sign_in_page() {
		   driver.get("https://dev-app.elderlylife.co.uk/");
	}

	@When("Enter emial and password")
	public void enter_emial_and_password() throws Exception {
	 obj.test1();   
	}

	@When("Click on SignIn button")
	public void click_on_sign_in_button() {
	obj.test2();
	}
	
	@Then("It should display the dashboard")
	public void it_should_display_the_dashboard() throws Exception {
	  Thread.sleep(4000);
		obj.test3();
		
	}
	
	
	@AfterStep
	public void  addScreenshot(Scenario sc)
	{
		
//			final byte[] screenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//			sc.attach(screenshot, "image/png", sc.getName());
			
		if(sc.isFailed())
		{
			final byte[] screenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			sc.attach(screenshot, "image/png", sc.getName());
		}
		
	}
	
	
	
	
}
