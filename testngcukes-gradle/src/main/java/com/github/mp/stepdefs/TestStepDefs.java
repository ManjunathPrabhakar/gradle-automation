package com.github.mp.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestStepDefs {
    @Given("Some Given One")
    public void someGivenOne() {
        System.out.println("TestStepDefs.someGivenOne");
    }

    @When("Some When One")
    public void someWhenOne() {
        System.out.println("TestStepDefs.someWhenOne");
    }

    @Then("Some Then One")
    public void someThenOne() {
        System.out.println("TestStepDefs.someThenOne");
    }

    @Given("Some Given two")
    public void someGivenTwo() {
        System.out.println("TestStepDefs.someGivenTwo");
    }

    @When("Some When two")
    public void someWhenTwo() {
        System.out.println("TestStepDefs.someWhenTwo");
    }

    @Then("Some Then two")
    public void someThenTwo() {
        System.out.println("TestStepDefs.someThenTwo");
    }
}
