package controlador;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ejb.PacienteFacade;



@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class PacienteBean implements Serializable {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private PacienteFacade ejbPacienteFacade;
	
	

	public PacienteBean() {
		// TODO Auto-generated constructor stub
	}

}
