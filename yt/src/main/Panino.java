package main;

public class Panino {

	private String salsa ="";
	private String carne ="";
	private String verdura ="";
	private String formaggio ="";
	private String extra ="";
	
	public void setSalsa( String salsa )
	{	this.salsa = salsa;	}
	
	public void setCarne( String carne )
	{	this.carne = carne;	}
	
	public void setVerdura( String verdura )
	{	this.verdura = verdura;	}
	
	public void setFormaggio( String formaggio )
	{	this.formaggio = formaggio;	}
	
	public void setExtra( String extra )
	{	this.extra = extra;	}

	
	public String getSalsa ()
	{ return this.salsa;}
	
	public String getCarne ()
	{ return this.carne;}
	
	public String getFormaggio ()
	{ return this.formaggio;}
	
	public String getVerdura ()
	{ return this.verdura;}
	
	public String getExtra ()
	{ return this.extra;}
}
