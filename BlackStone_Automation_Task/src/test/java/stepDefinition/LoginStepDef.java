package stepDefinition;

import Utils.BrowserDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.LoginPage;

import java.io.IOException;

public class LoginStepDef extends BrowserDriver {

    private LoginPage loginPage;
    public HomePage homePage;
    private BrowserDriver browserDriver;


    @Given("user navigate to login page")
    public void user_navigate_to_login_page() throws IOException {
        browserDriver=new BrowserDriver();
        browserDriver.openurl();

        loginPage=new LoginPage(driver);
        loginPage.validateLoginPage();
    }
    @And("user enters username and password")
    public void user_enters_username_and_password(){
        loginPage.enterUsername();
        loginPage.enterPassword();
    }
    @And("user click signin button")
    public void user_enter_click_signin_button(){
        loginPage.clickSignIn();
    }


}
