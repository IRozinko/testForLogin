package com.shs.pages.web;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PageCollection {
    public LoginPage loginPage = new LoginPage();
    public InsurancePage insurancePage = new InsurancePage();
}
