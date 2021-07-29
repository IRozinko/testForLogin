package framework.config;

import com.codeborne.selenide.Configuration;

public class BrowserConfig {
    public void runConfig() {

        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.headless = false;
        //Configuration.holdBrowserOpen = true;

    }
}
