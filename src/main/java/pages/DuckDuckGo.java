package pages;

import engine.Bot;
import org.openqa.selenium.By;

public class DuckDuckGo {
    private static final String url = "https://duckduckgo.com/";
    private final Bot bot;
    private static final By duckDuckGoSearchBoxLocator = By.id("searchbox_input");

    public DuckDuckGo(Bot bot){
        this.bot = bot;
    }

    public void navigate(){
        bot.navigateTo(url);
    }

    public void search(String text){
        bot.searchFor(duckDuckGoSearchBoxLocator, text);
    }

    public String getSearchResultLink(int index){
        By searchResultLinkLocator = By.xpath("(//a[@data-testid='result-extras-url-link'])["+index+"]");
        return bot.getHref(searchResultLinkLocator);
    }
}
