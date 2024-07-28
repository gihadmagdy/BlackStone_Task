package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.Properties;

public class BrowserDriver {

    public static WebDriver driver;
    static LoggerManager utl=new LoggerManager();

    public  void openurl() throws IOException {


        Properties props = new PropertyManager().getProps();
        String browser = props.getProperty("Webdriver");

        if(browser.equals("chrome")) {
            driver=new ChromeDriver();
        }
        else if (browser.equals("firefox")){
            driver=new FirefoxDriver();
        }
        else if(browser.equals("edge")){
            driver=new EdgeDriver();
        }
        else {
            utl.log().info("worng driver entered");
        }

        driver.get("https://oyn-adminportal-qc-demo.salmonsky-1edff179.westeurope.azurecontainerapps.io/identity/login");
        driver.manage().window().maximize();

    }
    public void  closeBrowser(){
        driver.quit();
    }



}
