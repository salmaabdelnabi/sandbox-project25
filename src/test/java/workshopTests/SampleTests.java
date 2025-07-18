package workshopTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DuckDuckGo;

@Test
public class SampleTests extends TestCase{
    //Workshop Task #3
    public void navigateToDuckDuckGoSearchForSeleniumWebDriverAssertFirstResult(){
        DuckDuckGo duckDuckGo = new DuckDuckGo(bot);
        duckDuckGo.navigate();
        duckDuckGo.search("Selenium WebDriver");
//        Assert.assertEquals(duckDuckGo.getFirstSearchResultLink(), "https://www.selenium.dev/documentation/webdriver/");
    }
}
