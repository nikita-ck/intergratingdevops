package com.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class StepDef1 {
    private WebDriver driver;

    @Given("I am on the {string} page")
    public void i_am_on_the_page(String url) {
        driver = new ChromeDriver();
        driver.get(url);
    }

    @Then("I should see the text {string}")
    public void i_should_see_the_text(String expectedText) {
        String actualText = driver.findElement(By.xpath("//h1[text()='Example Domain']")).getText();
        assertTrue("Text not found: " + expectedText, actualText.contains(expectedText));
        driver.quit();
    }
}
