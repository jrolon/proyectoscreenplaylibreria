package co.com.proyectobase.screenplay.tasks;


import co.com.proyectobase.screenplay.userinterface.LibraryHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.proyectobase.screenplay.userinterface.LibraryHomePage.Button_Go_Authentation;
import static co.com.proyectobase.screenplay.userinterface.LibraryHomePage.Button_My_Account;


public class Visit implements Task{
	
	private LibraryHomePage homePage;

	public static Visit theLibraySite() {
		return Tasks.instrumented(Visit.class);
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn().the(homePage));

		actor.attemptsTo(Click.on(Button_My_Account),
				Click.on(Button_Go_Authentation));
	}
}
