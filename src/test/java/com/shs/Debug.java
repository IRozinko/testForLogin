package com.shs;

import com.codeborne.selenide.Selenide;
import framework.config.BrowserConfig;
import framework.utils.PropertiesReader;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Properties;

public class Debug {
    @Before
    public void setUp() {

        new BrowserConfig().runConfig();
    }

    @After
    public void tearDown() {
        Selenide.clearBrowserCookies();
        Selenide.closeWindow();
    }

    // This example shows how to test PropertiesReader
    @Test
    public void readPropFromFile() {
        PropertiesReader propertiesReader = new PropertiesReader();
        Properties properties = propertiesReader.loadPropertiesFile("run.properties");
        properties.forEach((k, v) -> System.out.println(k + ":" + v));
    }

    @Test
    public void givenRegisteredCustomer() {


    }
}
