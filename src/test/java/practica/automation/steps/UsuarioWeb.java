package practica.automation.steps;

import java.io.FileReader;
import java.io.IOException;


import net.serenitybdd.core.steps.ScenarioActor;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import practica.automation.pageobject.*;
import javax.swing.*;

public class UsuarioWeb extends ScenarioActor {

	Actor actor = Actor.named("Rober");
	
	@Steps(shared = true)
	PageHomeSophos sophosHome;

	@Steps(shared = true)
	PageOfertasSophos sophosOfertas;

	@Step("#actor ingresa a pagina de Sophos")
	public void ingresarHomeSophos(){
		sophosHome.setDefaultBaseUrl("https://www.sophossolutions.com/");
		sophosHome.open();
		sophosHome.validarHome();
	}

	@Step("#actor se dirige a la pagina de ofertas")
	public void buscarOfertas(){
		sophosHome.irAVerOfertas();
	}

	@Step("#actor muestra información del vuelo")
	public void mostrarInformación()  {
		sophosOfertas.obtenerOfertas();
	}

}
