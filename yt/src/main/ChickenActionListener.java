package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChickenActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println(" Build ChickenBurger ");
		
		Cucina cucina = new Cucina();
		PaninoBuilder chickenburger = new ChickenBurger();
		
		cucina.setPaninoBuilder ( chickenburger );
		cucina.costructPanino();
		
		chickenburger.stampa();
		
		Panino panino = cucina.getMc();
	}

}
