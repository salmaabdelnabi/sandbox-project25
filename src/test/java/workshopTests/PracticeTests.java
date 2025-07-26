package workshopTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DuckDuckGo;
import pages.HerokuApp;

@Test
public class PracticeTests extends TestCase{

    //Workshop Task #3
    public void navigateToDuckDuckGoSearchForSeleniumWebDriverAssertFirstResult(){
        DuckDuckGo duckDuckGo = new DuckDuckGo(bot);
        duckDuckGo.navigate();
        duckDuckGo.search("Selenium WebDriver");
        Assert.assertEquals(duckDuckGo.getSearchResultLink(1), "https://www.selenium.dev/documentation/webdriver/");
    }

    //Workshop Task #6
    public void navigateToHerokuAppCheckCheckbox1AndAssertBothCheckboxesAreChecked(){
        HerokuApp herokuApp = new HerokuApp(bot);
        herokuApp.navigate();
        herokuApp.checkCheckbox(1);
        Assert.assertTrue(herokuApp.isCheckbox1Checked(), "Checkbox 1 should be checked");
        Assert.assertTrue(herokuApp.isCheckbox2Checked(), "Checkbox 2 should be checked");
    }
}
