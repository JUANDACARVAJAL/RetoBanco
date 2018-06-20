package automatizacion.herokuapp.steps;

import automatizacion.herokuapp.model.DatosTrabajo;
import automatizacion.herokuapp.pageobjects.AgendarCitasPage;
import automatizacion.herokuapp.pageobjects.PersonaDoctorPage;
import net.serenitybdd.core.Serenity;

public class AddDoctorSteps {
	
	AgendarCitasPage AgendarCitaspage;
	PersonaDoctorPage personasdoctorpage;
	DatosTrabajo datos;

	public void AgregarDoctor() {
		datos = Serenity.sessionVariableCalled("valorestabla");
		// TODO Auto-generated method stub
		AgendarCitaspage.btnAddDoctor.click();
		//se ingresan los datos para el doctor.		
		personasdoctorpage.txtname.sendKeys(datos.getNombre_doctor().trim().toString());
		personasdoctorpage.txtlast_name.sendKeys(datos.getApellido_doctor().trim().toString());
		personasdoctorpage.txttelephone.sendKeys(datos.getTelefono_doctor().trim().toString());
		personasdoctorpage.cmbidentification_type.sendKeys(datos.getTipdoc_doctor().trim().toString());
		personasdoctorpage.txtidentification.sendKeys(datos.getNumdoc_doctor().trim().toString());
		personasdoctorpage.btnGuardar.click();
		AgendarCitaspage.lnkInicio.click();
	}
}
