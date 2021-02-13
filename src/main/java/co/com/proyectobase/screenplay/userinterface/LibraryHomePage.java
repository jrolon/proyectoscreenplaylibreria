package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://librerianacional.com/")
public class LibraryHomePage extends PageObject{

    public static final Target Button_My_Account = Target.the("Boton de Mi Cuenta").located(By.xpath("(//button[@id='dropdownMenuLogin'])[2]"));
    public static final Target Button_Go_Authentation = Target.the("Boton de autenticación").located(By.xpath("(//a[@href='/usuario/ingresar'])[2]"));
    public static final Target Error_Message = Target.the("Mensaje de error").located(By.xpath("//p[@class='text-danger text--xs']"));





}
