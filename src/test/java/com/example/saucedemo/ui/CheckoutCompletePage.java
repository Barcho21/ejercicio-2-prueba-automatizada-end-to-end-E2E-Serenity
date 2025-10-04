package com.example.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutCompletePage {
    public static final Target COMPLETE_HEADER = Target.the("mensaje de confirmación")
            .located(By.cssSelector("[data-test='complete-header']"));
}
