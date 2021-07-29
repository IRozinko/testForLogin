package com.shs.pages.web;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.shs.model.Client;
import lombok.SneakyThrows;

import java.io.File;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static com.shs.pages.web.PagePaths.INSURANCE_PAGE;

public class InsurancePage implements FormFilling {
    private SelenideElement pageTitle = $(byXpath("//h1[contains(text(),'LIFE, CRITICAL and DISABILITY INSURANCE')]"));
    private SelenideElement appNumberField = $("#nbtinsurance-application_number");
    private SelenideElement nameField = $("#insurancedealrider-0-first_name");
    private SelenideElement surnameField = $("#insurancedealrider-0-last_name");
    private SelenideElement productTypeSelect = $("#select2-insurancedealriderproduct-0-0-product_type-container");
    private SelenideElement productTypeSearch = $(byXpath("/html/body/span/span/span[2]/ul/li[2]"));
    private SelenideElement companySelect = $(byXpath("/html/body/div[2]/div/div/form/div/div/div[5]/div[1]/div/div/div/span/span[1]/span"));
    private SelenideElement companySelectList = $(byXpath("/html/body/span/span/span[2]/ul/li[1]"));
    private SelenideElement annualField = $("#nbtinsurance-annual_premium");
    private SelenideElement approveCalculationChkBox = $("#nbtinsurance-approvecalculation");
    private SelenideElement policyWindow = $(byXpath("/html/body/div[2]/div/div/form/div/div/div[6]/div/div[1]/div/div/div/div[1]/div[3]/div[2]/div/input"));
    private SelenideElement efaChkBox = $("#nbtinsurance-complete_efa");
    private SelenideElement isElectronicChkBox = $("#nbtinsurance-is_electronic_application");
    private SelenideElement replacePolicy = $(byXpath("/html/body/div[2]/div/div/form/div/div/div[7]/div[2]/div[2]/div[1]/div/div/div[1]/label[2]/input"));
    private SelenideElement bankInfo = $(byXpath("/html/body/div[2]/div/div/form/div/div/div[7]/div[2]/div[2]/div[2]/div/div/div[1]/label[1]/input"));
    private SelenideElement illustrationWindow = $(byXpath("/html/body/div[2]/div/div/form/div/div/div[7]/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div[2]/div/input"));
    private SelenideElement reasonWhyInput = $(byXpath("/html/body/div[2]/div/div/form/div/div/div[7]/div[3]/div[1]/div[1]/label[2]/input"));
    private SelenideElement reasonWindow = $(byXpath("/html/body/div[2]/div/div/form/div/div/div[7]/div[3]/div[2]/div/div/div/div[1]/div[3]/div[2]/div/input"));

    private SelenideElement addBtn = $(byClassName("btn-nbt-submit"));

    File file = new File("src/test/resources/documents/sample.pdf");

    public InsurancePage openPage() {
        Selenide.open(INSURANCE_PAGE);
        return this;
    }

    @SneakyThrows
    @Override
    public void fillForm(Client client) {
        pageTitle.waitUntil(appear, 120000);
        appNumberField.setValue("13331124");
        nameField.setValue("Ivan");
        surnameField.setValue("Tester");
        productTypeSelect.click();
        sleep(1000);
        productTypeSearch.click();
        companySelect.click();
        companySelectList.click();
        annualField.setValue("1200");
        approveCalculationChkBox.click();
        policyWindow.uploadFile(file);
        efaChkBox.click();
        isElectronicChkBox.click();
        illustrationWindow.uploadFile(file);
        replacePolicy.click();
        bankInfo.click();
        reasonWhyInput.click();
        reasonWindow.uploadFile(file);
        addBtn.click();
        pageTitle.waitUntil(disappear, 120000);
    }
}
