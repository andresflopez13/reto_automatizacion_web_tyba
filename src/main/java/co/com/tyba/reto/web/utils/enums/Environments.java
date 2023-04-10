package co.com.tyba.reto.web.utils.enums;

public enum Environments {

    URL_BASE_DESKTOP("urlBaseDesktop"),
    USER_LOGIN("user"),
    PASSWORD_LOGIN("password");

    private String value;
    Environments(String value) {
    this.value = value;
    }

    public String getValue() {
        return value;
    }
}
