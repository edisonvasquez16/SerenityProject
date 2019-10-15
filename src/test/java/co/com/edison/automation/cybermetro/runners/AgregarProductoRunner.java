package co.com.edison.automation.cybermetro.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
		features = "src/test/resources/co/com/edison/automation/cybermetro/features/agregarproducto.feature",
		glue = "co.com.edison.automation.cybermetro.stepdefinitions",
		snippets = SnippetType.CAMELCASE)

public class AgregarProductoRunner {

}