package controlador;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ejb.CitaMedicaFacade;
import ejb.PacienteFacade;
import ejb.SignosVitalesFacade;
import entidades.CitaMedica;
import entidades.Paciente;


@Named
@SessionScoped
public class CitaMedicaBean implements Serializable  {
	
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
	
	private String sintomas;
	
	private String alergias;
	
	private String enfermedadesPrevias;
	
	private Date hora;
	
	private String fecha;
	
	private List<CitaMedica> listaCitas;
	

	public CitaMedicaBean() {
		// TODO Auto-generated constructor stub
		
		
	}
	
	@PostConstruct
	public void init() {
		listaCitas = ejbCitaMedicaFacade.findAll();
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

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public String getAlergias() {
		return alergias;
	}

	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

	public String getEnfermedadesPrevias() {
		return enfermedadesPrevias;
	}

	public void setEnfermedadesPrevias(String enfermedadesPrevias) {
		this.enfermedadesPrevias = enfermedadesPrevias;
	}

	public List<CitaMedica> getListaCitas() {
		return listaCitas;
	}

	public void setListaCitas(List<CitaMedica> listaCitas) {
		this.listaCitas = listaCitas;
	}
	
	
	
	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String addCita() {
		Paciente paciente = ejbPacienteFacade.buscarPorCedula(this.cedula);
		ejbCitaMedicaFacade.create(new CitaMedica(this.hora,this.fecha,this.sintomas,this.alergias,this.enfermedadesPrevias,paciente));
		listaCitas = ejbCitaMedicaFacade.findAll();
		return null;
	}
	
	/*
	public String addSignosVitales() {
		CitaMedica citaMedica =  ejbCitaMedicaFacade.buscarPorCitayCed(cedula, cita)
	}

*/
}
