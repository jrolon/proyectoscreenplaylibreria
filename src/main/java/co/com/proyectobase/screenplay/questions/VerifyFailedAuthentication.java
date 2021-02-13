package co.com.proyectobase.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.proyectobase.screenplay.userinterface.LibraryHomePage.Error_Message;
import static co.com.proyectobase.screenplay.userinterface.LibraryUserAccountPage.UserImage;
import static co.com.proyectobase.screenplay.util.ConstantMessageManager.ERROR_MESSAGE_EXPECTED_IN_AUTHENTICATION;

public class VerifyFailedAuthentication implements Question<Boolean> {


    public static VerifyFailedAuthentication theAuthenticationFailed(){
        return new VerifyFailedAuthentication();
    };


    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(Error_Message,WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds());
        return Text.of(Error_Message).viewedBy(actor).asString().equals(ERROR_MESSAGE_EXPECTED_IN_AUTHENTICATION);
    }
}
