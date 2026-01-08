package StepDefinition;

import BasePac.baseTest;
import MobileWisePages.LoginPage;
import Utils.ScreenShot;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static BasePac.baseTest.driver;
import static BasePac.baseTest.wait;

public class LoginSteps {
    ScreenShot takeShot;
    LoginPage loginPage;

    @Given("User is on home Page")
    public void user_is_on_homepage() throws IOException, InterruptedException {
        takeShot = new ScreenShot();
        loginPage = new LoginPage(baseTest.driver, baseTest.wait, baseTest.props);
        System.out.println("Current Url " + driver.getTitle());
       // takeShot.takeScreenShot(driver,"url");
        loginPage.login();
       boolean islogoDisply =  loginPage.logo();
       System.out.println("is logo Displayed : " + islogoDisply);
       //loginPage.entUserName();
    }

    @When("the login page should display the following elements")
    public void the_login_page_should_display_the_following_elements(DataTable dataTable){
        List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> row : list) {

            String element = row.get("element");
            String expected = row.get("expected");

            System.out.println("Checking element: " + element);
            System.out.println("Expected value: " + expected);

            boolean result;

            // Map feature table element names to Page Object methods
            switch (element) {
                case "logo":
                    result = loginPage.logo();
                    break;
                case "bannerImg":
                    result = loginPage.bannerImg();
                    break;
                case "welcomeTitle":
                    result = loginPage.verifyWelcomeTitle(expected);
                    break;
                case "signINTo":
                    result = loginPage.verifySignINTo(expected);
                    break;
                case "userEmailTxt":
                    result = loginPage.verifyUserEmailTxt(expected);
                    break;
                case "userIcon":
                    result = loginPage.visibilityOfUserIcon();
                    break;
                case "passwordTxt":
                    result = loginPage.verifyPasswordTxt(expected);
                    break;
                case "eyeIcon":
                    result = loginPage.eyeIcon();
                    break;
                case "forgotPasswordTxt":
                    result = loginPage.verifyForgotPasswordTxt(expected);
                    break;
                case "signInWith":
                    result = loginPage.verifySignInWith(expected);
                    break;
                default:
                    System.out.println("Element not recognized: " + element);
                    result = false;
            }

            System.out.println("Verification result: " + result);
            System.out.println("Element: " + element + ", Expected: " + expected + ",  Result: " + result);


            Assert.assertTrue(result,"Verification failed for element: " + element);
        }
    }
}
