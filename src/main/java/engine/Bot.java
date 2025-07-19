package engine;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Bot {
    WebDriver driver;
    Wait<WebDriver> wait;

    public Bot(){
        driver = new ChromeDriver();
        wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(2))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(NoSuchElementException.class);
    }

    public void quit(){
        driver.quit();
    }

    public void navigateTo(String url){
        driver.navigate().to(url);
    }

    public void searchFor(By searchBoxLocator, String text){
        var searchBox = driver.findElement(searchBoxLocator);
        searchBox.sendKeys(text);
        searchBox.submit();
    }

    public String getHref(By elementLocator){
        return wait.until(d -> d.findElement(elementLocator).getAttribute("href"));
    }
}
