package pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;

import java.time.Duration;

@Slf4j
public class HomePage {

    private static final String VEHICLE_TYPE_SEARCH_TAB_LOCATOR = "//button[@aria-label='%s-search']";
    private static final String MAKE_DROPDOWN_LOCATOR = "//*[@aria-label='%ss-make-filter']";
    private static final String MODEL_DROPDOWN_LOCATOR = "//*[@aria-label='%ss-model-filter']";
    private static final String DROPDOWN_VALUE_LOCATOR = "//*[contains(text(), '%s')]";

    private SelenideElement searchButton = $(By.xpath("//*[@class='hf-searchmask-form__filter__search-button sc-btn-bob sc-absolute-center']"));
    private SelenideElement acceptCookiesButton = $(By.xpath("//*[@id = 'save']//*[@class = 'mat-button-focus-overlay']"));

    public void clickVehicleTypeSearchTab(String vehicleType) {
        log.info("Click " + vehicleType + " Search tab");
        SelenideElement vehicleTypeSearchTabElement = $(By.xpath(String.format(VEHICLE_TYPE_SEARCH_TAB_LOCATOR, vehicleType)));
        vehicleTypeSearchTabElement.click();
    }

    public void selectVehicleManufacturer(String vehicleType, String manufacturerName) {
        log.info("Select " + manufacturerName + " manufacturer from dropdown");
        SelenideElement makeDropdownValueElement = $(By.xpath(String.format(MAKE_DROPDOWN_LOCATOR, vehicleType) + String.format(DROPDOWN_VALUE_LOCATOR, manufacturerName)));
        makeDropdownValueElement.click();
    }

    public void selectVehicleModel(String vehicleType, String modelName) {
        log.info("Select " + modelName + " model from dropdown");
        SelenideElement modelDropdownValueElement = $(By.xpath(String.format(MODEL_DROPDOWN_LOCATOR, vehicleType) + String.format(DROPDOWN_VALUE_LOCATOR, modelName)));
        modelDropdownValueElement.click();
    }

    public SearchPage clickSearchButton() {
        log.info("Click Search button");
        searchButton.click();
        return new SearchPage();
    }

    public void closeCookiesPopUp() {

//        executeJavaScript("document.getElementById(\"save\").click()");
          acceptCookiesButton.should(Condition.exist, Duration.ofSeconds(10));
          acceptCookiesButton.click();
    }
}
