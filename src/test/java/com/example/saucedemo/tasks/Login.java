package com.example.saucedemo.tasks;

import com.example.saucedemo.ui.LoginPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login {
    public static Performable withCredentials(String username, String password) {
        return Task.where("{0} inicia sesión",
                Enter.theValue(username).into(LoginPage.USERNAME),
                Enter.theValue(password).into(LoginPage.PASSWORD),
                Click.on(LoginPage.LOGIN_BUTTON),
                WaitUntil.the(LoginPage.APP_LOGO, isVisible()).forNoMoreThan(10).seconds()
        );
    }
}
