package com.example.saucedemo.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheApplication {
    public static Performable onHomePage() {
        return Open.url("https://www.saucedemo.com/");
    }
}