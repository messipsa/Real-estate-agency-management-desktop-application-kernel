import java.awt.*;
import java.util.Date;

public abstract class Bien implements Comparable<Bien> {
    public String getAdresse () {
        return adresse;
    }

    public void setAdresse ( String adresse ) {
        this.adresse = adresse;
    }

    public Wilaya getWilaya () {
        return wilaya;
    }

    public void setWilaya ( Wilaya wilaya ) {
        this.wilaya = wilaya;
    }

    public Proprietaire getProprietaire () {
        return proprietaire;
    }

    public void setProprietaire ( Proprietaire proprietaire ) {
        this.proprietaire = proprietaire;
    }

    public double getSuperficie () {
        return superficie;
    }

    public void setSuperficie ( double superficie ) {
        this.superficie = superficie;
    }

    public double getPrix () {
        return prix;
    }

    public void setPrix ( double prix ) {
        this.prix = prix;
    }

    public boolean isNegociable () {
        return negociable;
    }

    public void setNegociable ( boolean negociable ) {
        this.negociable = negociable;
    }

    public String getDescription () {
        return description;
    }

    public void setDescription ( String description ) {
        this.description = description;
    }

    public String getPhotos () {
        return photos;
    }

    public void setPhotos ( String photos ) {
        this.photos = photos;
    }

    public boolean isArchive () {
        return archive;
    }

    public void setArchive ( boolean archive ) {
        this.archive = archive;
    }

    public Transaction getTransaction () {
        return transaction;
    }

    public void setTransaction ( Transaction transaction ) {
        this.transaction = transaction;
    }

    public Date getDate () {
        return date;
    }

    public void setDate ( Date date ) {
        this.date = date;
    }

    protected String adresse;
    protected Wilaya wilaya;
    protected Proprietaire proprietaire;
    protected double superficie;
    protected double prix;
    protected boolean negociable;
    protected String description;
    protected String photos;
    protected boolean archive;
    protected Date date;
    protected boolean Archive;

    protected enum Transaction {
        VENTE,LOCATION,ECHANGE;
    }

    protected Transaction transaction;

   /* public Bien (String adresse,Transaction transaction,double prix, Proprietaire proprietaire, Wilaya wilaya, double superficie, Date date)
    {
        this.adresse = adresse;
        this.transaction = transaction;
        this.prix = prix;
        this.proprietaire = proprietaire;
        this.wilaya = wilaya;
        this.superficie = superficie;
        this.date = date;
        this.Archive = false;

    }*/



    double calculer_prix_vente_final(Wilaya w)
	{
		double cout = this.getPrix();
		if((this.getPrix())<5000000)
		{
			if((w.getPrix_par_m2())<50000)
			{
				 cout = cout + 0.03*this.getPrix();
			}
			else
			{
				cout = cout + 0.035*cout;
			}
		}
		if(((this.getPrix())>=5000000)&&((this.getPrix())<=15000000))
		{
			if((w.getPrix_par_m2())<50000)
			{
				 cout = cout + 0.02*this.getPrix();
			}
			else
			{
				cout = cout + 0.025*cout;
			}
		}
		if((this.getPrix())>15000000)
		{
			if((w.getPrix_par_m2())<70000)
			{
				 cout = cout + 0.01*this.getPrix();
			}
			else
			{
				cout = cout + 0.02*cout;
			}
		}
		return cout;
		
	}

	public Bien(String adresse,Transaction transaction,double prix,Proprietaire proprietaire, Wilaya wilaya,  double superficie, 
			 Date date, boolean negociable, String description, String photos )
		 {
	super();
	this.adresse = adresse;
	this.wilaya = wilaya;
	this.proprietaire = proprietaire;
	this.superficie = superficie;
	this.prix = prix;
	this.negociable = negociable;
	this.description = description;
	this.photos = photos;
	this.date = date;
	this.transaction = transaction;
}

	
	double calculer_prix_location_final(Wilaya w)
	{
		double cout = this.getPrix();
		if(this.superficie<60)
		{
			if(w.getPrix_par_m2()<50000)
			{
				cout = cout + this.prix*0.01;
			}
			else
			{
				cout = cout + this.prix * 0.015;
			}
		}
		if(((this.superficie)>=60)&&((this.superficie)<=150))
		{
			if(w.getPrix_par_m2()<50000)
			{
				cout = cout + this.prix*0.02;
			}
			else
			{
				cout = cout + this.prix * 0.025;
			}
		}
		if(this.superficie>150)
		{
			if(w.getPrix_par_m2()<50000)
			{
				cout = cout + this.prix*0.03;
			}
			else
			{
				cout = cout + this.prix * 0.035;
			}
		}
		return cout;
	}
	
	
	double calculer_prix_echange_final(Wilaya w,Wilaya y)
	{
		double cout = this.calculer_prix_vente_final(w);
		if(w.getNom().equals(y.getNom()))
		{
			cout = cout + this.prix*0.0025;
		}
		return cout;
			
	}
   // abstract double calculer_prix_vente_Immo(Wilaya w);

    @Override
    public int compareTo ( Bien o ) {
        return o.date.compareTo (this.date);

    }

    abstract void afficher_sans_details();
    abstract void afficher();

}
