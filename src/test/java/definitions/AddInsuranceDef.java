package definitions;

import com.shs.model.Client;
import com.shs.pages.web.PageCollection;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddInsuranceDef {
    PageCollection pages = new PageCollection();
    Client client = Client.builder().build();

    @Given("registered client")
    public void registeredClient() {
        System.out.println("Register new client client");
    }

    @When("the insurance page is opened")
    public void insurancePageOpened() {
        pages.insurancePage.openPage();
    }

    @Then("the client fills the application form")
    public void applicationFormFilling() {
        pages
                .insurancePage
                .fillForm(client);
    }
}
