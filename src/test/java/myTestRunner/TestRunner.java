package myTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
		glue="stepDefinitions",
		monochrome=true,
		dryRun=false,
		plugin= {"pretty","html:test-output","json:json-output/cucumber.json",
				"junit:junit_xml_output/cucumber.xml"}
		
		)
public class TestRunner {

}
