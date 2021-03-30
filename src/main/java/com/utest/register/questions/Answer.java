package com.utest.register.questions;

import static com.utest.register.userinterfaces.RegisterUserInterface.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<String> {

	    public static Answer toThe() {
	        return new Answer();
	 }

	    @Override
	    public String answeredBy(Actor actor) {
	       return Text.of(COMPLETE_SETUP_BUTTON).viewedBy(actor).asString();

	    }

	}