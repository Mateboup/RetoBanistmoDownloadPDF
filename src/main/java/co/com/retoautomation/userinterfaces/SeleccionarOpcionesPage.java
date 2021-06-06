package co.com.retoautomation.userinterfaces;

import static org.openqa.selenium.By.xpath;

import net.serenitybdd.screenplay.targets.Target;

public final class SeleccionarOpcionesPage {

  public static final Target TXT_OPCION =
      Target.the("Seleccionar Opcion")
          .located(xpath("//*[@id=\'navbar-collapse-grid\']/ul/li[3]/a"));

  public static final Target TXT_PRODUCTOS =
          Target.the("Seleccionar productos y servicios")
                  .located(xpath("//*[@id=\'navbar-collapse-grid\']/ul/li[3]/ul/li/div[1]/ul[1]/li[3]/a"));

  public static final Target BTN_DESCARGAR =
          Target.the("Boton descargar contrato")
                  .located(xpath("//*[@id=\'layoutContainers\']/div/div[1]/section/div[2]/div[2]/div[2]/div/div/div/div/a"));
}
