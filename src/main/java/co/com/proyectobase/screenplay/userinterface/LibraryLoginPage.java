package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

public class LibraryLoginPage extends PageObject{

    public static final Target Go_To_Login_form = Target.the("Boton de Mi Cuenta").located(By.xpath("(//div[contains(text(), 'Ingresar con Mail y contraseña')])[1]"));
    public static final Target Email_Input = Target.the("Boton de Mi Cuenta").located(By.xpath("//input[@name='usuario']"));
    public static final Target Password_Input = Target.the("Boton de Mi Cuenta").located(By.xpath("//input[@name='contrasena']"));
    public static final Target Button_Authenticate = Target.the("Boton de Mi Cuenta").located(By.xpath("//button[contains(text(), 'Iniciar sesión')]"));



}
