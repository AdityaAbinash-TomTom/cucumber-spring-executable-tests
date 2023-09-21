package example.cucumberspringexecutabletests.steps;

import example.cucumberspringexecutabletests.config.Config;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SuppressWarnings("all")
@SpringBootTest
@CucumberContextConfiguration
@ContextConfiguration(classes = Config.class)
@EnableAutoConfiguration
public class SpringIntegrationTest {
}
