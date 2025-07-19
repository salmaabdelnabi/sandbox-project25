package workshopTests;

import engine.Bot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public abstract class TestCase {
    Bot bot;

    @BeforeMethod
    public void methodSetup(){
        bot = new Bot();
    }

    @AfterMethod
    public void methodTearDown(){
        bot.quit();
        bot = null;
    }
}
