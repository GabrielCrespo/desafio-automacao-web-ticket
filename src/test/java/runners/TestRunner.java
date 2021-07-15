package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:src/test/resources/relatorios",
		"json:src/test/resources/relatorios/report.json",
		"junit:src/test/resources/relatorios/cucumber.xml" }, features = "src/test/resources/features/CreateEmail.feature",
		tags = {"@Scenario1"},
		monochrome = true, glue = { "stepsdefinitions" }, snippets = SnippetType.CAMELCASE, dryRun = false, strict = false)
public class TestRunner {

}
