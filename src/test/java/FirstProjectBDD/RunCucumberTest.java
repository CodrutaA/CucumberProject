package FirstProjectBDD;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"src/test/java/FirstProjectBDD"},
        strict = true,
        features = {"src/test/resources/FirstProjectBDD/first.feature"},
        plugin = {"pretty"})

public class RunCucumberTest {

}
