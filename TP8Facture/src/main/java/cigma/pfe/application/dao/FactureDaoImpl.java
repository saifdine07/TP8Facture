package cigma.pfe.application.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import cigma.pfe.application.model.Facture;

public class FactureDaoImpl implements IFactureDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_facturs");
	EntityManager em  = emf.createEntityManager();
	
	
	@Override
	public void save(Facture f) {
		em.getTransaction().begin();
		em.persist(f);
		em.getTransaction().commit();
	}


	@Override
	public Facture update(Facture f) {
		em.getTransaction().begin();
		Facture fct = em.find(Facture.class , f.getId());
		fct.setDate(f.getDate());
		fct.setAmount(f.getAmount());
		em.persist(fct);
		em.getTransaction().commit();
		return null;
	}


	@Override
	public void delete(Facture f) {
		em.getTransaction().begin();
		Facture fctD = em.find(Facture.class, f.getId());
		em.remove(fctD);
		em.getTransaction().commit();
		
	}


	@Override
	public Facture find(Facture f) {
		em.getTransaction().begin();
		Facture fctF = em.find(Facture.class, f.getId());
		
		System.out.println("l'id : "+ fctF.getId() + " , amount :" +fctF.getAmount() + " , Date :" +fctF.getDate());
		return fctF;
	}

}
