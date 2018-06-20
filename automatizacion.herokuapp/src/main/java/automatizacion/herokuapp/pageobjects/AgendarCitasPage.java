package automatizacion.herokuapp.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automatizacion.herokuapp.com/")
public class AgendarCitasPage extends PageObject{

	//Declaro los objetos de la pagina
		@FindBy(linkText="http://automatizacion.herokuapp.com/pperez/")
		public WebElementFacade lnkAbrePagina;
		
		//objetos de la agenda de citas
		@FindBy(id="datepicker")
		public WebElementFacade txtdatepicker;
		
		@FindBy(className="panel-body")
		public WebElementFacade txtmensaje;
		
		@FindBy(xpath="//*[@id=\"page-wrapper\"]/div/div[3]/div/div[2]/input")
		public WebElementFacade txtdocpaciente;
		
		@FindBy(xpath="//*[@id=\"page-wrapper\"]/div/div[3]/div/div[3]/input")
		public WebElementFacade txtdocdoctor;
		
		@FindBy(xpath="//*[@id=\"page-wrapper\"]/div/div[3]/div/div[4]/textarea")
		public WebElementFacade txtobservacion;
		
		@FindBy(linkText="Guardar")
		public WebElementFacade btnGuardar;		
		
}
