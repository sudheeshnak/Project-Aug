import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    TestForAddTodo.class,
    TestForMarkCompleted.class,
    TestForDeleteTodo.class
})
public class SeleniumTestSuite {
}