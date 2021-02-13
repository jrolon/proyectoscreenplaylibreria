package co.com.proyectobase.screenplay.stepdefinitions;


import co.com.proyectobase.screenplay.tasks.Search;
import co.com.proyectobase.screenplay.tasks.Select;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


import static co.com.proyectobase.screenplay.questions.VerifyFailedFoundSearchBook.theBookDoesNotAvailable;
import static co.com.proyectobase.screenplay.questions.VerifySuccessSearchBook.theSuccessVerificationOfFindingABook;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class SearchBookStepDefinitions {

    @Managed (driver="chrome")
    private WebDriver browser;
    private Actor jeiner = Actor.named("Jeiner");

    @Before public void configuration(){ 	jeiner.can(BrowseTheWeb.with(browser)); }


    @When("^He tries to search a book with tittle (.*)$")
    public void heTriesToSearchABookWithTittleHarryPotter( String title)  {
        jeiner.attemptsTo(Search.aBookWithTitle(title));

    }

    @When("^He tries to select the first result$")
    public void heTriesToSelectTheFirstResult() {
        jeiner.attemptsTo(Select.firstResult());
    }


    @Then("^He verifies that the book is available in the library$")
    public void heVerifiesThatTheBookIsAvailableInTheLibrary()  {
        jeiner.should(seeThat(theSuccessVerificationOfFindingABook()));
    }

    @Then("^He verifies that the book does not exist$")
    public void heVerifiesThatTheBookDoesNotExist()  {
        jeiner.should(seeThat(theBookDoesNotAvailable()));
    }
}
