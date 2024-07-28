package stepDefinition;
import Utils.BrowserDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HomePage;

public class HomeStepDef extends BrowserDriver{

    private HomePage homePage=new HomePage(driver);

    @Then("validate user navigated on homepage")
    public void validate_user_navigated_to_homepage(){
        homePage.validateHomePAge();
    }
    @And("user click on account image")
    public void user_click_account_image(){
        homePage.clickaccountImg();
    }
    @And("user clicks on logout button")
    public void user_click_logout_button(){
        homePage.clickLogout();
    }
    @Then("validate navigated on sign-in")
    public void validate_navigated_signin(){
        homePage.validatesignin();
        driver.quit();
        
    }
}
