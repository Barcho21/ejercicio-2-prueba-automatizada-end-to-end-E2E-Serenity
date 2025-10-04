package com.example.saucedemo.tasks;

import com.example.saucedemo.ui.InventoryPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class GoToCart {
    public static Performable view() {
        return Task.where("{0} navega al carrito",
                Click.on(InventoryPage.CART_ICON),
                WaitUntil.the(InventoryPage.CART_TITLE, isVisible()).forNoMoreThan(10).seconds()
        );
    }
}
