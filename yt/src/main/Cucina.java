package main;

public class Cucina 
{
	private PaninoBuilder paninoBuilder;
	
	public void setPaninoBuilder ( PaninoBuilder pb )
	{
		paninoBuilder = pb ; 
	}
	
	
	public void costructPanino()
	{
		paninoBuilder.createNewPanino();
		paninoBuilder.buildCarne();
		paninoBuilder.buildExtra();
		paninoBuilder.buildFormaggio();
		paninoBuilder.buildSalsa();
		paninoBuilder.buildVerdura();
		
	}


	public Panino getMc() {
		return paninoBuilder.getMcDonald();
	}
	
	
}
