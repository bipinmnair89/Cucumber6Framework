package testrunner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
                 features = {"src/test/resources/features"},
                 glue = {"steps","hooks"},
                 tags = "@login or @accounts",
                 plugin={"pretty"}

)
public class MySerenityTestRunner {
}
