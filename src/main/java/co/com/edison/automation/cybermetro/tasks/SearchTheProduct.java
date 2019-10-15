package co.com.edison.automation.cybermetro.tasks;

import java.util.List;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.edison.automation.cybermetro.userinterfaces.CybermetroPage.BUSCADOR_PRODUCTOS;

public class SearchTheProduct implements Task{
	
	private List<String> information;
	
	public SearchTheProduct(List<String> data) {
		this.information = data;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(information.get(0)).into(BUSCADOR_PRODUCTOS)
				);
		
	}

	public static SearchTheProduct with(List<String> data) {
		return instrumented(SearchTheProduct.class, data);
	}

}
