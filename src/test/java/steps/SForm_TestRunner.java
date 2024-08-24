package steps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "/home/himanshu/Desktop/B36-SPR101-JAVA/TestNG_Cucumber/src/test/resources/Training-Support-Selenium/SimpleForm.feature",
		
		glue = "steps"
		
		
		)
public class SForm_TestRunner extends AbstractTestNGCucumberTests{

}
