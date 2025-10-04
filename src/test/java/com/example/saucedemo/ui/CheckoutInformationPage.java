package com.example.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutInformationPage {
    public static final Target FIRST_NAME = Target.the("nombre")
            .located(By.cssSelector("[data-test='firstName']"));
    public static final Target LAST_NAME = Target.the("apellido")
            .located(By.cssSelector("[data-test='lastName']"));
    public static final Target POSTAL_CODE = Target.the("código postal")
            .located(By.cssSelector("[data-test='postalCode']"));
    public static final Target CONTINUE_BUTTON = Target.the("botón continuar")
            .located(By.cssSelector("[data-test='continue']"));
}
