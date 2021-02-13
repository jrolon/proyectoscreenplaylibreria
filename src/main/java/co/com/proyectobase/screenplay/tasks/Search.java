package co.com.proyectobase.screenplay.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;

import static co.com.proyectobase.screenplay.userinterface.LibraryLoginPage.*;
import static co.com.proyectobase.screenplay.userinterface.LibraryUserAccountPage.SearchBookInput;
import static org.openqa.selenium.Keys.RETURN;


public class Search implements Task{

	private String book;


	public Search(String book){
		this.book = book;

	}
	
	//private LibraryHomePage homePage;

	public static Search aBookWithTitle(String title) {
		return Tasks.instrumented(Search.class, title);
	}
	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				Enter.theValue(book).into(SearchBookInput)
		);
		actor.attemptsTo(
				Hit.the(RETURN).keyIn(SearchBookInput)
		);

	}
}
