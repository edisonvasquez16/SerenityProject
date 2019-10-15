package co.com.edison.automation.cybermetro.stepdefinitions;

import static co.com.edison.automation.cybermetro.userinterfaces.CybermetroPage.OPCION_NO_GRACIAS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.hasItems;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import co.com.edison.automation.cybermetro.questions.ItemInTheCart;
import co.com.edison.automation.cybermetro.tasks.AddTheProduct;
import co.com.edison.automation.cybermetro.tasks.GoToThe;
import co.com.edison.automation.cybermetro.tasks.OpenTheBrowser;
import co.com.edison.automation.cybermetro.tasks.SearchTheProduct;
import co.com.edison.automation.cybermetro.userinterfaces.CybermetroHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;

public class AgregarProductoStepDefinitions {

	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	private Actor Edison = Actor.named("Edison");
	private CybermetroHomePage homePage;

	@Before
	public void setup() {
		Edison.can(BrowseTheWeb.with(herBrowser));
		herBrowser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Given("^Edison  Add product to the shopping cart$")
	public void edisonAddProductToTheShoppingCart() throws Exception {
		Edison.wasAbleTo(OpenTheBrowser.on(homePage));
		herBrowser.manage().window().maximize();
		Edison.wasAbleTo(Click.on(OPCION_NO_GRACIAS));
	}

	@When("^He search the product$")
	public void heSearchTheProduct(List<String> data) throws Exception {
		Edison.wasAbleTo(
				SearchTheProduct.with(data)
				);
	}

	@When("^He add the product$")
	public void heAddTheProduct() throws Exception {
		Edison.wasAbleTo(
				AddTheProduct.with()
				);
	}
	
	@When("^He go to shopping cart$")
	public void heGoToShoppingCart() throws Exception {
		Edison.wasAbleTo(
				GoToThe.ShoppingCart()
				);
	}

	@Then("^He verify the product in the shopping cart$")
	public void heVerifyTheProductInTheShoppingCart(List<String> data) throws Exception {
		Edison.should(seeThat(ItemInTheCart.displayed(), hasItems(data.get(0))));
	}
}
