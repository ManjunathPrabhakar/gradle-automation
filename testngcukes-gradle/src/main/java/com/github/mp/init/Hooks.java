package com.github.mp.init;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void beforeCukes(Scenario scenario){
        String data =
                "---------- START BEFORE SCENARIO ----------\n" +
                        "Scenario Name : " + scenario.getName() +
                        "\nScenario Tags : " + scenario.getSourceTagNames() +
                        "\nThread Name : " + Thread.currentThread().getName() +
                        "\nThread ID : " + Thread.currentThread().getId() +
                "\n------------- END BEFORE SCENARIO";
        System.out.println(data);
    }

    @After
    public void afterCukes(Scenario scenario){
        String data =
                "---------- START AFTER SCENARIO ----------\n" +
                        "Scenario Name : " + scenario.getName() +
                        "\nScenario Tags : " + scenario.getSourceTagNames() +
                        "\nThread Name : " + Thread.currentThread().getName() +
                        "\nThread ID : " + Thread.currentThread().getId() +
                        "\nScenario Result : " + scenario.getStatus() +
                        "\n------------- END AFTER SCENARIO";
        System.out.println(data);
    }

}
