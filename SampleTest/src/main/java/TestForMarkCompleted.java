import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

@RunWith(Parameterized.class)
public class TestForMarkCompleted extends SeleniumTest {
	
	
	private Object val;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Task 1"},  // Valid index
            {"Task 3"}  // Index out of bounds
        });
    }

    public TestForMarkCompleted(Object val) {
        this.val = val;
    }

    @Test
    public void executeTest() {
        // Call runTest with the necessary data
    	//setUp();
        runTest(val);

        // Add assertions or verifications here (if needed)
    }
    
    
    public void runTest(Object val) {
		//setUp();

        try {
            //driver.get("http://todomvc-app-for-testing.surge.sh/");

            // Find all todo items
           
        	 WebElement todoInput = driver.findElement(By.xpath("//label[contains(text(),'"+val+"')]//preceding-sibling::input[@type='checkbox']"));
             todoInput.click();
               // System.out.println("hef"+todoInput.getAccessibleName());
                try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

                // Optionally, add assertions or further actions here to verify that the task is marked as completed
        } finally {
            // Clean up the WebDriver
        }
	}
}
