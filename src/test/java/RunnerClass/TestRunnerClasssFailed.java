package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "@target/rerun.txt",
        glue = {"org.StepDefinitions", "Hooks"},
        plugin = {
                "pretty",
                "summary",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "html:target/failed-report.html"
        },
        monochrome = true
)
public class TestRunnerClasssFailed extends AbstractTestNGCucumberTests {
}
