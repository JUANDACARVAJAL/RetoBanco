package automatizacion.herokuapp.steps;

import automatizacion.herokuapp.pageobjects.MenuAgendarCitasPage;

public class AccionarMenuSteps {

	private MenuAgendarCitasPage menuagendarcitaspage;
	
	public void menudoctor() {
		menuagendarcitaspage.btnAddDoctor.click();
	}
	
	public void menupaciente() {
		menuagendarcitaspage.btnAddPaciente.click();
	}
	
	public void menuinicio() {
		menuagendarcitaspage.lnkInicio.click();
	}
	
	public void menucita() {
		menuagendarcitaspage.btnAddCita.click();
	}
	
}
