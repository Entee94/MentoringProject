package pageobject;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;

public class HomePage {

    private static String VEHICLE_TYPE_SEARCH_TAB_LOCATOR = "//button[@aria-label='%s-search']";
    private static String MAKE_DROPDOWN_LOCATOR = "//*[@aria-label='%ss-make-filter']";
    private static String MAKE_DROPDOWN_VALUE_LOCATOR = "//*[text()='%s']";

    private SelenideElement searchButton = $(By.xpath("//*[@class='hf-searchmask-form__filter__search-button sc-btn-bob sc-absolute-center']"));

    public void clickVehicleTypeSearchTab(String vehicleType) {

        SelenideElement vehicleTypeSearchTabElement = $(By.xpath(String.format(VEHICLE_TYPE_SEARCH_TAB_LOCATOR, vehicleType)));
        vehicleTypeSearchTabElement.click();

    }

    public void selectVehicleManufacturer(String vehicleType, String manufacturerName) {
        SelenideElement makeDropdownValueElement = $(By.xpath(String.format(MAKE_DROPDOWN_LOCATOR, vehicleType) + String.format(MAKE_DROPDOWN_VALUE_LOCATOR, manufacturerName)));
        makeDropdownValueElement.click();
    }

    public void clickSearchButton() {
        searchButton.click();
    }
}
