package co.com.edison.automation.cybermetro.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.edison.automation.cybermetro.userinterfaces.CybermetroPage.CERRAR_MENSAJE_ENTREGA;
import static co.com.edison.automation.cybermetro.userinterfaces.CybermetroPage.BOTON_CARRITO_COMPRAS;
import static co.com.edison.automation.cybermetro.userinterfaces.CybermetroPage.PANEL_INHABILITADO;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToThe implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(CERRAR_MENSAJE_ENTREGA), 
				Click.on(PANEL_INHABILITADO),
				Click.on(BOTON_CARRITO_COMPRAS));
	}

	public static GoToThe ShoppingCart() {
		// TODO Auto-generated method stub
		return instrumented(GoToThe.class);
	}
}
