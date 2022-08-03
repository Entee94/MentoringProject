package locators;

import basic.BasicActions;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

abstract public class HomePageLocators extends BasicActions {

    protected static final String VEHICLE_TYPE_SEARCH_TAB_LOCATOR = "//button[@aria-label='%s-search']";
    protected static final String MAKE_DROPDOWN_LOCATOR = "//*[@aria-label='%ss-make-filter']";
    protected static final String MODEL_DROPDOWN_LOCATOR = "//*[@aria-label='%ss-model-filter']";
    protected static final String DROPDOWN_VALUE_LOCATOR = "//*[contains(text(), '%s')]";
    protected static final String COOKIE_IFRAME_ID = "gdpr-consent-notice";

    protected SelenideElement searchButton = $(By.xpath("//*[@class='hf-searchmask-form__filter__search-button sc-btn-bob sc-absolute-center']"));
    protected SelenideElement acceptCookiesButton = $(By.xpath("//*[@id = 'save']"));
    protected SelenideElement logo = $(By.xpath("//a[@title='AutoScout24']"));

}