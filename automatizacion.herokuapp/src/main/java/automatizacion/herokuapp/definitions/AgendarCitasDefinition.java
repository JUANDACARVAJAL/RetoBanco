package automatizacion.herokuapp.definitions;

import java.util.List;

import automatizacion.herokuapp.model.DatosTrabajo;
import automatizacion.herokuapp.steps.AddDoctorSteps;
import automatizacion.herokuapp.steps.AddPacienteSteps;
import automatizacion.herokuapp.steps.AgendarCitasSteps;
import automatizacion.herokuapp.utilities.Reutilizables;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AgendarCitasDefinition {

	@Steps
	AgendarCitasSteps agendarcitassteps;
	
	@Steps
	AddDoctorSteps adddoctorsteps;
	
	@Steps
	AddPacienteSteps addpacientesteps;
	
	@Given("^que ingreso de forma exitosa a la pagina$")
	public void queIngresoDeFormaExitosaALaPagina(List<DatosTrabajo> datostabla) {
	    try {
	    	agendarcitassteps.ingresarpagina(datostabla);
	    }
	    catch(Exception e){
	    	Reutilizables.mostrarerror(e.getMessage());
	    }
	}

	@Given("^que creo previamente al Medico$")
	public void queCreoPreviamenteAlMedico() {
		try {
			adddoctorsteps.agregardoctor();
	    }
	    catch(Exception e){
	    	Reutilizables.mostrarerror(e.getMessage());
	    }
	}

	@Given("^que creo previamente al Paciente$")
	public void queCreoPreviamenteAlPaciente() {
		try {
			addpacientesteps.agregarpaciente();
	    }
	    catch(Exception e){
	    	Reutilizables.mostrarerror(e.getMessage());
	    }
	}

	@When("^agendo una cita con los siguientes Datos$")
	public void agendoUnaCitaConLosSiguientesDatos() {
		try {
			agendarcitassteps.agregarcita();
	    }
	    catch(Exception e){
	    	Reutilizables.mostrarerror(e.getMessage());
	    }
	}

	@Then("^verifico que obtengo el mensaje esperado$")
	public void verificoQueObtengoElMensajeExitosoDatosGuardadosCorrectamente() {
		try {
			agendarcitassteps.verificarcita();
	    }
	    catch(Exception e){
	    	Reutilizables.mostrarerror(e.getMessage());
	    }
	}
}
