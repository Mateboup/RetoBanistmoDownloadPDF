package co.com.retoautomation.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions(
    features = "src/test/resources/features/consultar_productos.feature",
    glue = "co.com.segurossura.certification.soat.stepdefinitions")
@RunWith(CucumberWithSerenity.class)
public class ConsultarProductos {}
