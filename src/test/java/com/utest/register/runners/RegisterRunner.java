package com.utest.register.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/register.feature",
        glue= "com/utest/register/stepdefinitions",
        snippets= SnippetType.CAMELCASE,
        monochrome = true)
public class RegisterRunner {

}
