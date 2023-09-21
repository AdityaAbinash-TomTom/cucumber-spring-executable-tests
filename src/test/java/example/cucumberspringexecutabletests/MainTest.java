package example.cucumberspringexecutabletests;

import io.cucumber.core.cli.Main;

public class MainTest {

    public static void main(String[] args) {
        String[] defaultArgs = {
            "--glue", "example/cucumberspringexecutabletests/steps",
            "classpath:features",
            "--plugin", "pretty"
        };

        Main.main(defaultArgs);
    }
}
