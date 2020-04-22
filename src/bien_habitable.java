import java.util.Date;

public abstract class bien_habitable extends Bien {
    public int nbr_pieces;
    public boolean meuble;

   /* public bien_habitable( String adresse, Transaction transaction, double prix, Proprietaire proprietaire, Wilaya wilaya, double superficie, Date date, int nbr_pieces, boolean meuble) {
        super(adresse,transaction,prix,proprietaire, wilaya, superficie, date);
        this.nbr_pieces = nbr_pieces;
        this.meuble = meuble;


    }*/
    public bien_habitable(String adresse, Transaction transaction, double prix, Proprietaire proprietaire, Wilaya wilaya,
    		double superficie, Date date, boolean negociable, String description, String photos, int nbr_pieces,
    		boolean meuble) {
    	super(adresse, transaction, prix, proprietaire, wilaya, superficie, date, negociable, description, photos);
    	this.nbr_pieces = nbr_pieces;
    	this.meuble = meuble;
    }


	public int getNbr_pieces() {
		return nbr_pieces;
	}


	


	public void setNbr_pieces(int nbr_pieces) {
		this.nbr_pieces = nbr_pieces;
	}


	double calculer_prix_vente_final(Wilaya w)
	{
		double cout = super.calculer_prix_vente_final( w);
		return cout;
	}
	double calculer_prix_location_final(Wilaya w)
	{
		double cout = super.calculer_prix_location_final(w);
		return cout;
	}
	
}
