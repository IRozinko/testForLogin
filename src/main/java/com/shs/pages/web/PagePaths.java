package com.shs.pages.web;

import framework.utils.PropertiesReader;
import java.util.Properties;

public class PagePaths {
    private static PropertiesReader propertiesReader = new PropertiesReader();
    private static final Properties properties = propertiesReader.loadPropertiesFile("run.properties");

    public static final String HOMEPAGE = properties.getProperty("url");
    public static final String LOGIN_PAGE = HOMEPAGE + "site/login";
    public static final String INSURANCE_PAGE = HOMEPAGE + "nbt/insurance";

}
