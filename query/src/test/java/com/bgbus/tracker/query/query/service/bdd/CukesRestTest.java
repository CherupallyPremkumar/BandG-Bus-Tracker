package com.bgbus.tracker.query.query.service.bdd;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/rest/features",
		glue = {"classpath:org/chenile/cucumber/rest", "classpath:com/bgbus/tracker/query/query/service/bdd"},
        plugin = {"pretty"}
        )
@ActiveProfiles("unittest")
public class CukesRestTest {

}
