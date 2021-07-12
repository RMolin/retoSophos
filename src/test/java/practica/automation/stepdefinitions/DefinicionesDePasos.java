package practica.automation.stepdefinitions;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Steps;
import org.json.simple.parser.ParseException;
import practica.automation.steps.UsuarioWeb;

public class DefinicionesDePasos {

	@Steps(shared = true)

	UsuarioWeb usuario;


	@Given("Que Rober ingresa a la pagina principal de Sophos")
	public void ingresar_Sophos(){
		usuario.ingresarHomeSophos();
	}

	@When("Rober se dirige a la pagina de empleos")
	public void busqueda_de_ofertas() {
		usuario.buscarOfertas();
	}

	@Then("Rober imprime la informacion de las ofertas encontradas")
	public void obtiene_informacion_ofertas()  {
		usuario.mostrarInformación();
	}



}
