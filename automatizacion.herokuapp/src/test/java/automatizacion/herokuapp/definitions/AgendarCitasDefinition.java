package automatizacion.herokuapp.definitions;

import java.util.List;

import automatizacion.herokuapp.model.DatosTrabajo;
import automatizacion.herokuapp.steps.AddDoctorSteps;
import automatizacion.herokuapp.steps.AddPacienteSteps;
import automatizacion.herokuapp.steps.AgendarCitasSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AgendarCitasDefinition {

	@Steps
	AgendarCitasSteps AgendarCitassteps;
	
	@Steps
	AddDoctorSteps adddoctorsteps;
	
	@Steps
	AddPacienteSteps addpacientesteps;
	
	@Given("^que ingreso de forma exitosa a la pagina$")
	public void queIngresoDeFormaExitosaALaPagina(List<DatosTrabajo> datostabla) throws Exception    {
	    AgendarCitassteps.IngresarPagina(datostabla);
	}

	@Given("^que creo previamente al Medico$")
	public void queCreoPreviamenteAlMedico() throws Exception {
		adddoctorsteps.AgregarDoctor();
	}

	@Given("^que creo previamente al Paciente$")
	public void queCreoPreviamenteAlPaciente() throws Throwable {
		addpacientesteps.AgregarPaciente();
	}

	@When("^agendo una cita con los siguientes Datos$")
	public void agendoUnaCitaConLosSiguientesDatos() throws Throwable {
	    AgendarCitassteps.AgregarCita();
	}

	@Then("^verifico que obtengo el mensaje esperado$")
	public void verificoQueObtengoElMensajeExitosoDatosGuardadosCorrectamente() throws Throwable {
	    AgendarCitassteps.VerificarMensaje();
	}
}
