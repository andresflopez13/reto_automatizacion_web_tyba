package co.com.tyba.reto.web.utils;

import co.com.tyba.reto.web.models.User;
import com.github.javafaker.Faker;

import java.util.Locale;

import static co.com.tyba.reto.web.utils.enums.Environments.PASSWORD_LOGIN;
import static co.com.tyba.reto.web.utils.enums.Environments.USER_LOGIN;

public class Generate {
    private static final Faker faker = new Faker(new Locale("es"));

    private Generate() {
        throw new IllegalStateException("Utility class");
    }

    public static User aCorrectUser() {
        return new User(
                JSonEnvironment.fromSettings().getValue(USER_LOGIN.getValue()),
                JSonEnvironment.fromSettings().getValue(PASSWORD_LOGIN.getValue()));
    }

    public static User aWrongUser() {
        return new User(JSonEnvironment.fromSettings().getValue(USER_LOGIN.getValue()), faker.internet().password());
    }
}
