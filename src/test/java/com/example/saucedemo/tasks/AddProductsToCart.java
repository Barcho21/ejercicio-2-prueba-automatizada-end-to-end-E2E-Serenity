package com.example.saucedemo.tasks;

import com.example.saucedemo.ui.InventoryPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

public class AddProductsToCart {
    public static Performable withSlugs(List<String> slugs) {
        return Task.where("{0} agrega productos al carrito",
                actor -> slugs.forEach(slug ->
                        Click.on(InventoryPage.addToCartButtonFor(slug)).performAs(actor)
                )
        );
    }
}
