import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;

@RunWith(Parameterized.class)
public class TestForDeleteTodo extends SeleniumTest {
	
	private Object val;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
        	 {"Task 2"},
             {"Task 5"} // Valid index
              // Index out of bounds
        });
    }

    public TestForDeleteTodo(Object val) {
        this.val = val;
    }

    @Test
    public void executeTest() {
        // Call runTest with the necessary data
    	//setUp();
        runTest(val);

        // Add assertions or verifications here (if needed)
    }
	 @Override
	    public void runTest(Object val) {
	        //setUp();
	        
	        try {
	             // Cast the input object to a string
	        
	        	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	        	scrollDownToElement(driver, driver.findElement(By.xpath("//label[contains(text(),'"+val+"')]//following-sibling::button")));
	                //toggle.click();
	        	try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        	
	                
	            }
	            // Iterate through the todo items and look for the one with the specified title
	            
	           
	        finally {
	            // Clean up the WebDriver
	        }
	 }
	 
	 public static void scrollDownToElement(WebDriver driver, WebElement element) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", element);
	        js.executeScript("arguments[0].click();", element);
	    }
}	   




