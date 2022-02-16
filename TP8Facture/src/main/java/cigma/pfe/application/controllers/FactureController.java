package cigma.pfe.application.controllers;

import cigma.pfe.application.model.Facture;
import cigma.pfe.application.services.IFactureService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FactureController {
	
	IFactureService ifactureService ;
	
	public void save(Facture f) {
		ifactureService.save(f);
	}
	
	public Facture update(Facture f) {
		return ifactureService.update(f);
		
	}
	
	public void delete(Facture f) {
		ifactureService.delete(f);
	}
	
	public Facture find(Facture f) {
		return ifactureService.find(f);
		
	}

}
