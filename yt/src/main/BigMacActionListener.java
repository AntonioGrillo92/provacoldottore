package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BigMacActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println(" Build BigMac ");
		
		Cucina cucina = new Cucina();
		PaninoBuilder bigMac = new BigMac();
		
		cucina.setPaninoBuilder ( bigMac );
		cucina.costructPanino();
		
		bigMac.stampa();
		
		Panino panino = cucina.getMc();
	}

}
