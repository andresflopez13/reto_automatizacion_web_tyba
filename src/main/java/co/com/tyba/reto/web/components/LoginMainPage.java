package co.com.tyba.reto.web.components;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginMainPage {
    private LoginMainPage() {
        throw new IllegalStateException("Utility class");
    }

    public static final Target BUTTON_LOGIN =
            Target.the("Boton login").located(By.id("login-button"));

    public static final Target INPUT_USER_NAME =
            Target.the("Input user name login").located(By.id("user-name"));

    public static final Target INPUT_PASSWORD =
            Target.the("Input user password login").located(By.id("password"));

    public static final Target LABEL_ERROR =
            Target.the("Label error login").located(By.className("error-button"));
}
