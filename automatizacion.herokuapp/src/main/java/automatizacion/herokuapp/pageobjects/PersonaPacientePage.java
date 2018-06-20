package automatizacion.herokuapp.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PersonaPacientePage extends PageObject{
	
	@FindBy(name="name")
	public WebElementFacade txtname;
	
	@FindBy(name="last_name")
	public WebElementFacade txtlastname;
	
	@FindBy(name="telephone")
	public WebElementFacade txttelephone;
	
	@FindBy(name="identification_type")
	public WebElementFacade cmbidentificationtype;
	
	@FindBy(name="identification")
	public WebElementFacade txtidentification;
	
	@FindBy(name="prepaid")
	public WebElementFacade chkprepaid;
	
	@FindBy(linkText="Guardar")
	public WebElementFacade btnGuardar;

}
