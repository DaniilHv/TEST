package RunnerTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "junit:target/cucumber/cucumber.xml",
                "json:target/cucumber/cucumber.json",
                "html:cucumber"
        },
        features = {"src/main/resources/Feature/bot.feature"},
        glue = "stepDefinition",
        monochrome = true,
        dryRun = false,
        tags = "@MyTest"


)
public class RunnerTest {
}
