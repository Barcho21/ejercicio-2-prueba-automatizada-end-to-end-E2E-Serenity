package com.example.saucedemo.tasks;

import com.example.saucedemo.ui.CartPage;
import com.example.saucedemo.ui.CheckoutInformationPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CheckoutInformation {
    public static Performable with(String firstName, String lastName, String postalCode) {
        return Task.where("{0} completa el formulario de checkout",
                Click.on(CartPage.CHECKOUT_BUTTON),
                WaitUntil.the(CheckoutInformationPage.FIRST_NAME, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(firstName).into(CheckoutInformationPage.FIRST_NAME),
                Enter.theValue(lastName).into(CheckoutInformationPage.LAST_NAME),
                Enter.theValue(postalCode).into(CheckoutInformationPage.POSTAL_CODE),
                Click.on(CheckoutInformationPage.CONTINUE_BUTTON)
        );
    }
}
