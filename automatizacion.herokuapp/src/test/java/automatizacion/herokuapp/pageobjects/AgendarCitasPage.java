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
		
		@FindBy(css=".list-group > a[href='addDoctor']")
		public WebElementFacade btnAddDoctor;
		
		@FindBy(css=".list-group > a[href='addPatient']")
		public WebElementFacade btnAddPaciente;
		
		@FindBy(css=".list-group > a[href='appointmentScheduling']")
		public WebElementFacade btnAddCita;
		
		@FindBy(linkText="Inicio")
		public WebElementFacade lnkInicio;
		
		//objetos de la agenda de citas
		@FindBy(id="datepicker")
		public WebElementFacade txtdatepicker;
		
		@FindBy(className="panel-body")
		public WebElementFacade txtmensaje;
		
		@FindBy(xpath="//*[@id=\"page-wrapper\"]/div/div[3]/div/div[2]/input")
		public WebElementFacade txt_docpaciente;
		
		@FindBy(xpath="//*[@id=\"page-wrapper\"]/div/div[3]/div/div[3]/input")
		public WebElementFacade txt_docdoctor;
		
		@FindBy(xpath="//*[@id=\"page-wrapper\"]/div/div[3]/div/div[4]/textarea")
		public WebElementFacade txt_observacion;
		
		@FindBy(linkText="Guardar")
		public WebElementFacade btnGuardar;		
		
}
