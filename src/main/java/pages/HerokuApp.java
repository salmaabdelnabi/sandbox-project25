package pages;

import engine.Bot;
import org.openqa.selenium.By;

public class HerokuApp {
    private static final String url = "https://the-internet.herokuapp.com/checkboxes";
    private final Bot bot;
    private static final String checkBoxesLocator = "(//input[@type='checkbox'])";

    public HerokuApp(Bot bot) {
        this.bot = bot;
    }

    public void navigate() {
        bot.navigateTo(url);
    }

    public void checkCheckbox(int checkboxIndex) {
        bot.checkCheckbox(By.xpath(checkBoxesLocator+ "[" + checkboxIndex + "]"));
    }

    public boolean isCheckbox1Checked() {
        return bot.isCheckboxChecked(By.xpath(checkBoxesLocator + "[1]"));
    }

    public boolean isCheckbox2Checked() {
        return bot.isCheckboxChecked(By.xpath(checkBoxesLocator + "[2]"));
    }

    public void uncheckCheckbox(int checkboxIndex) {
        bot.uncheckCheckbox(By.xpath(checkBoxesLocator + "[" + checkboxIndex + "]"));
    }
}
