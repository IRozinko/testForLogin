package framework.config;

import com.codeborne.selenide.Configuration;

public class BrowserConfig {
    public void runConfig() {

        Configuration.browser = "firefox";
        Configuration.startMaximized = true;
        Configuration.headless = false;
        //Configuration.holdBrowserOpen = true;

    }
}
