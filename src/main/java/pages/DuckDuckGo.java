package pages;

import engine.Bot;
import org.openqa.selenium.By;

public class DuckDuckGo {
    String url;
    Bot bot;
    By duckDuckGoSearchBoxLocator = By.id("searchbox_input");
    By firstSearchResultLinkLocator = By.xpath("(//a[@data-testid='result-extras-url-link'])[1]");

    public DuckDuckGo(Bot bot){
        url = "https://duckduckgo.com/";
        this.bot = bot;
    }

    public void navigate(){
        bot.navigateTo(url);
    }

    public void search(String text){
        bot.searchFor(duckDuckGoSearchBoxLocator, text);
    }

    public String getFirstSearchResultLink(){
        return bot.getHref(firstSearchResultLinkLocator);
    }
}
