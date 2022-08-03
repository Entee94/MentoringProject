package pageobject;

import locators.SearchPageLocators;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SearchPage extends SearchPageLocators {

    public String getSearchResultsAmount () {
        log.info("Get search results amount");
        return searchResultsAmount.getText();
    }
}
