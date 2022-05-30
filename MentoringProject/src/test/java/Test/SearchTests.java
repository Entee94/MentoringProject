package Test;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;
import pageobject.HomePage;
import pageobject.SearchPage;

@Slf4j
public class SearchTests extends BaseTest{
    private HomePage homePage;
    private SearchPage searchPage;
    @Test
    public void test() {
        homePage = new HomePage();
        homePage.clickVehicleTypeSearchTab("bike");
        homePage.selectVehicleManufacturer("bike", "BMW");
        homePage.selectVehicleModel("bike", "F 650 CS");
        searchPage = homePage.clickSearchButton();
        log.info("The amount of found vehicles is " + searchPage.getSearchResultsAmount());
    }
}