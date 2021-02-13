package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.tasks.Authenticate;
import co.com.proyectobase.screenplay.tasks.Visit;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.proyectobase.screenplay.questions.VerifyFailedAuthentication.theAuthenticationFailed;
import static co.com.proyectobase.screenplay.questions.VerifySuccessAuthentication.theAuthenticationSuccess;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginStepDefinitions {
	


    @Managed (driver="chrome")
    private WebDriver browser;
    private Actor jeiner = Actor.named("Jeiner");

    @Before public void configuration(){ 	jeiner.can(BrowseTheWeb.with(browser)); }


    @Given("^(.*) go to the library web$")
    public void jeiner_go_to_the_library_web(String actor) throws Exception {
    	jeiner.wasAbleTo(Visit.theLibraySite());

    }

    @When("^He tries to authenticate with (.*) and (.*)$")
    public void he_tries_to_authenticate_with_jrolon_hotmail_com_and_Jeiner(String user, String pass) throws Exception {
    	jeiner.attemptsTo(Authenticate.inTheLibrary(user, pass));
    }

    @Then("^He verifies the authentication is successful$")
    public void heVerifiesTheAuthenticationIsSuccessful() throws Exception {
        jeiner.should(seeThat(theAuthenticationSuccess()));
    }

    @Then("^He verifies the authentication is failed$")
    public void heVerifiesTheAuthenticationIsFailed() throws Exception {
        jeiner.should(seeThat(theAuthenticationFailed()));
    }
}
