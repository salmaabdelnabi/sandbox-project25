package pages;

import engine.Bot;

public class DuckDuckGo {
    String url;

    public DuckDuckGo(){
        url = "https://duckduckgo.com/";
    }

    public void navigate(Bot bot){
        bot.navigateToUrl(url);
    }
}
