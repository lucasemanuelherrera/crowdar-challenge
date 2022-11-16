package main;

import main.constantes.Constantes;
import main.ui.PaginaLogin;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.is;

@RunWith(SerenityRunner.class)
public class CuandoUsuarioIngresaPassword{

    Actor actor;

    @Managed
    WebDriver navegador;

    @Before
    public void preparaEscenario(){
        actor = Actor.named("SwagLabs user");

        actor.can(BrowseTheWeb.with(navegador));
    }

    @Test
    public void ingresandoPassword(){

        actor.attemptsTo(Open.url(Constantes.MAIN_PAGE));

        actor.attemptsTo(
                Enter.theValue(Constantes.USERNAME).into(PaginaLogin.CAJA_USERNAME),
                Enter.theValue("").into(PaginaLogin.CAJA_PASSWORD),
                Click.on(PaginaLogin.BTN_LOGIN)
        );

        actor.should(
                seeThat(TheTarget.textOf(PaginaLogin.MSJ_LOGIN), is(Constantes.MSJ_PASS_REQUIRED))
        );

        actor.attemptsTo(
                Enter.theValue(Constantes.USERNAME).into(PaginaLogin.CAJA_USERNAME),
                Enter.theValue(Constantes.NUMERIC_PASSWORD).into(PaginaLogin.CAJA_PASSWORD),
                Click.on(PaginaLogin.BTN_LOGIN)
        );

        actor.should(
                seeThat(TheTarget.textOf(PaginaLogin.MSJ_LOGIN), is(Constantes.MSJ_USER_PASS_NOT_MATCH))
        );

        actor.attemptsTo(
                Enter.theValue(Constantes.USERNAME).into(PaginaLogin.CAJA_USERNAME),
                Enter.theValue(Constantes.COMBINE_PASSWORD).into(PaginaLogin.CAJA_PASSWORD),
                Click.on(PaginaLogin.BTN_LOGIN)
        );

        actor.should(
                seeThat(TheTarget.textOf(PaginaLogin.MSJ_LOGIN), is(Constantes.MSJ_USER_PASS_NOT_MATCH))
        );

    }


}
