package example.cucumberspringexecutabletests.steps;

import example.cucumberspringexecutabletests.config.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MyStepDefs {

    private final Config config;

    @Given("the test jar is built")
    public void MyStepDefs() {
        assert true;
    }

    @When("the test jar is executed")
    public void when() {
        assert true;
    }

    @Then("the test jar prints \"Hello World\"")
    public void then() {
        assert config.getMessage().equals("Hello World");
    }
}
