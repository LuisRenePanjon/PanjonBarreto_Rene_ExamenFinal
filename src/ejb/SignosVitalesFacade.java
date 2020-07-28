package ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entidades.SignosVitales;

public class SignosVitalesFacade extends AbstractFacade<SignosVitales>{

	@PersistenceContext(unitName = "PanjonBarretoRene_ExamenFinal")
	private EntityManager em;
	
	public SignosVitalesFacade() {
		super(SignosVitales.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	

}
