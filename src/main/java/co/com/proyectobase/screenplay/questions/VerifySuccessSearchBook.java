package co.com.proyectobase.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.proyectobase.screenplay.userinterface.LibraryBookDetailPage.Book_Cover_Image;
import static co.com.proyectobase.screenplay.userinterface.LibraryResultPage.First_Result_Book;
import static co.com.proyectobase.screenplay.userinterface.LibraryUserAccountPage.UserImage;

public class VerifySuccessSearchBook implements Question<Boolean> {

    public static VerifySuccessSearchBook theSuccessVerificationOfFindingABook(){
        return new VerifySuccessSearchBook();
    };

    @Override
    public Boolean answeredBy(Actor actor) {
        return Book_Cover_Image.resolveFor(actor).isVisible();
    }
}


