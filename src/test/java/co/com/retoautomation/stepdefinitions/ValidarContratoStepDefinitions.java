package co.com.retoautomation.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.retoautomation.tasks.SeleccionarOpcion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

public class ValidarContratoStepDefinitions {

  /*@Dado("que un usuario ingresa a la pagina de Banistmo")
  public void queUnUsuarioIngresaALaPaginaDeBanistmo() {
  }*/

  @Cuando("ingrese a la opcion y al producto")
  public void ingreseALaOpcionYAlProducto() {
    theActorInTheSpotlight().attemptsTo(SeleccionarOpcion.conLosDatos);
  }

  @Entonces("debe descargar el PDF de contrato de tarjetas")
  public void validarPdf() {}
}
