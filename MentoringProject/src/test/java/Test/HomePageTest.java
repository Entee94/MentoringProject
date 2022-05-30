package Test;

import org.testng.annotations.Test;
import pageobject.HomePage;

public class HomePageTest extends BaseTest{

    private HomePage homePage;

    @Test
    public void logoTest() {

        homePage = new HomePage();
        homePage.isLogoPresent();

    }

}
