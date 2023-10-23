package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\HP\\eclipse-workspace\\2022\\CucumberProject\\src\\test\\java\\features\\AmazonDemo.feature",
glue= {"steps"},
dryRun=false,
plugin={"pretty",
		"html:target/cucumberreport.html"},
tags="@all"
)

public class TestRunner {

}
