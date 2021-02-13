package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

public class LibraryResultPage extends PageObject{

    public static final Target First_Result_Book = Target.the("Boton de Mi Cuenta").located(By.xpath("(//a[@href=\"/producto/harry-potter-y-la-piedra-filosofal\"])[1]"));
    public static final Target Book_Not_Found = Target.the("Boton de Mi Cuenta").located(By.xpath("//h4[contains(text(),'Lo sentimos, aún no hay productos disponibles para')]"));

}
