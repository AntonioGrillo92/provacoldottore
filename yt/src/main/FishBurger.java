package main;

public class FishBurger extends PaninoBuilder {

	@Override
	public void buildSalsa() {	panino.setSalsa("maionese");	
	}

	@Override
	public void buildFormaggio() {	panino.setFormaggio(" ");}

	@Override
	public void buildCarne() {	panino.setCarne("cotoletta di pesce ");}

	@Override
	public void buildVerdura() {	panino.setVerdura("lattuga");	}

	@Override
	public void buildExtra() {	panino.setExtra("");	}

	@Override
	public void stampa() {
		System.out.println( panino.getCarne() + " " + panino.getExtra() +" " + panino.getFormaggio() + " " + panino.getSalsa() + " " +  panino.getVerdura() );
		
	}

}

