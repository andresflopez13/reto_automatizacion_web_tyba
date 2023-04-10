package co.com.tyba.reto.web.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "co.com.tyba.reto.web.stepdefinitions")
public class Login {}
