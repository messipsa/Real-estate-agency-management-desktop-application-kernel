import java.util.Date;

class Bien_non_habitable extends Bien {
    private String status_juridique;
    private int nbr_facades;

   /* public Bien_non_habitable ( String adresse, Transaction transaction, double prix, Proprietaire proprietaire, Wilaya wilaya, double superficie, Date date, int nbr_facades, String status_juridique) {
        super(adresse,transaction,prix,proprietaire, wilaya, superficie, date);
        this.nbr_facades = nbr_facades;
        this.status_juridique = status_juridique;
    }*/
    public Bien_non_habitable(String adresse, Transaction transaction, double prix, Proprietaire proprietaire,
    		Wilaya wilaya, double superficie, Date date, boolean negociable, String description, String photos,
    		String status_juridique, int nbr_facades) {
    	super(adresse, transaction, prix, proprietaire, wilaya, superficie, date, negociable, description, photos);
    	this.status_juridique = status_juridique;
    	this.nbr_facades = nbr_facades;
    }


    public void afficher() {
    	    System.out.println ("------------Ce bien s'agit d'un Terrain------------");
            System.out.println("L'adresse du bien : " + adresse );
            System.out.println("Ce bien est la propriete de : " + this.proprietaire.getNom () + this.proprietaire.getPrenom ());
            System.out.println ("Wilaya de Terrain : " + this.wilaya.getNom ());
            System.out.println("La superficie du bien : " + Double.toString(superficie) + " metres carrés");
            System.out.println("Le prix du bien : " + Double.toString((prix)));
            if (negociable == true) System.out.println("Le prix est negociable.");
            if (negociable == false) System.out.println("Le prix est fixe.");
            System.out.println("Le descriptif du terrain est :" +this.description);
            System.out.println("L'url de la photo du terrain est :" +this.photos);
            System.out.println("Le status juridique du bien : " + status_juridique);
            System.out.println("le nombre de facades de ce bien : " + nbr_facades);
            System.out.println ("Type de transaction : " + this.transaction);
            System.out.println("Date d'ajout du terrain : " + this.date);
    }

    

	public void afficher_sans_details() {
        System.out.println ("------------Ce bien s'agit d'un Terrain------------");
        System.out.println ("adresse du Terrain : " + this.adresse);
        System.out.println ("Wilaya de Terrain : " + this.wilaya.getNom ());
        System.out.println ("Proprietaire de Terrain : " + this.proprietaire.getNom () + this.proprietaire.getPrenom ());
        System.out.println ("Type de transaction : " + this.transaction);
        System.out.println("Date d'ajout du terrain : " + this.date);
        System.out.println("-------------------------------------------------------");
    }
    double calculer_prix_vente_final(Wilaya w)
    {
   	 double cout = super.calculer_prix_vente_final(w);
   	 if (this.nbr_facades>1)
   	 {
   		 cout = cout + 0.005*nbr_facades*this.getPrix();
   	 }
   	 return cout;
    }
    double calculer_prix_location_final(Wilaya w)
    {
   	 double cout = super.calculer_prix_location_final(w);
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



}