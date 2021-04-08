package co.com.choucair.certificacion.utest.stepdefinitions;

import co.com.choucair.certificacion.utest.model.uTestData;
import co.com.choucair.certificacion.utest.questions.Answer;
import co.com.choucair.certificacion.utest.tasks.Login;
import co.com.choucair.certificacion.utest.tasks.OpenUp;
import co.com.choucair.certificacion.utest.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class uTestStepDefintions {
    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());}


    @Given("^than miguel wants to learn introduction to utest at utest academy$")
    public void thanMiguelWantsToLearnIntroductionToUtestAtUtestAcademy(List<uTestData>utestData) throws Exception {
        OnStage.theActorCalled( "Miguel").wasAbleTo(OpenUp.thePage(), Login.
                onThePage(utestData.get(0).getStrUser(),utestData.get(0).getStrPassword()));
    }

    @When("^you search for the course (.*) on the utest academy platform$")
    public void youSearchForTheCourseIntroductionToUTestOnTheUtestAcademyPlatform(List<uTestData>utestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(utestData.get(0).getStrCouser()));
    }

    @Then("^he find the course called (.*) on the platform$")
    public void heFindTheCourseCalledIntroductionToUTestOnThePlatform(List<uTestData> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestData.get(0).getStrCouser())));
    }


}

