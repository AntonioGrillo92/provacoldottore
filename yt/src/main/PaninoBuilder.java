package main;

abstract class PaninoBuilder {

	protected Panino panino ;
		
	public void createNewPanino(){ 
		panino = new Panino(); 
		}
	
	public abstract void buildSalsa();
	public abstract void buildCarne();
	public abstract void buildVerdura();
	public abstract void buildFormaggio();
	public abstract void buildExtra();
	public abstract void stampa();

	public Panino getMcDonald() {
		return panino ;
	}
}
