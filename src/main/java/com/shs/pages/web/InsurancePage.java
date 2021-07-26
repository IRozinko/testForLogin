package com.shs.pages.web;

import com.codeborne.selenide.SelenideElement;
import com.shs.model.Client;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class InsurancePage implements FormFilling {
    private SelenideElement pageTitle = $(byXpath("//h1[contains(text(),'LIFE, CRITICAL and DISABILITY INSURANCE')]"));
    private SelenideElement appNumberField = $("#fieldAppNumber");
    private SelenideElement nameField = $("#fieldName");
    private SelenideElement surnameField = $("#fieldSurname");
    private SelenideElement productTypeSelect = $("#fieldProductType");
    private SelenideElement companySelect = $("#fieldCompany");
    private SelenideElement annualField = $("#fieldAnnual");
    private SelenideElement approveCalculationChkBox = $("#fieldApproveCalculation");
    private SelenideElement efaChkBox = $("#fieldEfa");
    private SelenideElement isElectronicChkBox = $("#fieldIsElectronic");
    private SelenideElement reasonWhyInput = $("#fieldReasonWhy");
    private SelenideElement addBtn = $("#submit");

    @Override
    public void fillForm(Client client) {
        appNumberField.setValue("13331123");
        nameField.setValue("Ivan");
        surnameField.setValue("Tester");
        productTypeSelect.selectOption("T-20");
        companySelect.selectOption("Assumption Life");
        annualField.setValue("1200");
        approveCalculationChkBox.click();
        efaChkBox.click();
        isElectronicChkBox.click();
        reasonWhyInput.selectOption(2);
        addBtn.click();
        pageTitle.waitUntil(disappear, 120000);
    }
}
