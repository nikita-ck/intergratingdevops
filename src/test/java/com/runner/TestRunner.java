package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resource/feature",
        glue = {"com.stepdefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber-reports.json"}
)
public class TestRunner {
}
