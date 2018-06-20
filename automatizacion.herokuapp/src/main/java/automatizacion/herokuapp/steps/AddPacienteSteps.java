package automatizacion.herokuapp.steps;

import automatizacion.herokuapp.model.DatosTrabajo;
import automatizacion.herokuapp.pageobjects.PersonaPacientePage;
import net.serenitybdd.core.Serenity;

public class AddPacienteSteps extends AccionarMenuSteps{
 
	PersonaPacientePage personapacientepage;
	DatosTrabajo datos;
	
	public void agregarpaciente() {
		datos = Serenity.sessionVariableCalled("valorestabla");
		menupaciente();
		personapacientepage.txtname.sendKeys(datos.getNombrepaciente().trim());
		personapacientepage.txtlastname.sendKeys(datos.getApellidopaciente().trim());
		personapacientepage.txttelephone.sendKeys(datos.getTelefonopaciente().trim());
		personapacientepage.cmbidentificationtype.sendKeys(datos.getTipdocpaciente().trim());
		personapacientepage.txtidentification.sendKeys(datos.getNumdocpaciente().trim());
		String valprepagada = "S";
		if (datos.getSaludprepagada().trim().equalsIgnoreCase(valprepagada)) {
			personapacientepage.chkprepaid.click();
		}			
		personapacientepage.btnGuardar.click();
		menuinicio();
	}
}
