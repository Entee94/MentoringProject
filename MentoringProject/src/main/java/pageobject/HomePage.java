package pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

import locators.HomePageLocators;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;

import java.time.Duration;

@Slf4j
public class HomePage extends HomePageLocators {

    public void clickVehicleTypeSearchTab(String vehicleType) {
        log.info("Click " + vehicleType + " Search tab");
        SelenideElement vehicleTypeSearchTabElement = $(By.xpath(String.format(VEHICLE_TYPE_SEARCH_TAB_LOCATOR, vehicleType)));
        clickElement(vehicleTypeSearchTabElement);
    }

    public void selectVehicleManufacturer(String vehicleType, String manufacturerName) {
        log.info("Select " + manufacturerName + " manufacturer from dropdown");
        SelenideElement makeDropdownValueElement = $(By.xpath(String.format(MAKE_DROPDOWN_LOCATOR, vehicleType) + String.format(DROPDOWN_VALUE_LOCATOR, manufacturerName)));
        clickElement(makeDropdownValueElement);
    }

    public void selectVehicleModel(String vehicleType, String modelName) {
        log.info("Select " + modelName + " model from dropdown");
        SelenideElement modelDropdownValueElement = $(By.xpath(String.format(MODEL_DROPDOWN_LOCATOR, vehicleType) + String.format(DROPDOWN_VALUE_LOCATOR, modelName)));
        clickElement(modelDropdownValueElement);
    }

    public SearchPage clickSearchButton() {
        log.info("Click Search button");
        clickElement(searchButton);
        return new SearchPage();
    }

    public void closeCookiesPopUp() {

        switchTo().frame(COOKIE_IFRAME_ID);
        acceptCookiesButton.should(Condition.exist, Duration.ofSeconds(10));
        clickElement(acceptCookiesButton);
    }

    public boolean isLogoPresent() {
        return logo.exists();
    }
}
