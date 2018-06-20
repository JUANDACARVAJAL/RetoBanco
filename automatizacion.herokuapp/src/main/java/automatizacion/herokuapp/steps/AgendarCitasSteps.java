package automatizacion.herokuapp.steps;

import static org.junit.Assert.assertTrue;
import java.util.List;

import automatizacion.herokuapp.model.DatosTrabajo;
import automatizacion.herokuapp.pageobjects.AgendarCitasPage;
import automatizacion.herokuapp.utilities.Reutilizables;
import net.serenitybdd.core.Serenity;

public class AgendarCitasSteps extends AccionarMenuSteps {

	AgendarCitasPage agendarcitaspage;
	DatosTrabajo datos;
	
	public void ingresarpagina(List<DatosTrabajo> datostabla) {
		agendarcitaspage.open();
		agendarcitaspage.lnkAbrePagina.click();
		//enviar al objeto datos la fila primera
		datos = datostabla.get(0);
		//se crea una variable de Sesion llamada valorestabla
		Serenity.setSessionVariable("valorestabla").to(datos);
	}

	public void agregarcita() {
		menucita();
		agendarcitaspage.txtdatepicker.click();
		agendarcitaspage.txtdatepicker.sendKeys(datos.getDiacita().trim());
		agendarcitaspage.txtdocpaciente.sendKeys(datos.getNumdocpacientecita().trim());
		agendarcitaspage.txtdocdoctor.sendKeys(datos.getnumdocdoctorcita().trim());
		agendarcitaspage.txtobservacion.sendKeys(datos.getObservacionescita().trim());
		agendarcitaspage.btnGuardar.click();
	}

	public void verificarcita() {
		String mensajeobtenido = agendarcitaspage.txtmensaje.getText().trim();
		String meensajeesperado = datos.getResultadoesperado().trim();
		boolean valor = mensajeobtenido.contains(meensajeesperado);
		Reutilizables.mostrarerror("comparado" + valor);
		Reutilizables.mostrarerror(meensajeesperado);
		Reutilizables.mostrarerror(mensajeobtenido);
		assertTrue(valor);
	}

}
