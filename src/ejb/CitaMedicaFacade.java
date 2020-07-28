package ejb;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entidades.CitaMedica;
import entidades.Paciente;

public class CitaMedicaFacade extends AbstractFacade<CitaMedica>{

	@PersistenceContext(unitName = "PanjonBarretoRene_ExamenFinal")
	private EntityManager em;
	
	public CitaMedicaFacade() {
		super(CitaMedica.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	
	public CitaMedica buscarPorCitayCed(String cedula, String cita) {
		Query query = em.createNamedQuery("buscarPorCitayCed");
		query.setParameter("cedula", cedula);
		query.setParameter("cita", cita);
		List citaMedica = query.getResultList();
		CitaMedica respuesta = null;
		if(!citaMedica.isEmpty()) {
			respuesta = (CitaMedica) citaMedica.get(0);
		}
		return respuesta;
		
	}
	

}
