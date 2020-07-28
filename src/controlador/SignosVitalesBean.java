package controlador;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ejb.CitaMedicaFacade;
import ejb.PacienteFacade;
import ejb.SignosVitalesFacade;
import entidades.CitaMedica;
import entidades.SignosVitales;



@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class SignosVitalesBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private CitaMedicaFacade ejbCitaMedicaFacade;
	@EJB
	private PacienteFacade ejbPacienteFacade;
	@EJB 
	private SignosVitalesFacade ejbSignosVitales;
	
	
	private String cedula;
	
	private String cita;
	
	private String presion;
	
	private String frecuenciaCardiaca;
	
	private String frecuenciarespiratoria;
	
	private String temperatura;
	
	private String saturacion;
	
	
	

	public SignosVitalesBean() {
		// TODO Auto-generated constructor stub
	}

	
	@PostConstruct
	public void init() {
		
	}


	public CitaMedicaFacade getEjbCitaMedicaFacade() {
		return ejbCitaMedicaFacade;
	}


	public void setEjbCitaMedicaFacade(CitaMedicaFacade ejbCitaMedicaFacade) {
		this.ejbCitaMedicaFacade = ejbCitaMedicaFacade;
	}


	public PacienteFacade getEjbPacienteFacade() {
		return ejbPacienteFacade;
	}


	public void setEjbPacienteFacade(PacienteFacade ejbPacienteFacade) {
		this.ejbPacienteFacade = ejbPacienteFacade;
	}


	public SignosVitalesFacade getEjbSignosVitales() {
		return ejbSignosVitales;
	}


	public void setEjbSignosVitales(SignosVitalesFacade ejbSignosVitales) {
		this.ejbSignosVitales = ejbSignosVitales;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getCita() {
		return cita;
	}


	public void setCita(String cita) {
		this.cita = cita;
	}


	public String getPresion() {
		return presion;
	}


	public void setPresion(String presion) {
		this.presion = presion;
	}


	public String getFrecuenciaCardiaca() {
		return frecuenciaCardiaca;
	}


	public void setFrecuenciaCardiaca(String frecuenciaCardiaca) {
		this.frecuenciaCardiaca = frecuenciaCardiaca;
	}


	public String getFrecuenciarespiratoria() {
		return frecuenciarespiratoria;
	}


	public void setFrecuenciarespiratoria(String frecuenciarespiratoria) {
		this.frecuenciarespiratoria = frecuenciarespiratoria;
	}


	public String getTemperatura() {
		return temperatura;
	}


	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}


	public String getSaturacion() {
		return saturacion;
	}


	public void setSaturacion(String saturacion) {
		this.saturacion = saturacion;
	}
	
	public String addSignosVitales() {
		CitaMedica citaMedica = ejbCitaMedicaFacade.buscarPorCitayCed(this.cedula, this.cita);
		ejbSignosVitales.create(new SignosVitales(this.presion, this.frecuenciaCardiaca, this.frecuenciarespiratoria,this.temperatura,this.saturacion,citaMedica));
		return null;
	}
}
