//import com.sun.source.tree.Tree;

import java.util.*;

public class Agence {

    public void afficher_bien( TreeSet<Bien> bienTreeSet ) {
        Iterator<Bien> it = bienTreeSet.iterator ();
        while (it.hasNext ()) {
            it.next ().afficher_sans_details();
        }
    }

    public void ajouter_bien (Bien bien,TreeSet<Bien> bienTreeSet)
    {
    	 Iterator<Bien> it = bienTreeSet.iterator ();
    	 boolean a=false;
         while (it.hasNext ()) {
            if( it.next ().getAdresse().equals(bien.getAdresse()))
            {
            	a=true;
            	break;
            }}
           if(!a)
           {
        	   bienTreeSet.add(bien);  
           }
      
           else {System.out.println("Ce bien existe deja!");} 
        
                                             
         
    
         //ajouter dans la liste de tout les biens
    }

    public void supprimer_bien(TreeSet<Bien> bienTreeSet, Bien bien)//Supprimer la liste des biens
    {
        bien.getProprietaire ().getBiens ().remove (bien);
        bienTreeSet.remove (bien);

    }

    public void archiverBien(TreeSet<Bien> bien_archi, TreeSet<Bien> bienTreeSet, Bien bien)//Archiver bien dans la liste des biens
    {
        bien_archi.add(bien);
        bien.setArchive (true);
        bienTreeSet.remove (bien);
    }

    /*public ListeBienfiltres filtrer(ArrayList<Bien> biens,ArrayList<Bien> criteres){//renvoie un tableau qui contient les resultats de la recherche avec certain criteres

        ArrayList<Bien> ListeBienfiltres = new ArrayList<Bien>;

        for(int i =0 ; i< criteres.size();i++)
        {    int j=0;
            for( j=0 ; j<biens.size();j++)
            {
                if(biens.get(j).getTypedetransaction().equals(criteres.get(i)))
                {
                    ListeBienflitres.add(biens.get(j));
                }
            }
        }

        return ListeBienfitres;
    }

    public void details(ArrayList<Bien> bien)//Afficher les details d'un bien
    {
        bien
    }

*/
    public void modifier_bien(Bien bien)//Modifier les informations du bien
    {
            int i;
            double prix;
            String adresse;
            Bien.Transaction transaction;

            System.out.println ("Voulez vous modifier : ");
            System.out.println ("1 - Le Prix : ");
            System.out.println ("2 - La Wilaya : ");
            System.out.println ("3 - L'adresse : ");
            System.out.println ("4 - Le type de transaction : ");
            //...
            System.out.println ("Entrez le nombre d'action correspondant S.V.P. : ");

            Scanner sc = new Scanner (System.in);
            i = sc.nextInt ();

            switch (i) {
                case 1: {
                    System.out.println ("Entrez le nouveau prix : ");
                    Scanner sc1 = new Scanner (System.in);
                    prix = sc1.nextDouble ();
                    bien.setPrix (prix);
                }
                break;
                case 2: {
                    System.out.println ("Entrez le nouvelle Wilaya : ");
                    Scanner sc1 = new Scanner (System.in);
                    String nom_modifie = sc1.nextLine ();
                    System.out.println ("Entrez le nouveau prix : ");
                    Scanner sc2 = new Scanner (System.in);
                    double prix_modifie = sc2.nextDouble ();
                    Wilaya wilaya = new Wilaya (nom_modifie,prix_modifie);
                    bien.setWilaya (wilaya); ;
                }break;
                case 3 : {
                    System.out.println ("Entrez le nouvelle adresse : ");
                    Scanner sc1 = new Scanner (System.in);
                    bien.setAdresse (sc1.nextLine ());

                }break;

                case 4 : {
                    System.out.println ("Entrez le nouveau type de transaction : ");
                    System.out.println ("1 - VENTE");
                    System.out.println ("2 - LOCATION");
                    System.out.println ("3 - ECHANGE");


                    Scanner sc1 = new Scanner (System.in);
                    int i_transaction = sc1.nextInt ();

                    switch (i_transaction) {
                        case 1 : bien.setTransaction (Bien.Transaction.VENTE);break;
                        case 2 : bien.setTransaction (Bien.Transaction.LOCATION);break;
                        case 3 : bien.setTransaction (Bien.Transaction.ECHANGE);break;
                    }

                }break;

            }

    }
    
    
    
    public void recherche(TreeSet<Bien> ts0,String[] val ,Boolean transaction,Boolean wilaya,Boolean prixmax,Boolean prixmin,Boolean typebien,Boolean supmin,Boolean nbminpcs,Boolean transaction2,Boolean wilaya2,Boolean typebien2){//Recherche a criteres 
    
  
    TreeSet ts2 = new TreeSet();
    ts2 = (TreeSet)ts0.clone();
    
    if(transaction||transaction2) {
    	
    	Iterator<Bien> it8 = ts0.iterator ();
    	
            for (int i8 = 0; i8 < ts0.size() ; i8++) {
            	
            	
   	           Bien bien= it8.next();
   	          
   	           if((!(bien.getTransaction().toString().equals(val[0])))&&(!(bien.getTransaction().toString().equals(val[8]))))  ts2.remove(bien);
   	        
            }
    }
    
    if((wilaya)||(wilaya2)) {
    	Iterator<Bien> it7 = ts0.iterator ();
        for (int i8 = 0; i8 < ts0.size() ; i8++) {
        	
	           Bien bien= it7.next();
	          
	          
	          
	       
	           if((!(bien.getWilaya().getNom().equals(val[1])))&&(!(bien.getWilaya().getNom().equals(val[7])))) {
	        	   ts2.remove(bien);
	        	   
	           }
        }
     }
    
    
    if(prixmax) {
    	Iterator<Bien> it6 = ts0.iterator ();
        for (int i8 = 0; i8 < ts0.size() ; i8++) {
	           Bien bien= it6.next();
	        
	           if((bien.getPrix()>Double.parseDouble(val[2])))  ts2.remove(bien);
        }
}
    if(prixmin) {
    	Iterator<Bien> it5 = ts0.iterator ();
        for (int i8 = 0; i8 < ts0.size() ; i8++) {
	           Bien bien= it5.next();
	           if(!(bien.getPrix()>=Double.parseDouble(val[3])))  ts2.remove(bien);
        }
}
    
    if(typebien) {
    	Iterator<Bien> it4 = ts0.iterator ();
        for (int i8 = 0; i8 < ts0.size() ; i8++) {
        	
	           Bien bien= it4.next();
	        //System.out.println(bien.getClass());
	           if((!(bien.getClass().toString().equals(val[4])))&&(!(bien.getClass().toString().equals(val[10]))))   ts2.remove(bien);
        }
     }
    
    
    if(supmin) {
    	Iterator<Bien> it3 = ts0.iterator ();
        for (int i8 = 0; i8 < ts0.size() ; i8++) {
	           Bien bien= it3.next();
	           if(!(bien.getSuperficie()>=Double.parseDouble(val[5])))  ts2.remove(bien);
        }
     }
    
    
    if(nbminpcs) {
    	Iterator<Bien> it2 = ts0.iterator ();
        for (int i8 = 0; i8 < ts0.size() ; i8++) {
        	 Bien bien= it2.next();
        	   if(!(bien.getClass().toString().equals("class Bien_non_habitable"))) {
	          
	           bien_habitable bien2 = (bien_habitable) bien;
	           if(!(bien2.getNbr_pieces()>=Double.parseDouble(val[6])))   ts2.remove(bien);
        }else { ts2.remove(bien);
        }
        }
        }
    
    
    
    Iterator<Bien> it1 = ts2.iterator ();
    for (int j6 = 0; j6 <ts2.size() ; j6++) {
    	it1.next ().afficher_sans_details ();
    }
    
 
        
   	 
    }
   

   /* public void bienproprietere(Proprietere proprietere,ListeBien<Bien> biens)//Afficher les biens du proprietere
    {
        for(int i = 0 ; i< biens.size() ; i++ )
        {
            if(biens.get(i).proprietere.equals(proprietere)) System.out.println(biens.get(i).toString());
        }
    }
*/
}
