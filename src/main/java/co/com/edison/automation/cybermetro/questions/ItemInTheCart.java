package co.com.edison.automation.cybermetro.questions;

import java.util.List;
import static co.com.edison.automation.cybermetro.userinterfaces.CybermetroPage.ITEM_EN_CARRITO;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ItemInTheCart  implements Question<List<String>> {

	@Override
	public List<String> answeredBy(Actor actor) {
		return Text.of(ITEM_EN_CARRITO).viewedBy(actor).asList(); 
	}

	public static Question<List<String>> displayed() {
    	return new ItemInTheCart();
    }
}
