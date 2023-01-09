package myPackage;

public class Compte_courant {
	
	private double _solde_cc;

	public Compte_courant (double s)
	{
		_solde_cc = s;
	}
	
	public void Addsolde(double val)
	{
		_solde_cc+=val; 
	}
	
	public double getsolde() {return _solde_cc;}
	
	
	
	
	
}
