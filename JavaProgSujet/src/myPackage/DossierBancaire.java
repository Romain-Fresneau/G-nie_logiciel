package myPackage;

public class DossierBancaire {
	
	  private double m_soldetotal;
	  private Compte_courant cc;
	  private Compte_epargne ce;

	//Constructeur
    public DossierBancaire()
    {
    	m_soldetotal=0;
    	cc = new Compte_courant(0);
    	ce = new Compte_epargne(0);
    }

    public void deposer(double value) 
    {
    	cc.Addsolde(0.4*value);
    	ce.Addsolde(0.6*value);
    	
    }
    public double Consulter() {
    	m_soldetotal=cc.getsolde()+ce.getsolde();
    	
    	return m_soldetotal;
    	}
    
    public void remunerer() {
    	ce.Remunérer();
    }
	
  
}
