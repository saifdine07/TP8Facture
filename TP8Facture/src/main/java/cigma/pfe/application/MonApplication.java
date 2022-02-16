package cigma.pfe.application;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cigma.pfe.application.controllers.FactureController;
import cigma.pfe.application.model.Facture;

@SuppressWarnings("resource")
public class MonApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		FactureController fctrl = (FactureController) ctx.getBean("idC");
		
		
		
		Facture f1 = new Facture(1200, new Date());
		fctrl.save(f1);
		
		Facture f2= new Facture(1, new Date(), 5000);
		fctrl.update(f2);
		
		Facture f3 = new Facture(1);
		fctrl.delete(f3);
		
		Facture f4 = new Facture(2);
		fctrl.find(f4);

	}

}
