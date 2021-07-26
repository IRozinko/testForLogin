package com.shs.pages.web;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.shs.pages.web.PagePaths.LOGIN_PAGE;

public class LoginPage {
    private SelenideElement pageTitle = $(byText("MEMBER LOGIN"));
    private SelenideElement emailInput = $("#email");
    private SelenideElement passwordInput = $("#password");
    @Getter
    private SelenideElement loginBnt = $("#submit");
    @Getter
    private SelenideElement warningMsg = $(byXpath("//div[@class='msg msg--warning']/p"));
    private SelenideElement restorePwdLink = $(byText("Lost Password?"));

    public LoginPage openPage() {
        Selenide.open(LOGIN_PAGE);
        return this;
    }

    public void setEmail(String email) {
        emailInput.setValue(email);
    }

    public void setPassword(String password) {
        passwordInput.setValue(password);
    }

    public void loginBntClick() {
        loginBnt.click();
        pageTitle.shouldBe(disappear);
    }
}
