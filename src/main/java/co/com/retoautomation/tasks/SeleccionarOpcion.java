package co.com.retoautomation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.retoautomation.userinterfaces.SeleccionarOpcionesPage.*;

public class SeleccionarOpcion implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(TXT_OPCION));
    actor.attemptsTo(Click.on(TXT_PRODUCTOS));
    actor.attemptsTo(Click.on(BTN_DESCARGAR));

  }

  public static Performable conLosDatos;
}
