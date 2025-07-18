package engine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Bot {
    WebDriver driver;
    Wait<WebDriver> wait;

    public Bot(){
        driver = new ChromeDriver();
        wait = new FluentWait<>(driver);
    }

    public void quit(){
        driver.quit();
    }

    public void navigateToUrl(String url){
        driver.navigate().to(url);
    }
}
