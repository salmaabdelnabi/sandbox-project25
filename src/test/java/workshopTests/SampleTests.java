package workshopTests;

import org.testng.annotations.Test;
import pages.DuckDuckGo;

@Test
public class SampleTests extends TestCase{
    //Workshop Task #3
    public void navigateToDuckDuckGoSearchForSeleniumWebDriverAssertFirstResult(){
        DuckDuckGo duckDuckGo = new DuckDuckGo();
        duckDuckGo.navigate(bot);
    }
}
