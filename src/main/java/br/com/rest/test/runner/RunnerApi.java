package br.com.rest.test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(//
		features = "classpath:features", //
		glue = { "br.com.rest.test.steps", "br.com.rest.test.hooks" }, //
		tags = "@ID_0001", //
		dryRun = false, //
		plugin = { "html:target/cucumber-report.html" }, //
		snippets = SnippetType.CAMELCASE //
)

public class RunnerApi {

}
