import java.util.Date;
import java.util.Scanner;

public class Apartement extends bien_habitable {
    private int etage;
    private boolean Simplexe_Duplexe;
    private boolean Ascenseur;



    /*public Apartement ( String adresse, Transaction transaction, double prix, Proprietaire proprietaire, Wilaya wilaya, double superficie, Date date, int etage, int nbr_pieces, boolean Simplexe_Duplexe, boolean Ascenseur, boolean meuble) {

        super(adresse,transaction,prix,proprietaire, wilaya, superficie, date, nbr_pieces, meuble);
        this.etage = etage;
        this.Simplexe_Duplexe = Simplexe_Duplexe;
        this.Ascenseur = Ascenseur;
    }*/
    public Apartement(String adresse, Transaction transaction, double prix, Proprietaire proprietaire, Wilaya wilaya,
			double superficie, Date date, boolean negociable, String description, String photos, int nbr_pieces,
			boolean meuble, int etage, boolean simplexe_Duplexe, boolean ascenseur) {
		super(adresse, transaction, prix, proprietaire, wilaya, superficie, date, negociable, description, photos,
				nbr_pieces, meuble);
		this.etage = etage;
		Simplexe_Duplexe = simplexe_Duplexe;
		Ascenseur = ascenseur;
	}

    public void afficher() {
    	   System.out.println ("------------Ce bien s'agit d'un apartement------------");
            System.out.println("L'adresse du bien : " + adresse   );
            System.out.println("Ce bien est la propriete de : " +this.proprietaire.getNom () + this.proprietaire.getPrenom () );
            System.out.println ("Type de transaction : " + this.transaction);
            System.out.println ("Wilaya de l'apartement : " + this.wilaya.getNom ());
            if (meuble == true) System.out.println("Ce bien est meuble.");
            if (meuble == false) System.out.println("Ce bien n'est PAS meuble.");
            System.out.println("Le descriptif de la maison est :" +this.description);
            System.out.println("L'url de la photo de la maison est :" +this.photos);
            if (Simplexe_Duplexe == true) System.out.println("Ce bien est simplexe.");
            if (Simplexe_Duplexe == false) System.out.println("Ce bien est duplexe.");
            if (Ascenseur == true) System.out.println("Cet apartement est accessible par escaliers et Ascenseur.");
            if (Ascenseur == false) System.out.println("Cet apartement est seulement accessible par escaliers.");
            System.out.println("La description du bien : "  + "Il est composé de " + nbr_pieces + " pieces.");
            if (etage == 1) System.out.println("Cet apartement se trouve au " + Integer.toString(etage) + "er etage.");
            if (etage !=1)System.out.println("Cet apartement se trouve au " + Integer.toString(etage) + " ème etage.");
            System.out.println("La superficie du bien : " + Double.toString(superficie) + "m^2");
            System.out.println("Le prix du bien : " + Double.toString(prix));
            if (negociable == true) System.out.println("Le prix est negociable.");
            if (negociable == false) System.out.println("Le prix est fixe.");
            System.out.println("Date d'ajout de l'apartement : " + this.date);
    }

    

	double calculer_prix_vente_final(Wilaya w)
    {
    	double cout = super.calculer_prix_vente_final(w);
    	if((this.etage<=2)&&(this.etage>=0))
    	{
    		cout = cout +50000;
    	}
    	return cout;	
    }
    double calculer_prix_location_final(Wilaya w)
    {
    	double cout = super.calculer_prix_location_final(w);
    	if((this.etage<=2)&&(this.etage>=0))
    	{
    		cout = cout + 5000;
    	}
    	if((this.etage<=6)&&(this.Ascenseur==false))
    	{
    		cout = cout - 500*this.getSuperficie();
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
        System.out.println ("------------Ce bien s'agit d'un apartement------------");
        System.out.println ("adresse de l'apartement : " + this.adresse);
        System.out.println ("Wilaya de l'apartement : " + this.wilaya.getNom ());
        System.out.println ("Proprietaire de l'apartement : " + this.proprietaire.getNom () + this.proprietaire.getPrenom ());
        System.out.println ("Type de transaction : " + this.transaction);
        System.out.println("Date d'ajout de l'apartement : " + this.date);
        System.out.println("-------------------------------------------------------");
    }
}
