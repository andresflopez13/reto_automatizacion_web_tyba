package co.com.tyba.reto.web.stepdefinitions;

import co.com.tyba.reto.web.drivers.Browser;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.tyba.reto.web.utils.JSonEnvironment.fromSettings;
import static co.com.tyba.reto.web.utils.enums.Environments.URL_BASE_DESKTOP;

public class GeneralStepDefinition {
    @Before
    public void setStage() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(Browser.chrome().
                onUrl(fromSettings().getValue(URL_BASE_DESKTOP.getValue())))));
    }
}
