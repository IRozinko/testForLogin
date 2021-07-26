package definitions;

import com.shs.actions.UserActions;
import com.shs.pages.web.PageCollection;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepDef {
    PageCollection pages = new PageCollection();
    UserActions doAction = new UserActions();

    @Given("registered client")
    public void registeredClient() {
        System.out.println("Register new client client");
    }

    @When("client opens the login page")
    public void clientOpensTheLoginPage() {
        pages.loginPage.openPage();
    }

    @And("client logs in to the account")
    public void clientLogsInToTheAccount() {
        doAction.login("test@outsource-to-ukraine.com", "testpassword123456");
    }

}
