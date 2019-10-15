package co.com.edison.automation.cybermetro.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.edison.automation.cybermetro.userinterfaces.CybermetroPage.AGREGAR_ITEM_ENCONTRADO;

public class AddTheProduct implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(AGREGAR_ITEM_ENCONTRADO)
				);
		
	}

	public static AddTheProduct with() {
		// TODO Auto-generated method stub
		return instrumented(AddTheProduct.class);
	}

}
