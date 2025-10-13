package com.example.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.example.steps", "com.example.hooks"},
        plugin = {"pretty", "summary", "html:target/cucumber-reports.html"},
        monochrome = true
)
public class Run_Cukes_Test extends AbstractTestNGCucumberTests {
    // No code needed here — TestNG will handle execution.
}
