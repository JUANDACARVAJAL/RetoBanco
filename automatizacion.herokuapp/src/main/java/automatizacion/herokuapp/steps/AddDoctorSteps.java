package automatizacion.herokuapp.steps;

import automatizacion.herokuapp.model.DatosTrabajo;
import automatizacion.herokuapp.pageobjects.PersonaDoctorPage;
import net.serenitybdd.core.Serenity;

public class AddDoctorSteps extends AccionarMenuSteps{
	DatosTrabajo datos;
	PersonaDoctorPage personasdoctorpage;
	
	public void agregardoctor() {
		datos = Serenity.sessionVariableCalled("valorestabla");
		menudoctor();
		//se ingresan los datos para el doctor.		
		personasdoctorpage.txtname.sendKeys(datos.getnombredoctor().trim());
		personasdoctorpage.txtlastname.sendKeys(datos.getapellidodoctor().trim());
		personasdoctorpage.txttelephone.sendKeys(datos.gettelefonodoctor().trim());
		personasdoctorpage.cmbidentificationtype.sendKeys(datos.gettipdocdoctor().trim());
		personasdoctorpage.txtidentification.sendKeys(datos.getnumdocdoctor().trim());
		personasdoctorpage.btnGuardar.click();
		menuinicio();
	}
}
