package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://librerianacional.com/")
public class LibraryBookDetailPage extends PageObject{

    public static final Target Book_Cover_Image = Target.the("Boton de Mi Cuenta").located(By.xpath("//figure[@class='mb-0 p-sm-3 p-4 bg-gray-opacity']"));




}
