package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"steps","hooks"},
        tags = "@login or @accounts",
        plugin={"pretty",
                "json:target/MyReports/report.json",
                "junit:target/MyReports/report.xml",
                "html:target/MyReports/html-report.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:test-output-thread/"}
)


public class JunitTestRunner {
}
