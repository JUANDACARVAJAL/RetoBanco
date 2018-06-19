package automatizacion.herokuapp.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/Agendar_Cita.feature",
snippets = SnippetType.CAMELCASE)
public class RunnerTags {

}
