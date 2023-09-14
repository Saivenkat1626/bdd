package Testrunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.*;
@RunWith(Cucumber.class)
@CucumberOptions(
					features="src/test/java/featurefile",
					glue="Testdefinations",
                   plugin={"pretty","html:src/Cucumberreport.html"})
			
public class Testrunner {

}
