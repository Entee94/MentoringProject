package Test;

import static com.codeborne.selenide.Selenide.*;

import org.testng.annotations.Test;
import pageobject.HomePage;

public class SearchTests {
    private HomePage homePage = new HomePage();

    @Test
    public void test() {
        open("https://www.autoscout24.com/");
        homePage.clickVehicleTypeSearchTab("bike");
        homePage.selectVehicleManufacturer("bike", "BMW");
        homePage.clickSearchButton();

    }

}
