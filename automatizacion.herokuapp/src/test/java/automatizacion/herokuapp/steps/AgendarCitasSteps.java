package automatizacion.herokuapp.steps;

import java.util.List;

import automatizacion.herokuapp.model.DatosTrabajo;
import automatizacion.herokuapp.pageobjects.AgendarCitasPage;
import net.serenitybdd.core.Serenity;

public class AgendarCitasSteps {

	AgendarCitasPage AgendarCitaspage;
	DatosTrabajo datos;
	
	public void IngresarPagina(List<DatosTrabajo> datostabla) {
		// TODO Auto-generated method stub
		AgendarCitaspage.open();
		AgendarCitaspage.lnkAbrePagina.click();
		//enviar al objeto datos la fila primera
		datos = datostabla.get(0);
		Serenity.setSessionVariable("valorestabla").to(datos);
	}

	public void AgregarCita() {
		// TODO Auto-generated method stub
		AgendarCitaspage.btnAddCita.click();
		AgendarCitaspage.txtdatepicker.sendKeys(datos.getDia_cita().trim().toString());
		AgendarCitaspage.txt_docpaciente.sendKeys(datos.getNumdoc_paciente_cita().trim().toString());
		AgendarCitaspage.txt_docdoctor.sendKeys(datos.getNumdoc_doctor_cita().trim().toString());
		AgendarCitaspage.txt_observacion.sendKeys(datos.getObservaciones_cita().trim().toString());
		AgendarCitaspage.btnGuardar.click();
	}

	public void VerificarMensaje() {
		// TODO Auto-generated method stub
		String MensajeObtenido = AgendarCitaspage.txtmensaje.getText().trim();
		String MeensajeEsperado = datos.getResultado_esperado().trim();
		MensajeObtenido.contains(MeensajeEsperado);
	}
	

}
