package automatizacion.herokuapp.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class PersonaDoctorPage extends PageObject{
		
	@FindBy(id="name")
	public WebElementFacade txtname;
	
	@FindBy(id="last_name")
	public WebElementFacade txtlastname;
	
	@FindBy(id="telephone")
	public WebElementFacade txttelephone;
	
	@FindBy(id="identification_type")
	public WebElementFacade cmbidentificationtype;
	
	@FindBy(id="identification")
	public WebElementFacade txtidentification;
	
	@FindBy(linkText="Guardar")
	public WebElementFacade btnGuardar;
	
	
}
