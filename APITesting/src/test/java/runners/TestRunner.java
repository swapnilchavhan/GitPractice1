package runners;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/functionalTests",
		glue = {"stepDefinitions2"}, 
		strict = true,
		dryRun = false,
		//tags = {"~@Smoke" , "@Payment"},
		plugin = {"pretty", "html:test-output"}
)

public class TestRunner {
	
	@BeforeClass
	public static void before () {
	  System.out.println ("Executes before all tests"); }


	@AfterClass
	public static void after () {
	  System.out.println ("Executes after all tests"); 
	   }

}
