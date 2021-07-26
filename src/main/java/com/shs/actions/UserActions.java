package com.shs.actions;

import com.shs.pages.web.PageCollection;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserActions {
    PageCollection pages = new PageCollection();

    public void login(String email, String password) {
        pages.loginPage.setEmail(email);
        pages.loginPage.setPassword(password);
        pages.loginPage.loginBntClick();
    }
}