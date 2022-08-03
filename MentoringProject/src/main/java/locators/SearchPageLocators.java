package locators;

import basic.BasicActions;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchPageLocators extends BasicActions {

    protected SelenideElement searchResultsAmount = $(By.xpath("//span[@data-testid = 'list-header-title']/preceding-sibling::span/span[1]"));
}
