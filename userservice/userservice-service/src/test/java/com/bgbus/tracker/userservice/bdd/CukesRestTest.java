package com.bgbus.tracker.userservice.bdd;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/features",
    glue = {"classpath:com/bgbus/tracker/userservice/bdd", "classpath:org/chenile/cucumber/rest",
    "classpath:org/chenile/cucumber/security/rest"},
        plugin = {"pretty"}
        )
@ActiveProfiles("unittest")
public class CukesRestTest {

}