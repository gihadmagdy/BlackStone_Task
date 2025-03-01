package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"
                ,"html:target/cucumber-html-report-html"
                ,"junit:target/cucumber/result.xml"}
        ,glue = {"stepDefinition"}
        ,features = {"src/test/java/features"}
)
public class TestRunner {
}
