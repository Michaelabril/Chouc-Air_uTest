package com.utest.register.tasks;

import static com.utest.register.userinterfaces.RegisterUserInterface.BIRTHDAY;
import static com.utest.register.userinterfaces.RegisterUserInterface.BIRTHDAY_LIST;
import static com.utest.register.userinterfaces.RegisterUserInterface.BIRTHMOUNTH;
import static com.utest.register.userinterfaces.RegisterUserInterface.BIRTHMOUNTH_LIST;
import static com.utest.register.userinterfaces.RegisterUserInterface.BITHYEAR;
import static com.utest.register.userinterfaces.RegisterUserInterface.BITHYEAR_LIST;
import static com.utest.register.userinterfaces.RegisterUserInterface.BTN_JOINTODAY;
import static com.utest.register.userinterfaces.RegisterUserInterface.BTN_NEXTLOCATION;
import static com.utest.register.userinterfaces.RegisterUserInterface.TXT_EMAIL;
import static com.utest.register.userinterfaces.RegisterUserInterface.TXT_LASTNAME;
import static com.utest.register.userinterfaces.RegisterUserInterface.TXT_NAME;

import java.util.List;

import com.utest.register.models.UserFirstFields;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class RegisterTaskFirts implements Task {
	private List<UserFirstFields> data;
	
	public RegisterTaskFirts(List<UserFirstFields> data) {
		this.data=data;
	}
	
    @Override
    public <T extends Actor> void performAs(T actor) {
    	actor.attemptsTo(Click.on(BTN_JOINTODAY),
    			Enter.theValue(data.get(0).getFirstname()).into(TXT_NAME),
    			Enter.theValue(data.get(0).getLastname()).into(TXT_LASTNAME),
    			Enter.theValue(data.get(0).getEmailaddress()).into(TXT_EMAIL),
    			Click.on(BIRTHMOUNTH_LIST),
    			Click.on(BIRTHMOUNTH.of(data.get(0).getDateofbirthMouth())),
    			Click.on(BIRTHDAY_LIST),
    			Click.on(BIRTHDAY.of(data.get(0).getDateofbirthDay())),
    			Click.on(BITHYEAR_LIST),
    			Click.on(BITHYEAR.of(data.get(0).getDateofbirthYear())),
    			Click.on(BTN_NEXTLOCATION)
    			);
    }

    public static RegisterTaskFirts fields(List<UserFirstFields> data) {

        return Tasks.instrumented(RegisterTaskFirts.class,data);
    }

}
