package com.example.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InventoryPage {
    public static final Target CART_ICON = Target.the("icono del carrito")
            .located(By.id("shopping_cart_container"));

    public static final Target CART_TITLE = Target.the("título del carrito")
            .located(By.cssSelector(".title"));

    public static Target addToCartButtonFor(String productSlug) {
        return Target.the("botón agregar al carrito para " + productSlug)
                .located(By.cssSelector("[data-test='add-to-cart-" + productSlug + "']"));
    }
}
