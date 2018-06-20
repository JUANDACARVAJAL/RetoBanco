package automatizacion.herokuapp.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MenuAgendarCitasPage extends PageObject{

	@FindBy(css=".list-group > a[href='addDoctor']")
	public WebElementFacade btnAddDoctor;
	
	@FindBy(css=".list-group > a[href='addPatient']")
	public WebElementFacade btnAddPaciente;
	
	@FindBy(css=".list-group > a[href='appointmentScheduling']")
	public WebElementFacade btnAddCita;
	
	@FindBy(linkText="Inicio")
	public WebElementFacade lnkInicio;
}
