package framework.config;

import com.codeborne.selenide.Selenide;

public class SelenideConfig {
    public void runConfig() {
        Selenide.clearBrowserCookies();
        Selenide.closeWebDriver();
    }
}
