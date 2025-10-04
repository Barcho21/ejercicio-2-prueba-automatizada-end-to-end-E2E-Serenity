package com.example.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target USERNAME = Target.the("usuario")
            .located(By.cssSelector("[data-test='username']"));
    public static final Target PASSWORD = Target.the("password")
            .located(By.cssSelector("[data-test='password']"));
    public static final Target LOGIN_BUTTON = Target.the("botón login")
            .located(By.cssSelector("[data-test='login-button']"));
    public static final Target APP_LOGO = Target.the("logo del inventario")
            .located(By.cssSelector(".app_logo"));
}
