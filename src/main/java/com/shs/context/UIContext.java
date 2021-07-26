package com.shs.context;

import com.codeborne.selenide.Selenide;
import lombok.AccessLevel;
import lombok.Getter;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class UIContext {
    @Getter(AccessLevel.NONE)
    private Object currentPage;

    public <T> void setCurrentPage(T page) {
        currentPage = page;
    }

    public <T> T getCurrentPage(Class<T> clazz) {
        if (!clazz.isInstance(currentPage)) {
            synchronized (getWebDriver()) {
                currentPage = Selenide.page(clazz);
            }
        }
        return clazz.cast(currentPage);
    }
}
