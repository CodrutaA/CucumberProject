package FirstProjectBDD;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "",
        features = "",
        plugin = {"pretty"})

public class RunCucumberTest {

}
