package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "stepDef",
        tags = "@nickelSelling",
        plugin = {"pretty", "json:target/cucumber-reports/report.json",
                "junit:target/cucumber-reports/report.xml",
                "html:target/cucumber-reports/report.html"},

        monochrome = true,
        publish = true
)
public class RunTest {
}
