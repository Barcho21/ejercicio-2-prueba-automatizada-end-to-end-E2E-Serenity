package com.example.saucedemo.tasks;

import com.example.saucedemo.ui.CheckoutOverviewPage;
import com.example.saucedemo.ui.CheckoutCompletePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FinishPurchase {
    public static Performable now() {
        return Task.where("{0} finaliza la compra",
                Click.on(CheckoutOverviewPage.FINISH_BUTTON),
                WaitUntil.the(CheckoutCompletePage.COMPLETE_HEADER, isVisible()).forNoMoreThan(10).seconds()
        );
    }
}
