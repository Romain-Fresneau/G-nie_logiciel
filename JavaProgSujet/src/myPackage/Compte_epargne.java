package myPackage;

public class Compte_epargne {
	
	private double _solde_ce;

	public Compte_epargne (double s)
	{
		_solde_ce = s;
	}
	
	public void Remunérer()
	{
		_solde_ce+=0.032*_solde_ce;
	}
	
	public void Addsolde(double val)
	{
		_solde_ce+=val; 
	}
	
	public double getsolde() {return _solde_ce;}

}
