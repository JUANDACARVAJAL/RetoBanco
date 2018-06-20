package automatizacion.herokuapp.steps;

import automatizacion.herokuapp.model.DatosTrabajo;
import automatizacion.herokuapp.pageobjects.AgendarCitasPage;
import automatizacion.herokuapp.pageobjects.PersonaPacientePage;
import net.serenitybdd.core.Serenity;

public class AddPacienteSteps {

	AgendarCitasPage AgendarCitaspage; 
	PersonaPacientePage personapacientepage;
	DatosTrabajo datos;
	
	public void AgregarPaciente() {
		// TODO Auto-generated method stub
		datos = Serenity.sessionVariableCalled("valorestabla");
		AgendarCitaspage.btnAddPaciente.click();
		personapacientepage.txtname.sendKeys(datos.getNombre_paciente().trim().toString());
		personapacientepage.txtlast_name.sendKeys(datos.getApellido_paciente().trim().toString());
		personapacientepage.txttelephone.sendKeys(datos.getTelefono_paciente().trim().toString());
		personapacientepage.cmbidentification_type.sendKeys(datos.getTipdoc_paciente().trim().toString());
		personapacientepage.txtidentification.sendKeys(datos.getNumdoc_paciente().trim().toString());
		String valprepagada = "S";
		if (datos.getSaludprepagada().trim().toString().equalsIgnoreCase(valprepagada)) {
			personapacientepage.chkprepaid.click();
		}			
		personapacientepage.btnGuardar.click();
		AgendarCitaspage.lnkInicio.click();
	}
}
