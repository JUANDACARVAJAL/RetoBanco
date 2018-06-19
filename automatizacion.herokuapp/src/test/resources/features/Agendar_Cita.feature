#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@AgendarCitas
Feature: Agendar Cita Medico
  Yo como usuario deseo agendar una cita medica en linea
  a traves del portal automatizacion.herokuapp.com

  @CasoExitoso
  Scenario Outline: Agendar una cita medica de forma exitosa
    Given que ingreso de forma exitosa a la pagina 
    And que creo previamente al Medico
    |<nombre_doctor>	|<apellido_doctor>	|<telefono_doctor>	|<tipdoc_doctor>	|<numdoc_doctor>|
    And que creo previamente al Paciente 
    |<nombre_paciente>	|<apellido_paciente>	|<telefono_paciente>	|<tipdoc_paciente>	|<numdoc_paciente>	|<saludprepagada>|
    When agendo una cita con los siguientes Datos
    |<dia_cita>	|<numdoc_doctor_cita>	|<numdoc_paciente_cita>	|<observaciones_cita>|
    Then verifico que obtengo el mensaje exitoso Datos guardados correctamente
    |<resultado_esperado>|
 
    Examples:
    |nombre_doctor	|apellido_doctor	|telefono_doctor	|tipdoc_doctor	|numdoc_doctor	|nombre_paciente	|apellido_paciente	|telefono_paciente	|tipdoc_paciente	|numdoc_paciente	|saludprepagada	|dia_cita	|numdoc_doctor_cita	|numdoc_paciente_cita	|observaciones_cita	|resultado_esperado	|
	|Alan	|Brito	|4444040	|Cédula de ciudadanía	|102001	|Juan	|Chito	|2222020	|Cédula de ciudadanía	|102101	|S	|06/13/2018	|102001	|102101	|Esta es una cita	|Cita Agendado Exitosamente	|
