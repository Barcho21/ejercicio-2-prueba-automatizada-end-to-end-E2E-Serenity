package com.example.saucedemo.questions;

import com.example.saucedemo.ui.CheckoutCompletePage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ConfirmationMessage {
    public static Question<String> text() {
        return actor -> Text.of(CheckoutCompletePage.COMPLETE_HEADER).answeredBy(actor);
    }
}
