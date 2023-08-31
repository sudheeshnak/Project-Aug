
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

@RunWith(Parameterized.class)
public class TestForAddTodo extends SeleniumTest {
    private Object todoText;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Task 1"},
            {"Task 2"},
            {"Task 3"},
            {"Task 4"},
            {"Task 5"}
        });
    }

    public TestForAddTodo(Object todoText) {
        this.todoText = todoText;
        
    }

    @Override
    public void runTest(Object val) {
        //driver.get("http://todomvc-app-for-testing.surge.sh/");

        // Find the input field and add a new todo
        WebElement todoInput = driver.findElement(By.className("new-todo"));
        todoInput.sendKeys((String) val + Keys.ENTER);
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Test
    public void executeTest() {
       
    	
    		runTest(todoText);
    	
    }
}