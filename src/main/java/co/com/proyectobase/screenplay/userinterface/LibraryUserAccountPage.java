package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

public class LibraryUserAccountPage extends PageObject{

    public static final Target UserImage = Target.the("Imagen de usuario").located(By.xpath("//img[@class='rounded-circle']"));
    public static final Target SearchBookInput = Target.the("Input de busqueda de libros").located(By.xpath("(//input[@formcontrolname=\"buscar\"])[2]"));
}
