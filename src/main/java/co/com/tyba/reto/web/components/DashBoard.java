package co.com.tyba.reto.web.components;

import net.serenitybdd.screenplay.targets.Target;

public class DashBoard {
    private DashBoard() {
        throw new IllegalStateException("Utility class");
    }

    public static final Target ITEM_PRODUCTS =
            Target.the("Label product listing").
                    locatedBy("//span[contains(text(),'Products')]");
}
