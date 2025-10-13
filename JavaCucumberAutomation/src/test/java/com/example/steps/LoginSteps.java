package com.example.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginSteps {
    private WebDriver driver;

    @Before
    public void setupDriver(){
        System.setProperty("webdriver.chrome.driver" , System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("I am on Generator")
    public void i_am_on_generator() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Given step");
    }
    @When("I provide valid admin user details")
    public void i_provide_valid_admin_user_details() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("When step");
    }
    @Then("I can login to Generator")
    public void i_can_login_to_generator() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Then step");
    }
    @Then("the collections page is loaded")
    public void the_collections_page_is_loaded() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Then step");
    }
}
