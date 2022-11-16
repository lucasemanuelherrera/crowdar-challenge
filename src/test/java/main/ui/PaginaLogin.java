package main.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaLogin extends PageObject {

    public static Target CAJA_USERNAME = Target.the("TextBox Username").located(By.id("user-name"));
    public static Target CAJA_PASSWORD = Target.the("TextBox password").located(By.id("password"));
    public static Target BTN_LOGIN = Target.the("Boton Login").located(By.id("login-button"));
    public static Target MSJ_LOGIN = Target.the("Mensaje Login").located(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/h3[1]"));
}
