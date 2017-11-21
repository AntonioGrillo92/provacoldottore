package main;

public class BigMac extends PaninoBuilder {

	@Override
	public void buildSalsa() {
		panino.setSalsa(" salsa bigmac ");	}

	@Override
	public void buildCarne() {
		panino.setCarne("hamburger");	}

	@Override
	public void buildVerdura() {
		panino.setVerdura("lattuga");	}

	@Override
	public void buildFormaggio() {
		panino.setFormaggio("cheddar");	}

	@Override
	public void buildExtra() {
		panino.setExtra("cetriolini");	}


	@Override
	public void stampa() {
		System.out.println( panino.getCarne() + " " + panino.getExtra() +" " + panino.getFormaggio() + " " + panino.getSalsa() + " " +  panino.getVerdura() );
		
	}
	
	
}
