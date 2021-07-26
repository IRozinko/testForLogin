package com.shs;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources"},
//    glue = "src.test.java.com.si.definitions",
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
        tags = {"@login_001"}
)

public class TestRunner {
}
