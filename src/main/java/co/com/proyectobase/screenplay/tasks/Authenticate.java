package co.com.proyectobase.screenplay.tasks;


import co.com.proyectobase.screenplay.userinterface.LibraryHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.proyectobase.screenplay.userinterface.LibraryHomePage.Button_Go_Authentation;
import static co.com.proyectobase.screenplay.userinterface.LibraryHomePage.Button_My_Account;
import static co.com.proyectobase.screenplay.userinterface.LibraryLoginPage.*;


public class Authenticate implements Task{

	private String user;
	private String pass;

	public Authenticate(String user, String pass){
		this.user = user;
		this.pass = pass;
	}
	
	//private LibraryHomePage homePage;

	public static Authenticate inTheLibrary(String user, String pass) {
		return Tasks.instrumented(Authenticate.class, user, pass);
	}
	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(Go_To_Login_form),
				Enter.theValue(user).into(Email_Input),
				Enter.theValue(pass).into(Password_Input));
		actor.attemptsTo(Click.on(Button_Authenticate));
	}
}
