package co.com.proyectobase.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.proyectobase.screenplay.userinterface.LibraryUserAccountPage.UserImage;

public class VerifySuccessAuthentication implements Question<Boolean> {

    public static VerifySuccessAuthentication theAuthenticationSuccess(){
        return new VerifySuccessAuthentication();
    };

    @Override
    public Boolean answeredBy(Actor actor) {
      //  Text.of(UserImage).viewedBy(actor).
        return UserImage.resolveFor(actor).isVisible();
    }
}
