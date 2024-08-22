package myTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="Features/bookMyshow.feature",
	glue={"stepDefinitions"},
	monochrome=true,
	dryRun=false,
	tags="@smoketest",
	plugin= {"pretty","html:htmlreporst/test-output1","json:json-output/bookmyshow.json",
			"junit:junit_xml_output/bookmyshow.xml"}
	
	
)
public class bookMyshowRunner {

}
