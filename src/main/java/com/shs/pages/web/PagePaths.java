package com.shs.pages.web;

import framework.utils.PropertiesReader;
import java.util.Properties;

public class PagePaths {
    private static PropertiesReader propertiesReader = new PropertiesReader();
    private static final Properties properties = propertiesReader.loadPropertiesFile("run.properties");

    public static final String LOGIN_PAGE = properties.getProperty("url") + "site/login";
    public static final String INSURANCE_PAGE = properties.getProperty("url") + "nbt/insurance";

}
