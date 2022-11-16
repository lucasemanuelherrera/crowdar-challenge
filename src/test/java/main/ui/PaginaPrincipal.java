package main.ui;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrincipal  extends PageObject {

    public static Target TITULO_PAGINA = Target.the("Titulo de pagina principal").located(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));

}
