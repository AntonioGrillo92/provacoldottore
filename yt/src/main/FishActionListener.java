package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FishActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println(" Build FishBurger ");
		
		Cucina cucina = new Cucina ();
		PaninoBuilder fishburger = new FishBurger();
		
		cucina.setPaninoBuilder ( fishburger );
		cucina.costructPanino();
		
		fishburger.stampa();
		
		Panino panino = cucina.getMc();
	}

}
