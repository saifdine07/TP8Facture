package cigma.pfe.application.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Facture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Date date;
	private double amount;
	
	public Facture() {

	}

	public Facture(int id) {
		this.id = id;
	}

	public Facture( double amount, Date date) {
		this.amount = amount;
		this.date = date;
	}
	
	
	
	

	

	
	
	
	
	
	

}
