package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ELLoginPage {
WebDriver driver;	
	
public ELLoginPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


@FindBy (how=How.XPATH, using="//p[contains(text(),'Sign into Elderly Life Account')]") WebElement loginpage;
@FindBy (name="email") WebElement email;
@FindBy (name="password") WebElement password;
@FindBy (how=How.XPATH, using="//button[contains(text(),'Sign In')]") WebElement signInButton;
@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[1]/span[1]/a[1]/img[1]") WebElement Homepage;
@FindBy (how=How.XPATH, using="//div[contains(text(),'Please enter a valid password')]") WebElement passwordlessthan8Digit;


@FindBy (how=How.XPATH, using="//div[contains(text(),'Invalid email or password/Account is not Active')]") WebElement loginfail;

@FindBy (how=How.XPATH, using="//div[contains(text(),'Please enter a valid email address')]") WebElement Invalidemail;

@FindBy (how=How.XPATH, using="//div[contains(text(),'Please enter a valid email address and password')]") WebElement Invalidemailandpassword;

@FindBy (how=How.XPATH, using="//p[contains(text(),'Family Invitations')]") WebElement dashboard;



public void test1() throws Exception
{
	Thread.sleep(1000);
	email.sendKeys("gleecustest1@gmail.com");
	password.sendKeys("12345678");
}


public void test2()
{
	signInButton.click();	
}

public void test3()
{
	dashboard.isDisplayed();
}


}
