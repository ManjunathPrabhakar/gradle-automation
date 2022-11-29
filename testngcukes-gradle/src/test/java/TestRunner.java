import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        glue = {"com.github.mp.stepdefs","com.github.mp.init"},
        features = "src/test/features",
        publish = false
)
public class TestRunner extends AbstractTestNGCucumberTests{
    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}