package co.com.edison.automation.cybermetro.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CybermetroPage extends PageObject {
	
	public static final Target OPCION_NO_GRACIAS = Target.the("Opción NO GRACIAS de Novedades").located(By.id("onesignal-popover-cancel-button"));
	public static final Target OPCION_SI = Target.the("Opción SI de Novedades").located(By.id("onesignal-popover-allow-button"));
	public static final Target BUSCADOR_PRODUCTOS = Target.the("Buscador de productos").located(By.id("search-autocomplete-input"));
	public static final Target AGREGAR_ITEM_ENCONTRADO = Target.the("Opción para Agregar producto").located(By.xpath("(//*[@class='product-item__add-to-cart product-add-to-cart btn red add-to-cart '])[1]"));
	public static final Target CERRAR_MENSAJE_ENTREGA = Target.the("Opción CERRAR metodo de Entrega").located(By.xpath("(//*[@class='overlay__close'])[3]"));
	public static final Target PANEL_INHABILITADO = Target.the("Opción CERRAR metodo de Entrega").located(By.xpath("//*[@class='hide-click']"));
	public static final Target BOTON_CARRITO_COMPRAS = Target.the("Opción CARRITO DE COMPRAS").located(By.xpath("//*[@class='btn red minicart__action--toggle-open food-site']"));
	public static final Target ITEM_EN_CARRITO = Target.the("Opción CARRITO DE COMPRAS").located(By.xpath("(//*[@class='minicart__items-wrapper']/div[3]/div/div/div[2]/a)[1]"));
	
}
