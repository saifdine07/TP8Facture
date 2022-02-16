package cigma.pfe.application.dao;

import cigma.pfe.application.model.Facture;

public interface IFactureDao {
	
	public void save(Facture f);
	
	public Facture update(Facture f);
	
	public void delete(Facture f);
	
	public Facture find(Facture f);

}
