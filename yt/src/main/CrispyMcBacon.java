package main;


public class CrispyMcBacon extends PaninoBuilder{

	@Override
	public void buildSalsa() 
	{ 	panino.setSalsa("salsa formaggio");}

	@Override
	public void buildFormaggio() { 	panino.setFormaggio("cheddar");	}

	@Override
	public void buildCarne() {	panino.setCarne("hamburger");	}

	@Override
	public void buildVerdura() {	panino.setVerdura("");	}
	
	@Override
	public void buildExtra (){	panino.setExtra("bacon");}

	@Override
	public void stampa() {
		System.out.println( panino.getCarne() + " " + panino.getExtra() +" " + panino.getFormaggio() + " " + panino.getSalsa() + " " +  panino.getVerdura() );
		
	}
	
}
