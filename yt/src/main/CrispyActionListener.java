package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CrispyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		System.out.println(" Build CrispyMcBacon ");
		
		Cucina cucina = new Cucina();
		PaninoBuilder crispy = new CrispyMcBacon();
		
		cucina.setPaninoBuilder ( crispy );
		cucina.costructPanino();
		
		crispy.stampa();
		
		Panino panino = cucina.getMc();
	}

}
