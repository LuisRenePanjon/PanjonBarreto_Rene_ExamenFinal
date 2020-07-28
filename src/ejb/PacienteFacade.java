package ejb;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entidades.Paciente;

public class PacienteFacade extends AbstractFacade<Paciente> {

	@PersistenceContext(unitName = "PanjonBarretoRene_ExamenFinal")
	private EntityManager em;
	
	
	
	public PacienteFacade() {
		super(Paciente.class);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	
	public Paciente buscarPorCedula(String cedula) {
		Query query = em.createNamedQuery("buscarPorCedula");
		query.setParameter("cedula", cedula);
		List paciente = query.getResultList();
		Paciente respuesta = null;
		if(!paciente.isEmpty()) {
			respuesta = (Paciente) paciente.get(0);
		}
		return respuesta;
		
	}
	

}
