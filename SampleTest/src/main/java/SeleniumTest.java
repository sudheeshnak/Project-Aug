import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public abstract class SeleniumTest {
    public static WebDriver driver;
    static String url = "http://todomvc-app-for-testing.surge.sh/";

    static {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\bioman\\geckodriver-v0.33.0-win64\\geckodriver.exe");
            //FirefoxOptions options = new FirefoxOptions();
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
            driver.get(url);
 
    }

    public abstract void runTest(Object val);
    
   
    
   
}
