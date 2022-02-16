package cigma.pfe.application.services;

import cigma.pfe.application.dao.IFactureDao;
import cigma.pfe.application.model.Facture;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FactureServiceImpl implements IFactureService {
	
	IFactureDao ifactureDao;
	
	@Override
	public void save(Facture f) {
		ifactureDao.save(f);		
	}

	@Override
	public Facture update(Facture f) {
		return ifactureDao.update(f);
	}

	@Override
	public void delete(Facture f) {
		ifactureDao.delete(f);
	}

	@Override
	public Facture find(Facture f) {
		return ifactureDao.find(f);
	}




	
	
	
	

}
