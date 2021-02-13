package co.com.proyectobase.screenplay.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import static co.com.proyectobase.screenplay.userinterface.LibraryResultPage.First_Result_Book;
import static co.com.proyectobase.screenplay.userinterface.LibraryUserAccountPage.SearchBookInput;
import static org.openqa.selenium.Keys.RETURN;


public class Select implements Task{


	public static Select firstResult() {
		return Tasks.instrumented(Select.class);
	}


	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Scroll.to(First_Result_Book));
		actor.attemptsTo(
				Click.on(First_Result_Book)
		);
	}
}
