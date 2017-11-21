package main;


public class ChickenBurger extends PaninoBuilder {
	
	@Override
	public void buildSalsa() {	panino.setSalsa("salsa rosa");	}

	@Override
	public void buildFormaggio() {	panino.setFormaggio("cheddar");	}

	@Override
	public void buildCarne() {	panino.setCarne("cotoletta di pollo");	}

	@Override
	public void buildVerdura() {	panino.setVerdura("lattuga");	}

	@Override
	public void buildExtra() {	panino.setExtra("");	
	}

	@Override
	public void stampa() {
		System.out.println( panino.getCarne() + " " + panino.getExtra() +" " + panino.getFormaggio() + " " + panino.getSalsa() + " " +  panino.getVerdura() );
		
	}

} 
