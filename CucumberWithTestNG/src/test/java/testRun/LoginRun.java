package testRun;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features/Login.feature",
glue="stepDefination",
dryRun=false,
monochrome=true,
//plugin= {"pretty","html:target/reports/report1.html"}
plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class LoginRun extends AbstractTestNGCucumberTests {

}
