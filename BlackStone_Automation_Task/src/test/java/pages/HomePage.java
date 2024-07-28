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

public class HomePage {

    public WebDriver driver;
    WebDriverWait wait;
    private static final long WAIT = 30;
    String homepagetitle="Dashboard";

    @FindBy(xpath = "//*[@class='breadcrumb']//p")
    public WebElement webtitle;

    @FindBy(xpath = "(//img)[2]")
    public WebElement accountimg;

    @FindBy(xpath = "(//ul[@class='dropdown']//li)[3]")
    public WebElement logoutBo;


    @FindBy(xpath ="//*[text()='Sign In']")
    public WebElement signinlogo;

    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT));
    }

    public void validateHomePAge(){
        wait.until(ExpectedConditions.visibilityOf(webtitle));
        Assert.assertEquals(webtitle.getText(),homepagetitle);
    }

    public void clickaccountImg(){
        accountimg.click();
    }

    public void clickLogout(){
        wait.until(ExpectedConditions.visibilityOf(logoutBo));
        logoutBo.click();
    }
    public void validatesignin(){
        wait.until(ExpectedConditions.visibilityOf(signinlogo));
        Assert.assertEquals(signinlogo.getText(),"Sign In");
    }




}
