package com.utest.register.tasks;

import java.util.List;

import com.utest.register.models.ThirdField;
import com.utest.register.userinterfaces.RegisterUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.utest.register.userinterfaces.RegisterUserInterface.*;

public class RegisterTaskThrid  implements Task {
	private List<ThirdField> data;

	public RegisterTaskThrid(List<ThirdField> data) {
		this.data=data;
	}
	
    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(Click.on(TXT_COMPUTER_lIST),
    		   Click.on(TXT_COMPUTER.of(data.get(0).getComputer())),
    		   Click.on(TXT_VERSION_LIS),
    		   Click.on(TXT_VERSION.of(data.get(0).getVersionfield())),
    		   Click.on(TXT_LENGUAGEFIELD_LIST),
    		   Click.on(TXT_LENGUAGEFIELD.of(data.get(0).getLanguagefield())),
    		   Click.on(BTN_CONTINUE),
			   Enter.theValue(data.get(0).getPassword()).into(PASSWORD_INPUT),
			   Enter.theValue(data.get(0).getPassword()).into(RegisterUserInterface.PASSWORD_CONFIRM_INPUT),
			   Click.on(RegisterUserInterface.TERM_OF_USE_INPUT),
			   Click.on(RegisterUserInterface.PRIVACY_INPUT));




    }

    public static RegisterTaskThrid fields(List<ThirdField> data) {

        return Tasks.instrumented(RegisterTaskThrid.class,data);
    }

}

