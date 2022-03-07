package runTest;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import core.DriverFactory;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features",
	glue = "Test", 
	tags = {"@0002"}, 
	snippets = SnippetType.CAMELCASE,
	plugin = { "pretty" }, 
	monochrome = true
	)

public class RunTest {
	 
	
	@AfterClass
	    public static void testEnd(){
	        DriverFactory.killDriver();
	    }
}
