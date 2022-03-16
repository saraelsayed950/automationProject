package com.automation.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class registerStepDefinition {

    @Given("user go to login page")
    public void user_go_to_login_page()
    {
        //Hooks.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]")).click();
        Hooks.driver.findElement(By.linkText("Register")).click();
    }

    @When("^user entered \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_entered_data(String firstname,String lastname,String email,String password)
    {
        Hooks.driver.findElement(By.id("FirstName")).sendKeys(firstname);
        Hooks.driver.findElement(By.id("LastName")).sendKeys(lastname);
        Hooks.driver.findElement(By.id("Email")).sendKeys(email);
        Hooks.driver.findElement(By.id("Password")).sendKeys(password);
    }
    @And("user press on register button")
    public void user_press_on_register_button()
    {
        Hooks.driver.findElement(By.id("register-button")).click();
    }

    @Then("The registration page displayed successfully")
    public void The_registration_page_displayed_successfully() throws InterruptedException {

        String result=Hooks.driver.findElement(By.className("result")).getText();

        String successMsg="Your registration completed";
        Thread.sleep(2000);
        Assert.assertTrue(successMsg.contains(result));
        System.out.println("registered successfully");
        //"Your registration completed"
    }
}
