package StepDefinition;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/Features/MercuryTours.feature",glue= {"StepDefinition"},
monochrome=true)

public class StepRunner extends AbstractTestNGCucumberTests  {

}



