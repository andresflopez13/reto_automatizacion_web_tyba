package co.com.tyba.reto.web.utils;

import co.com.tyba.reto.web.models.User;

import static co.com.tyba.reto.web.utils.enums.Environments.PASSWORD_LOGIN;
import static co.com.tyba.reto.web.utils.enums.Environments.USER_LOGIN;

public class Generate {
    private Generate() {
        throw new IllegalStateException("Utility class");
    }

    public static User aCorrectUser() {
        return new User(
                JSonEnvironment.fromSettings().getValue(USER_LOGIN.getValue()),
                JSonEnvironment.fromSettings().getValue(PASSWORD_LOGIN.getValue()));
    }
}
