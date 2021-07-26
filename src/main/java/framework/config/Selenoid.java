package framework.config;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Selenoid {
    public void runConfig() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setVersion("76.0");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);

        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Configuration.browserCapabilities = capabilities;
    }
}
