package definitions;

import com.shs.model.Client;
import com.shs.pages.web.PageCollection;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.SneakyThrows;

import static com.codeborne.selenide.Selenide.sleep;

public class AddInsuranceDef {
    PageCollection pages = new PageCollection();
    Client client = Client.builder().build();

    @Given("the registered client")
    public void registeredClient() {
        System.out.println("Register new client client");
    }

    @SneakyThrows
    @When("the insurance page is opened")
    public void insurancePageOpened() {
        sleep(4500);
        pages.insurancePage.openPage();
        sleep(1500);
    }

    @Then("the client fills the application form")
    public void applicationFormFilling() {
        pages
                .insurancePage
                .fillForm(client);
    }
}
