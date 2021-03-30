package com.utest.register.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/")
public class


RegisterUserInterface extends PageObject {
    public static final Target BTN_JOINTODAY = Target.the("click the Join button").locatedBy("//*[@class='unauthenticated-nav-bar__sign-up']");

    public static final Target TXT_NAME= Target.the("Enter name").locatedBy("//*[@id='firstName']");

    public static final Target TXT_LASTNAME= Target.the("Enter last name").locatedBy("//*[@id='lastName']");

    public static final Target TXT_EMAIL= Target.the("Enter email").locatedBy("//*[@id='email']");

    public static final Target BIRTHMOUNTH_LIST= Target.the("Click on list of the month of birth").locatedBy("//*[@id='birthMonth']");
    
    public static final Target BIRTHMOUNTH= Target.the("Select birthmonth").locatedBy("//*[@id='birthMonth']/option[contains(text(),'{0}')]");

    public static final Target BIRTHDAY_LIST= Target.the("Click on list of the day of birth").locatedBy("//*[@id='birthDay']");

    public static final Target BIRTHDAY= Target.the("Select birthday").locatedBy("//*[@id='birthDay']/option[text()='{0}']");

    public static final Target BITHYEAR_LIST= Target.the("Click on of the year of birth").locatedBy("//*[@id='birthYear']");

    public static final Target BITHYEAR= Target.the("Select bithyear").locatedBy("//*[@id='birthYear']/option[text()='{0}']");

    public static final Target BTN_NEXTLOCATION = Target.the("Click on the Next location button").locatedBy("//*[@class='btn btn-blue']");


//PAGE 2

    public static final Target TXT_CITY= Target.the("Select city").locatedBy("//*[@id='city']");

    public static final Target TXT_POSTALCODE= Target.the("Select postalcode").locatedBy("//*[@id='zip']");

    public static final Target TXT_COUNTRY_LIST= Target.the("Click on country list").locatedBy("//*[@name='countryId']");
    
    public static final Target TXT_COUNTRY= Target.the("Select country").locatedBy("//*[@class='ui-select-choices ui-select-choices-content ui-select-dropdown dropdown-menu']//*[text()='{0}']");

    public static final Target BTN_NEXTDEVICES = Target.the("Click on the Next devices button").locatedBy("//*[@class='btn btn-blue pull-right']");

    //PAGE3

    public static final Target TXT_COMPUTER_lIST= Target.the("Click on computer list").locatedBy("//*[text()='Your Computer:']/ancestor::*[2]//*[@name='osId']");

    public static final Target TXT_COMPUTER= Target.the("Select computer").locatedBy("//*[@id='ui-select-choices-row-3-2']//*[text()='{0}']");


    public static final Target TXT_VERSION_LIS= Target.the("Click on version list").locatedBy("//*[text()='Version:']/ancestor::*[2]//*[@name='osVersionId']");
 
    public static final Target TXT_VERSION= Target.the("Select version").locatedBy("//*[@id='ui-select-choices-row-4-1']//*[text()='{0}']");
    
    public static final Target TXT_LENGUAGEFIELD_LIST= Target.the("Click on Lenguage list").locatedBy("//*[text()='Language:']/ancestor::*[2]//*[@name='osLanguageId']");

    public static final Target TXT_LENGUAGEFIELD= Target.the("Select Lenguage").locatedBy("//*[@id='ui-select-choices-row-5-37']//*[text()='{0}']");

    public static final Target BTN_CONTINUE= Target.the("Click on the continue button").
            locatedBy("//a[@class='btn btn-blue pull-right']");


    //PAGE 4
    public static final Target TXT_THE_LAST_STEP = Target.the("title last step").locatedBy("//span[@class='sub-title']");
    public static final Target PASSWORD_INPUT = Target.the("Input a password").located(By.id("password"));
    public static final  Target PASSWORD_CONFIRM_INPUT = Target.the("Confirm the password ")
            .located(By.id("confirmPassword"));
    public static final  Target TERM_OF_USE_INPUT = Target.the("Confirm the terms of use ")
            .located(By.xpath("//input[@id='termOfUse']"));
    public static final  Target PRIVACY_INPUT = Target.the("Confirm the privacy settings")
            .located(By.xpath("//input[@id='privacySetting']"));
    public static final  Target COMPLETE_SETUP_BUTTON = Target.the("Button for the last section")
            .located(By.xpath("//a[contains(@id,'laddaBtn')]//span"));
}
