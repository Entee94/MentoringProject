package Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.*;
import pageobject.HomePage;


public class BaseTest {

    private static final String BROWSER_SIZE = "1920x1080";
    private static final String BASE_LINK = "https://www.autoscout24.com/";

    private HomePage homePage;

    @BeforeClass
    public void tearUp(){
        open(BASE_LINK);
        Configuration.browserSize = BROWSER_SIZE;

//        homePage = new HomePage();
//        homePage.closeCookiesPopUp();
    }



}
