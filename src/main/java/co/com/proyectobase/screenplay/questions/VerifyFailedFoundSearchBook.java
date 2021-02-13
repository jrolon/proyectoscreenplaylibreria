package co.com.proyectobase.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.proyectobase.screenplay.userinterface.LibraryResultPage.Book_Not_Found;


public class VerifyFailedFoundSearchBook implements Question<Boolean> {


    public static VerifyFailedFoundSearchBook theBookDoesNotAvailable(){
        return new VerifyFailedFoundSearchBook();
    };


    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(Book_Not_Found, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(Book_Not_Found)
                );
        return Book_Not_Found.resolveFor(actor).isVisible();
    }
}
