package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    public WebDriver driver;
    WebDriverWait wait;
    private static final long WAIT = 50;
    String signin="Sign In";
    String userNAme="store@admin.com";
    String passWord="P@ssw0rd";


    @FindBy(xpath = "//*[text()='Sign In']")
    @CacheLookup
    private WebElement signinlogo;

    @FindBy(id="mat-input-0")
    public WebElement username;

    @FindBy(id="mat-input-1")
    public WebElement password;

    @FindBy(xpath = "//*[button]")
    public WebElement signinBO;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT));
    }

    public void validateLoginPage(){
        wait.until(ExpectedConditions.visibilityOf(signinlogo));
        Assert.assertEquals(signinlogo.getText(),signin);
    }
    public void enterUsername(){
        username.sendKeys(userNAme);
    }
    public void enterPassword(){
        password.sendKeys(passWord);
    }
    public void clickSignIn(){
        signinBO.click();
    }




}
