import java.util.Date;

public class Maison extends bien_habitable {

    private boolean garage;
    private boolean piscine;
    private boolean jardin;
    private double superficie_hab;
    public Maison(String adresse, Transaction transaction, double prix, Proprietaire proprietaire, Wilaya wilaya,
			double superficie, Date date, boolean negociable, String description, String photos, int nbr_pieces,
			boolean meuble, boolean garage, boolean piscine, boolean jardin, double superficie_hab, int nbr_etages) throws except_chifr {
		super(adresse, transaction, prix, proprietaire, wilaya, superficie, date, negociable, description, photos,
				nbr_pieces, meuble);
		this.garage = garage;
		this.piscine = piscine;
		this.jardin = jardin;
		this.superficie_hab = superficie_hab;
		if(this.superficie_hab>this.superficie)
		{
			throw new except_chifr();
		}
		
		this.nbr_etages = nbr_etages;
		if(this.nbr_etages<=0)
		{
			throw new except_chifr();
		}
	}
	private int nbr_etages;
     
    
  double calculer_prix_vente_final(Wilaya w)
    {
    	double cout = super.calculer_prix_vente_final(w);
    	if(this.garage || this.jardin || this.piscine)
    	{
    		cout = cout + this.getPrix()*0.005;
    		
    	}
    	return cout;
    }
    
    double calculer_prix_location_final(Wilaya w)
    {
    	double cout = super.calculer_prix_location_final(w);
    	if(this.piscine)
    	{
    		cout = cout+50000;
    		
    	}
    	return cout;
    }
    double calculer_prix_echange_final(Wilaya w , Wilaya y)
    {
    	double cout = this.calculer_prix_vente_final(w);
		if(w.getNom().equals(y.getNom()))
		{
			return cout;	
		}
		return cout + this.getPrix()*0.0025;
    }



    public void afficher_sans_details() {
        System.out.println ("------------Ce bien s'agit d'une Maison   ------------");
        System.out.println ("adresse du Maison : " + this.adresse);
        System.out.println ("Wilaya de Maison : " + this.wilaya.getNom ());
        System.out.println ("Proprietaire de la Maison : " + this.proprietaire.getNom () + this.proprietaire.getPrenom ());
        System.out.println ("Type de transaction : " + this.transaction);
        System.out.println("Date d'ajout de la Maison : " + this.date);
        System.out.println("-------------------------------------------------------");
    }
    public void afficher()
    {
    	System.out.println ("------------Ce bien s'agit d'une Maison   ------------");
        System.out.println ("adresse du Maison : " + this.adresse);
        System.out.println ("Wilaya de Maison : " + this.wilaya.getNom ());
        System.out.println ("Proprietaire de la Maison : " + this.proprietaire.getNom () + this.proprietaire.getPrenom ());
        System.out.println ("Type de transaction : " + this.transaction);
        System.out.println("Le prix du bien : " + Double.toString((prix)));
        System.out.println("Le descriptif de la maison est :" +this.description);
        System.out.println("L'url de la photo de la maison est :" +this.photos);
        System.out.println("La superficie de la maison est :" +this.superficie + " La superficie habitable de la maison est : " + this.superficie_hab);
        if (meuble == true) System.out.println("Ce bien est meuble.");
        if (meuble == false) System.out.println("Ce bien n'est PAS meuble.");
        if (piscine == true) System.out.println("Ce bien est doté d'une piscine.");
        if (piscine == false) System.out.println("Ce bien n'est pas doté d'une piscine.");
        if (garage == true) System.out.println("Cette maison possède des garages.");
        if (garage == false) System.out.println("Cette maison ne possède pas de garages.");
        if (jardin== true) System.out.println("Cette maison est doté d'un jardin.");
        if (jardin == false) System.out.println("Cette maison n'est pas doté d'un jardin.");
        if (negociable == true) System.out.println("Le prix est negociable.");
        if (negociable == false) System.out.println("Le prix est fixe.");
        System.out.println ("Le nombre d'etages de cette maison est de :   " + this.nbr_etages + " étages");
        System.out.println ("Le nombre de pieces de cette maison est de :   " + this.nbr_pieces + " piéces");
        System.out.println("Date d'ajout de la Maison : " + this.date);
    }
    
}
