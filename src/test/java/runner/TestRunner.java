package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	
	@CucumberOptions(features = "/home/himanshu/Desktop/B36-SPR101-JAVA/TestNG_Cucumber/src/test/resources/SparshHospital Testing/SecondOpinion.feature",
			glue = "steps")
	
	public class TestRunner extends AbstractTestNGCucumberTests {

}
