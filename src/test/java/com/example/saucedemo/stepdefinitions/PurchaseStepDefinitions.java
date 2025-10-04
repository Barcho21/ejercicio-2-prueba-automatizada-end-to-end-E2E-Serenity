package com.example.saucedemo.stepdefinitions;

import com.example.saucedemo.questions.ConfirmationMessage;
import com.example.saucedemo.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsStringIgnoringCase;
import java.util.Arrays;

public class PurchaseStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver hisBrowser;

    private Actor user;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        user = Actor.named("Usuario");
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @Dado("que {string} abre la aplicación de SauceDemo")
    public void queAbreLaAplicacion(String actorName) {
        user.attemptsTo(OpenTheApplication.onHomePage());
    }

    @Cuando("inicia sesión con usuario {string} y password {string}")
    public void iniciaSesionConUsuarioYPassword(String username, String password) {
        user.attemptsTo(Login.withCredentials(username, password));
    }

    @Cuando("agrega los productos {string} y {string} al carrito")
    public void agregaLosProductosAlCarrito(String productSlug1, String productSlug2) {
        user.attemptsTo(AddProductsToCart.withSlugs(Arrays.asList(productSlug1, productSlug2)));
    }

    @Cuando("navega al carrito")
    public void navegaAlCarrito() {
        user.attemptsTo(GoToCart.view());
    }

    @Cuando("completa el checkout con nombre {string}, apellido {string} y código {string}")
    public void completaElCheckout(String firstName, String lastName, String postalCode) {
        user.attemptsTo(CheckoutInformation.with(firstName, lastName, postalCode));
    }

    @Cuando("finaliza la compra")
    public void finalizaLaCompra() {
        user.attemptsTo(FinishPurchase.now());
    }

    @Entonces("debería ver el mensaje de confirmación que contiene {string}")
    public void deberiaVerElMensaje(String expected) {
        user.should(seeThat(ConfirmationMessage.text(), containsStringIgnoringCase(expected)));
    }
}
