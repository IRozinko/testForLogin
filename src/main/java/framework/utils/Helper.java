package framework.utils;

import com.codeborne.selenide.SelenideElement;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Helper {
    public static void scrollAndFill(SelenideElement element, String value) {
        element
                .scrollIntoView("{block: 'center'}")
                .setValue(value);
    }

    public static void scrollAndClick(SelenideElement element) {
        element
                .scrollIntoView("{block: 'center'}")
                .click();
    }

    public static void scrollAndChooseFromDropdown(SelenideElement element, String value) {
        element
                .scrollIntoView("{block: 'center'}")
                .selectOption(value);
    }
}
