package Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Cookie;
import org.testng.annotations.*;
import pageobject.HomePage;


public class BaseTest {

    private static final String BROWSER_SIZE = "1920x1080";
    private static final String BASE_LINK = "https://www.autoscout24.com/";

    private HomePage homePage;

    @BeforeClass
    public void tearUp(){
        Configuration.browserSize = BROWSER_SIZE;
        open(BASE_LINK);
        homePage = new HomePage();
        homePage.closeCookiesPopUp();

    }

    @AfterClass
    public void tearDown(){
        closeWebDriver();
    }



}
