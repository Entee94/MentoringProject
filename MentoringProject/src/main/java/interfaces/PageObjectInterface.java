package interfaces;


import com.codeborne.selenide.SelenideElement;

public interface PageObjectInterface {

    void clickElement(SelenideElement element);

    void fillInField(SelenideElement element, String text);

}
