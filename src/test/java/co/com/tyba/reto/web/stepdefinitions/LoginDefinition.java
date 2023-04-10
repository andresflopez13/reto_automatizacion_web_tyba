package co.com.tyba.reto.web.stepdefinitions;

import co.com.tyba.reto.web.tasks.Login;
import co.com.tyba.reto.web.utils.Generate;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static co.com.tyba.reto.web.components.DashBoard.ITEM_PRODUCTS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class LoginDefinition {
    @Dado("que {string} desea loguearse en Swag Labs")
    public void theUserWantsTologinToSwagLabsWeb(String name) {
        theActorCalled(name).entersTheScene();
    }

    @Cuando("ingresa el email y contrasenia correcta")
    public void enterTheEmailAndCorrectPassword() {
        theActorInTheSpotlight().attemptsTo(Login.with(Generate.aCorrectUser()));
    }

    @Entonces("verifica que el usuario se autentica correctamente")
    public void verifiesThatTheUserIsAuthenticatedCorrectly() {
        theActorInTheSpotlight().should(
                seeThat(the(ITEM_PRODUCTS), containsText("Products")));
    }

}
