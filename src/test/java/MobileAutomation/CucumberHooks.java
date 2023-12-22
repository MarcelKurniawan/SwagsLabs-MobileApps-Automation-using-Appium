package MobileAutomation;

import MobileAutomation.BaseTest;
import io.cucumber.java.*;

public class CucumberHooks {

    @BeforeAll
    public static void beforeAll() {
        BaseTest.setup();
    }

    @AfterAll
    public static void afterAll() {
        BaseTest.stopDriver();
    }

    @After
    public static void after() {
        BaseTest.resetApp();
    }

}