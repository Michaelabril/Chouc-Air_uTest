package com.utest.register.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import java.util.List;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.utest.register.models.ThirdField;
import com.utest.register.models.UserFirstFields;
import com.utest.register.models.UserSecond;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import com.utest.register.questions.Answer;
import com.utest.register.tasks.OpenHome;
import com.utest.register.tasks.RegisterTaskFirts;
import com.utest.register.tasks.RegisterTaskSecond;
import com.utest.register.tasks.RegisterTaskThrid;

public class RegisterStepDefinition {
	

	
    @Before
    public void DoSomethingBefore(){
        OnStage.setTheStage(new OnlineCast());
    }


	@Given("^the user is on the website$")
	public void theUserIsOnTheWebsite() {
        theActorCalled("Michael");
        theActorInTheSpotlight().wasAbleTo(OpenHome.browser());
	}


	@When("^the user fills in the data of the first form$")
	public void theUserFillsInTheDataOfTheFirstForm(List<UserFirstFields> data) {
		 theActorInTheSpotlight().attemptsTo(RegisterTaskFirts.fields(data));
	}

	@When("^the user fills in the data of the second form$")
	public void theUserFillsInTheDataOfTheSecondForm(List<UserSecond> data) {
		 theActorInTheSpotlight().attemptsTo(RegisterTaskSecond.fields(data));
	}

	@When("^the user fills in the data of the third form$")
	public void theUserFillsInTheDataOfTheThirdForm(List<ThirdField> data) {
		 theActorInTheSpotlight().attemptsTo(RegisterTaskThrid.fields(data));
	}

	@Then("^the user can enter the password (.*)$")
	public void theUserCanEnterThePassword(String message) {
		   theActorInTheSpotlight().should(GivenWhenThen
	                .seeThat(Answer.toThe(),Matchers.equalTo(message)));
	}

}
