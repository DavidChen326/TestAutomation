package co.indebted.mypackage.bdd;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features", glue = "co.indebted.mypackage.bdd")
public class LoginTestRunner {

}
