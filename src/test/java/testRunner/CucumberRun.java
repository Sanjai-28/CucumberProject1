package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags= "",
                 features= {"src/test/resources/Features"},
                 glue= {"StepDefinitions"},
                 plugin= {"pretty","html:target/report.html"}
		)

public class CucumberRun extends AbstractTestNGCucumberTests
{

}
