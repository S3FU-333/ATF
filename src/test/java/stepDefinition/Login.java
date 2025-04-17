package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static UTIL.Action.*;
import static UTIL.HighLightElement.highLightElement;
import static UTIL.WaitUntil.waitUntil;


public class Login extends AbstractStepDef {
    @Given("user insert username")
    public void userInsertUsername() {
        navigate(loginPageUrl, driver);
        waitUntil(3);
        sendKey(loginPage.getUsernameField(), "Admin");
    }

    @And("user insert password")
    public void userInsertPassword() {
        isDisplayed(loginPage.getLoginLogo());
        sendKey(loginPage.getPasswordField(), "admin123");
        waitUntil(3);
        click(homePage.getLogOutButton(),1
    }

    @When("user clicks on Login button")
    public void userCliskcOnLoginButton() {
        click(loginPage.getSubmitButton(), 1);
    }

    @Then("user is redirect to homepage")
    public void userIsRedirectToHomePage() {
        waitUntil(3);
        Assert.assertEquals("Dashboard", homePage.getDashboardSign().getText());
        highLightElement(homePage.getDashboardSign());
    }
}



