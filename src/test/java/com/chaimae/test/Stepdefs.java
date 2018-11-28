package com.chaimae.test;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

public class Stepdefs {
    String usename,pass;

    @Given("^user fill in \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_fill_in_and(String arg1, String arg2) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        usename=arg1;
        pass=arg2;
    }

    @When("^usename and password are correct$")
    public void usename_and_password_are_correct() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(usename,"chaimae");
    }

    @Then("^redirecting user to home page$")
    public void redirecting_user_to_home_page() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("You are on home page");
    }

}