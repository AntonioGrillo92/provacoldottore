package main;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Main implements ActionListener{
	
	public static void main(String[] args)  {

				
			JFrame frame = new JFrame ( " MCDONALD'S" );
							
			String path="C:/Users/Antonio/workspace/yt/src/immagine/bigmacpng.png";
			ImageIcon icon = new ImageIcon(path);
			JButton bigmac = new JButton(icon);
			bigmac.addActionListener(new BigMacActionListener());
			
			String path2="C:/Users/Antonio/workspace/yt/src/immagine/crispy.png";
			ImageIcon icon2 = new ImageIcon(path2);
			JButton crispy = new JButton(icon2);
			crispy.addActionListener(new CrispyActionListener());
			
			String path3="C:/Users/Antonio/workspace/yt/src/immagine/mcchickenpng.png";
			ImageIcon icon3 = new ImageIcon(path3);
			JButton chicken = new JButton(icon3);
			chicken.addActionListener(new ChickenActionListener());
			
			String path4="C:/Users/Antonio/workspace/yt/src/immagine/fof_09.png";
			ImageIcon icon4 = new ImageIcon(path4);
			JButton fish = new JButton(icon4);
			fish.addActionListener(new FishActionListener());
		
			
		    JPanel pannello = new JPanel();
		    pannello.setLayout(null);
		    frame.add(pannello);
		    
		    TitledBorder titleBorder = new TitledBorder("SCEGLI IL TUO PANINO ! ");
   		    titleBorder.setTitleJustification(TitledBorder.CENTER);
   		    titleBorder.setTitleFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
   		    pannello.setBorder(titleBorder);
   		   
		    bigmac.setBounds(30, 100, 150, 115);
		    crispy.setBounds(200, 100, 150, 115);
		    chicken.setBounds(30, 300, 150, 115);
		    fish.setBounds(200, 300, 150, 115);
		   
		    pannello.add(bigmac);
		    pannello.add(crispy);
		    pannello.add(chicken);
		    pannello.add(fish);
		    
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   
		    frame.setSize(400, 500);
		    frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}


