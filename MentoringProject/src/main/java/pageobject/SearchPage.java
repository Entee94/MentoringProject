package pageobject;

import com.codeborne.selenide.SelenideElement;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Slf4j
public class SearchPage {

    private SelenideElement searchResultsAmount = $(By.xpath("//span[@data-testid = 'list-header-title']/preceding-sibling::span/span[1]"));

    public String getSearchResultsAmount () {
        log.info("Get search results amount");
        return searchResultsAmount.getText();
    }
}
