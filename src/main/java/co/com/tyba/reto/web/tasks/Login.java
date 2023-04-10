package co.com.tyba.reto.web.tasks;

import co.com.tyba.reto.web.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.tyba.reto.web.components.DashBoard.ITEM_PRODUCTS;
import static co.com.tyba.reto.web.components.LoginMainPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {
    private User user;
    public Login(User user) {
        this.user = user;
    }

    @Step("{0} authenticates with userName ******* and password ********")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.angularRequestsHaveFinished(),
                WaitUntil.the(INPUT_USER_NAME, isVisible()),
                Enter.theValue(user.getUserName()).into(INPUT_USER_NAME),
                WaitUntil.the(INPUT_PASSWORD, isVisible()),
                Enter.theValue(user.getPassword()).into(INPUT_PASSWORD),
                Click.on(BUTTON_LOGIN));
    }

    public static Login with(User user) {
        return instrumented(Login.class, user);
    }
}
