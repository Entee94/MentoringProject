package basic;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import interfaces.PageObjectInterface;
import lombok.extern.slf4j.Slf4j;

import java.time.Duration;

@Slf4j
public class BasicActions implements PageObjectInterface {

    public void clickElement(SelenideElement element) {
        try {
            element.shouldBe(Condition.visible, Duration.ofSeconds(5));
            element.click();
        } catch (Exception e) {
            log.info(element.name() + " is not present on screen");
        }
    }

    public void fillInField(SelenideElement element, String text) {
        try {
            element.shouldBe(Condition.visible, Duration.ofSeconds(5));
            element.sendKeys(text);
        } catch (Exception e) {
            log.info(element.name() + " is not present on screen");
        }
    }

}