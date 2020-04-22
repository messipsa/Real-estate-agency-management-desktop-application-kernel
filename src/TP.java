import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;
public class TP {
    public static void main ( String[] args ) throws InterruptedException {
        String[][] message = new String[50][2];
        String[] val = new String[11];
        Agence imoesi = new Agence ();
        int i_msg = 0;
        Wilaya bejaia = new Wilaya ("bejaia", 100000);
        Wilaya constantine = new Wilaya ("constantine", 30000);
        Wilaya oran = new Wilaya ("oran", 60000);
        Wilaya wilaya0 = new Wilaya ("wilaya0",0);
        TreeSet<Bien> ts1 = new TreeSet<Bien> (); //biens du prop1
        TreeSet<Bien> ts2 = new TreeSet<Bien> (); //biens du prop2
        TreeSet<Bien> ts3 = new TreeSet<Bien> (); //biens du prop1
        TreeSet<Bien> ts4 = new TreeSet<Bien> (); //biens du prop1
        TreeSet<Bien> ts5 = new TreeSet<Bien> ();
        Proprietaire prop1 = new Proprietaire ("Tamazouzt", "Messipsa", "maximtm@gmail.com", "0796081288", "Rue Yataghane Rachid Sidi-Aich Bejaia", ts1);
        Proprietaire prop2 = new Proprietaire ("Adjedjou", "Hakim", "Adjhakim@gmail.com", "0796230688", "08 Lotissement Tilelli Azazga Tizi-Ouzou", ts2);
        Proprietaire prop3 = new Proprietaire ("Kesraoui", "Elias", "Eliaskesraoui@hotmail.com", "0674010403", "Batiment C n81 cité la révolution Mostaganem ", ts3);
        Proprietaire prop4 = new Proprietaire ("Mouelhi", "Malika", "Mmalika@outlook.com", "0557128946", "n71 Quartier la noblesse Draria Alger", ts4);
        ArrayList<Proprietaire> ProprietaireArrayList = new ArrayList<Proprietaire> ();
        ProprietaireArrayList.add (prop1);
        ProprietaireArrayList.add (prop2);
        ProprietaireArrayList.add (prop3);
        ProprietaireArrayList.add (prop4);
        Date d =new Date();
        Thread.sleep(2);
        Date e = new Date();
        System.out.println(d);
        System.out.println(e);
        Date date1 = new Date (110, Calendar.APRIL, 11);
        Date date2 = new Date (111, Calendar.DECEMBER, 5);
        Date date3 = new Date (112, Calendar.JANUARY, 13);
        Date date4 = new Date (113, Calendar.FEBRUARY, 22);
        Date date5 = new Date (114, Calendar.NOVEMBER, 14);
        Date date6 = new Date (115, Calendar.MARCH, 11);
        Date date7 = new Date (116, Calendar.AUGUST, 12);
        Date date8 = new Date (117, Calendar.SEPTEMBER, 25);
        Maison bien2=null;
        Maison bien5=null;
        Maison bien8=null;
        Apartement bien1 = new Apartement ("n27 Cité La pérouse  constantine", Bien.Transaction.VENTE, 4000000, prop2, constantine, 120, date1,true,"Un appartement F4","Photo1",4,true, 1, true, true);
       try { bien2 = new Maison ("n38 Rue Mostefa Ben Boulaid oran", Bien.Transaction.VENTE, 10000000, prop1, oran, 200, date2,true,"Maison avec jardin","Photo2",9,true, false, false, true, 170,2);}catch(except_chifr ela)
       {
      	 System.out.println("Pas d'ajout Veuillez introduire un nombre valide");
      	
       }
        Bien_non_habitable bien3 = new Bien_non_habitable ("Route de la daira n19 bejaia", Bien.Transaction.VENTE, 20000000, prop1, bejaia, 500, date3,true,"terrain de 500 metres carrés","Photo3", "Papier timbre", 3);
        Apartement bien4 = new Apartement ("cité des fréres Hamou oran", Bien.Transaction.LOCATION, 40000, prop2, oran, 100, date4,false,"Un appartement F3","Photo 4",3,true, 1,  true, true);
       try {  bien5 = new Maison ("n21 Rue Bouchal Madjid constantine", Bien.Transaction.LOCATION, 150000, prop3, constantine, 160, date5,true,"Maison avec piscine","Photo5",7,true, false, true, false, 140, 2);}catch(except_chifr ela)
       {
        	 System.out.println("Pas d'ajout Veuillez introduire un nombre valide");
        	
         } 
       Apartement bien6 = new Apartement ("Résidence la sureté n4 oran", Bien.Transaction.LOCATION, 60000, prop2, oran, 50, date6,true,"Un studio","Photo6",1,true, 6, true, false);
        Bien_non_habitable bien7 = new Bien_non_habitable ("Chemin des Cretes n145 bejaia", Bien.Transaction.ECHANGE, 18000000, prop1, bejaia, 650, date7,true,"terrain de 650 metres carrés","Photo7","Papier timbre",1  );
       try { bien8 = new Maison ("n12 Lotissement Slimane Adli", Bien.Transaction.ECHANGE, 14000000, prop2, constantine, 200, date8,false,"Maison avec garage","Photo8",11, true,true, false, false,175,3);}catch(except_chifr ela)
       {
      	 System.out.println("Pas d'ajout Veuillez introduire un nombre valide");
      	
       } 
        ts1.add (bien2);
        ts1.add (bien3);
        ts1.add (bien7);
        ts2.add (bien1);
        ts2.add (bien4);
        ts2.add (bien6);
        ts2.add (bien8);
       ts3.add (bien5);
        TreeSet<Bien> ts0 = new TreeSet<Bien> (); //tout les biens
        ts0.add (bien2);
        ts0.add (bien3);
        ts0.add (bien1);
        ts0.add (bien4);
        ts0.add (bien5);
        ts0.add (bien6);
        ts0.add (bien7);
        ts0.add (bien8);
        //ts0.add (bien8);
        TreeSet<Bien> ts_archive = new TreeSet<Bien> (); //tout les biens
        String mdp = "123456";

        boolean continu_principal = true;
        int i ;
        while (continu_principal) { 
        	while (true) {
        	try {
           System.out.println ("Voulez vous vous connecter en tant que : ");
            System.out.println ("1 - Admin");
            System.out.println ("2 - Client");
            System.out.println ("Entrez votre choix S.V.P. : ");
            Scanner sc1 = new Scanner (System.in);
            i = sc1.nextInt ();
            //break;
            if((i!=2)&&(i!=1))
            {
            	
            	continue ;
            }
            {
                if ( i == 1 ) { 
                	fin:  System.out.println ("Entrez votre mot de passe : ");
                    Scanner sc2 = new Scanner (System.in);
                    String motdepasse = sc2.nextLine ();
                    if ( mdp.equals (motdepasse) ) {
                        System.out.println ("***** Connexion Réussie *****");
                        boolean continu = true;
                        int j = 0;
                        while (continu) {
                        	    
                        	
                        	try {
                            System.out.println ("Choisissez l'action que vous voulez effectuer : ");
                            System.out.println ("1 - Afficher les biens d'un proprietaire donne : ");
                            System.out.println ("2 - Ajouter un bien : ");
                            System.out.println ("3 - Archiver un bien : ");
                            System.out.println ("4 - Supprimer un bien : ");
                            System.out.println ("5 - Afficher un bien donne : ");
                            System.out.println ("6 - Afficher les message recus : ");
                            System.out.println ("7 - Modifier un bien : ");
                            System.out.println ("8 - Afficher les prix de chaque biens : ");
                            System.out.println ("9 - Recherche des biens : ");
                            System.out.println ("10 - Affichage détaillé des biens : ");
                            System.out.println ("11 - Affichage sans details de tout les biens : ");
                            
                            Scanner action_admin = new Scanner (System.in);
                            j = action_admin.nextInt ();}
                        	catch(java.util.InputMismatchException exeption)
                        	{
                        		System.out.println("Choix invalide!!");
                        	}
                            switch (j) {
                                case 1: {//Affichage des biens d'un proprietaire donnÃ©
                                    System.out.println ("Entrez le nombre du proprietaire : ");
                                    Scanner sc3 = new Scanner (System.in);
                                    int num_prop = sc3.nextInt ();
                                    int i3;
                                    if(num_prop>ProprietaireArrayList.size())
                                    {
                                    	System.out.println("Veuillez introduire un numero valide");
                                    	break;
                                    }
                                    Iterator<Proprietaire> it3 = ProprietaireArrayList.iterator ();
                                    for (i3 = 0; i3 < num_prop - 1; i3++) {
                                        if ( it3.hasNext () ) it3.next ();
                                    }                                      
                                    Proprietaire pp= it3.next ();                    
                                    imoesi.afficher_bien (pp.getBiens ());
                                }
                                break;
                                case 2: { //ajouter un bien
                               	 Proprietaire prop = null;
                              	  System.out.println ("Choisissez entre : ");
                              	  System.out.println ("1- Prorietaire existant : ");
                                    System.out.println ("2- Nouveau proprietaire : ");
                                    Scanner sci = new Scanner (System.in);
                                    int tf = sci.nextInt ();
                                    switch(tf)
                                    {case 1 :{
                                      int i3;
                                      Iterator<Proprietaire> it3 = ProprietaireArrayList.iterator ();
                                      for (i3 = 0; i3 < ProprietaireArrayList.size() ; i3++) {
                                    	  Proprietaire k = it3.next();
                                          System.out.println(i3+1+"-" + k.getNom() + "  " + k.getPrenom());                                       
                                      }                                       
                                      Scanner sc = new Scanner(System.in);
                                      int r = sc.nextInt();
                                      Iterator<Proprietaire> it4 = ProprietaireArrayList.iterator ();
                                      for (i3 = 1; i3 < r; i3++) {
                                      	it4.next();
                                       
                                      } 
                                      prop = it4.next();
                                      break;}
                                    case 2 :{System.out.println ("Veuillez introduire le nom du proprietaire : ");
                                    Scanner scc = new Scanner (System.in);
                                    String l;
                                    l = scc.nextLine ();
                                    String lm;
                                    System.out.println ("Veuillez introduire le prenom du proprietaire : ");
                                    Scanner scc1 = new Scanner (System.in);
                                    lm = scc1.nextLine ();
                                    String lf;
                                    System.out.println ("Veuillez introduire l'adresse mail du proprietaire ");
                                    Scanner scc2 = new Scanner (System.in);
                                    lf = scc2.nextLine ();
                                    String ls;
                                    System.out.println ("Veuillez introduire le numero de telephone du proprietaire ");
                                    Scanner scc3 = new Scanner (System.in);
                                    ls = scc3.nextLine ();
                                    String lv;
                                    System.out.println ("Veuillez introduire l'adresse du proprietaire ");
                                    Scanner scc4 = new Scanner (System.in);
                                    lv = scc4.nextLine ();
                                    TreeSet<Bien> ts = new TreeSet<Bien> ();
                                    prop = new Proprietaire (l, lm, lf, ls, lv, ts);
                                    ProprietaireArrayList.add (prop);                                	
                                      break;}}
                                    Proprietaire p = prop;
                                    System.out.println ("Veillez introduire l'adresse exacte  : ");
                                    Scanner scc333 = new Scanner (System.in);
                                    String  r6 = scc333.nextLine ();
                                    System.out.println("Veuillez introduire le prix : ");
                                    Scanner scc148 = new Scanner (System.in);
                                    Double r14 = scc148.nextDouble(); 
                                    if(r14<=0)
                                    {
                                    	System.out.println("Veuillez introduire un numero valide :");
                                    	break;
                                    }
                                    System.out.println("Veuillez introduire la superficie  : ");
                                    Scanner scc147= new Scanner (System.in);
                                    Double r79 = scc147.nextDouble();
                                    if(r79<=0)
                                    {
                                    	System.out.println("Veuillez introduire un numero valide :");
                                    	break;
                                    }
                                    System.out.println ("Veillez introduire la wilaya  : ");
                                    Scanner scc33 = new Scanner (System.in);
                                    String  r59 = scc33.nextLine ();
                                    System.out.println("Veuillez introduire le prix du metre carré  : ");
                                    Scanner scc47= new Scanner (System.in);
                                    Double r77 = scc47.nextDouble();
                                    if(r77<=0)
                                    {
                                    	System.out.println("Veuillez introduire un numero valide :");
                                    	break;
                                    }
                                    Wilaya wilaya = new Wilaya(r59,r77);
                               	 Bien.Transaction transaction2 = Bien.Transaction.VENTE;
                                   	String ll;
                                   	fg :System.out.println ("Veillez introduire le type de transaction : ");
                                   	System.out.println ("1- VENTE");
                                   	System.out.println ("2- LOCATION");
                                   	System.out.println ("3- ECHANGE ");
                                       Scanner scc11 = new Scanner (System.in);
                                      int r1 = scc11.nextInt();      
                                      if((r1<1)||(r1>3))
                                      {
                                    	  System.out.println("Veuillez introduire un numero valide :");
                                    	  break;
                                      }
                                       switch(r1)
                                       {
                                       case 1:transaction2 = Bien.Transaction.VENTE;break;
                                       case 2:transaction2 = Bien.Transaction.LOCATION;break;
                                       case 3:transaction2 = Bien.Transaction.ECHANGE;break;
                                       }
                                       String lmk;
                                       System.out.println ("Voulez vous introduire un Bien négociable ? (true pour OUI , false pour NON)");
                                       Scanner scan3 = new Scanner (System.in);
                                       boolean billy = scan3.nextBoolean ();
                                   	System.out.println ("Veillez introduire le descriptif : ");
                                       Scanner scc222 = new Scanner (System.in);
                                       lmk = scc222.nextLine ();                                   
                                       String lkm;
                                   	System.out.println ("Veillez introduire l'Url de la photo : ");
                                       Scanner scc221 = new Scanner (System.in);
                                       lkm= scc221.nextLine ();
                                   	System.out.println ("Veillez introduire le type du bien : ");
                                   	System.out.println ("1- Maison");
                                   	System.out.println ("2- Apartement");
                                   	System.out.println ("3- bien_non_habitable ");
                                       Scanner scc111 = new Scanner (System.in);
                                      int r5 = scc111.nextInt();    
                                      if((r5<1)||(r5>3))
                                      {
                                    	  System.out.println("Veuillez introduire un numero valide :");
                                    	  break;
                                      }
                                       switch(r5) {case 1:	{System.out.println ("Veillez introduire le nombre de pieces : ");
                                       Scanner scc38 = new Scanner (System.in);
                                       int r7= scc38.nextInt ();
                                       if(r7<=0)
                                       {
                                       	System.out.println("Veuillez introduire un numero valide :");
                                       	break;
                                       }
                                       System.out.println ("Veuillez introduire le nombre d'etages  : ");
                                       Scanner scc39 = new Scanner (System.in);
                                       int r8= scc39.nextInt ();
                                      /* if(r8<=0)
                                       {
                                       	System.out.println("Veuillez introduire un numero valide :");
                                       	break;
                                       }*/
                                       System.out.println ("Veuillez introduire la superficie habitable  : ");
                                       Scanner scc419 = new Scanner (System.in);
                                       int rl= scc419.nextInt ();
                                       /*if((rl<=0)||(rl>r79))
                                       {
                                       	System.out.println("Veuillez introduire un numero valide :");
                                       	break;
                                       }*/
                                       System.out.println ("Voulez vous choisir une maison avec garage ? (true pour OUI , false pour NON)");
                                       Scanner scan = new Scanner (System.in);
                                       boolean bil = scan.nextBoolean ();
                                       System.out.println ("Voulez vous choisir une maison avec piscine ? (true pour OUI , false pour NON)");
                                       Scanner scan1 = new Scanner (System.in);
                                       boolean bil1 = scan1.nextBoolean ();
                                       System.out.println ("Voulez vous choisir une maison avec jardin ? (true pour OUI , false pour NON)");
                                       Scanner scan2 = new Scanner (System.in);
                                       boolean bil2 = scan2.nextBoolean ();
                                       System.out.println ("Voulez vous choisir une maison meublé ? (true pour OUI , false pour NON)");
                                       Scanner scan34 = new Scanner (System.in);
                                       boolean bil3 = scan34.nextBoolean ();  
                                       Date dati = new Date();
                                       Bien m=null;
                                        try {
                                       	  m = new Maison(r6,transaction2,r14,prop,wilaya,r79,dati,billy,lmk,lkm,r7,bil3,bil,bil1,bil2,rl,r8);}
                                         catch(except_chifr ela)
                                         {
                                        	 System.out.println("Pas d'ajout Veuillez introduire un nombre valide");
                                        	break;
                                         }
                                       	TreeSet<Bien> b = prop.getBiens();
                                       	if(m==null)
                                       	{
                                       		break;
                                       	}
                                       	b.add(m);
                                      	prop.setBiens(b);
                                       	imoesi.ajouter_bien (m, ts0);
                                       	break;}
                                       case 2 :  {
                                       	System.out.println ("Veillez introduire le nombre de pieces : ");
                                           Scanner scc41 = new Scanner (System.in);
                                           int r11= scc41.nextInt ();
                                           if(r11<=0)
                                           {
                                         	  System.out.println("Veuillez introduire un numero valide :");
                                         	  break;
                                           }
                                           
                                          System.out.println ("Veuillez introduire l'etage  : ");
                                           Scanner scc49 = new Scanner (System.in);
                                           int r81= scc49.nextInt ();
                                            if(r81<=0)
                                           {
                                         	  System.out.println("Veuillez introduire un numero valide :");
                                         	  break;
                                           }
                                           
                                           System.out.println ("Voulez vous choisir un appartement avec ascenseur ? (true pour OUI , false pour NON)");
                                           Scanner scan23 = new Scanner (System.in);
                                           boolean bil23 = scan23.nextBoolean ();
                                           System.out.println ("Voulez vous choisir un appartement Duplex ? (true pour OUI , false pour NON)");
                                           Scanner scan25 = new Scanner (System.in);
                                           boolean bil25 = scan25.nextBoolean ();
                                           if (r11==1)
                                           {
                                        	   bil25=true;
                                           }
                                           Date dat = new Date();
                                           System.out.println ("Voulez vous choisir un appartement meublé ? (true pour OUI , false pour NON)");
                                           Scanner scan24 = new Scanner (System.in);
                                           boolean bil24 = scan24.nextBoolean ();                                           
                                       	Bien ap = new Apartement(r6,transaction2,r14,prop,wilaya,r79,dat,billy,lmk,lkm,r11,bil24,r81,bil25,bil23); 
                                       	TreeSet<Bien> b1 = prop.getBiens();
                                       	b1.add(ap);
                                       	prop.setBiens(b1);
                                       	imoesi.ajouter_bien (ap, ts0);break;                                          
                                       }
                                       case 3 :  {System.out.println ("Veillez introduire le nombre de façades : ");
                                       Scanner scc377 = new Scanner (System.in);
                                       double r799 = scc377.nextInt ();
                                       if(r799<=0)
                                       {
                                       	System.out.println("Veuillez introduire un numero valide :");
                                       	break;
                                       }
                                       String lg;
                                   	System.out.println ("Veillez introduire le statut juridique : ");
                                       Scanner scc226 = new Scanner (System.in);
                                       lg= scc226.nextLine ();
                                       Date da = new Date();
                                       	Bien ter = new  Bien_non_habitable(r6,transaction2,r14,prop,wilaya,r79,da,billy,lmk,lkm,lg,(int)r799);
                                       	;TreeSet<Bien> b2 =  prop.getBiens();
                                       	b2.add(ter);
                                       	prop.setBiens(b2);
                                       	
                                       	imoesi.ajouter_bien(ter, ts0);break;
                                       	
                                       }}
                                       
                                  
                                   imoesi.afficher_bien (ts0);

                               }   break;  
                                case 3: { //archiver un bien
                                    System.out.println ("----- Archiver un bien -----");
                                    System.out.println ("Entrez le numero du bien a archiver : ");
                                    Scanner sc3 = new Scanner (System.in);
                                    int i3 = sc3.nextInt ();
                                    if((i3<=0)||(i3>ts0.size()))
                                    {
                                    	System.out.println("Veuillez introduire un nombre valide");
                                    	break;
                                    }
                                    Iterator<Bien> it = ts0.iterator ();
                                    for (int j3 = 0; j3 < i3 - 1; j3++) {
                                        it.next ();
                                    }
                                    System.out.println ("**************************************************");

                                    System.out.println ("Voici les biens avant l'archive : ");
                                    imoesi.afficher_bien (ts0);
                                    imoesi.archiverBien (ts_archive, ts0, it.next ());
                                    System.out.println ("**************************************************");

                                    System.out.println ("Voici les biens archives : ");
                                    imoesi.afficher_bien (ts_archive);
                                    System.out.println ("**************************************************");

                                    System.out.println ("Voici les biens apres l'archive : ");
                                    imoesi.afficher_bien (ts0);
                                    System.out.println ("**************************************************");
                                }
                                break;
                                case 4: { //supprimer un bien
                                    System.out.println ("----- Supprimer un bien -----");
                                    System.out.println ("Entrez le numero du bien a supprimer : ");
                                    Scanner sc4 = new Scanner (System.in);
                                    int i4 = sc4.nextInt ();
                                    if((i4<=0)||(i4>ts0.size()))
                                    {
                                    	System.out.println("Veuillez introduire un nombre valide");
                                    	break;
                                    }
                                    Iterator<Bien> it4 = ts0.iterator ();
                                    for (int j3 = 0; j3 < i4 - 1; j3++) {
                                        it4.next ();
                                    }
                                    System.out.println ("**************************************************");
                                    System.out.println ("Voici les biens avant la suppression : ");
                                    imoesi.afficher_bien (ts0);
                                    imoesi.supprimer_bien (ts0, it4.next ());
                                    System.out.println ("**************************************************");
                                    System.out.println ("Voici les biens apres la suppression : ");
                                    imoesi.afficher_bien (ts0);
                                    System.out.println ("**************************************************");
                                }
                                break;

                                case 5: { //afficher un bien donne
                                    System.out.println ("----- Afficher un bien -----");
                                    System.out.println ("Entrez le numero du bien a afficher : ");
                                    Scanner sc5 = new Scanner (System.in);
                                    int i5 = sc5.nextInt ();
                                    if((i5<=0)||(i5>ts0.size()))
                                    {
                                    	System.out.println("Veuillez introduire un nombre valide");
                                    	break;
                                    }
                                    Iterator<Bien> it5 = ts0.iterator ();
                                    for (int j5 = 0; j5 < i5 - 1; j5++) {
                                        it5.next ();
                                    }
                                    it5.next ().afficher_sans_details ();
                                }

                                case 6: { //afficher les messages
                                    for (int i6 = 0; i < i_msg + 1; i++) {
                                        System.out.println ("***************************************");
                                        System.out.println (message[i][0]);
                                        System.out.println (message[i][1]);
                                        System.out.println ("***************************************");
                                    }
                                }
                                break;

                                case 7: { //modifier un bien
                                    System.out.println ("----- Modifier un bien -----");
                                    {
                                        System.out.println ("Entrez le numero du bien a modifier : ");
                                        Scanner sc7 = new Scanner (System.in);
                                        int i7 = sc7.nextInt ();
                                        if((i7<=0)||(i7>ts0.size()))
                                        {
                                        	System.out.println("Veuillez introduire un numero valide :");
                                        	break;
                                        }
                                        Iterator<Bien> it7 = ts0.iterator ();
                                        for (int j7 = 0; j7 < i7 - 1; j7++) {
                                            it7.next ();
                                        }
                                        imoesi.modifier_bien (it7.next ());
                                    }
                                }
                                break;
                                case 8 : {//afficher les prix finaux des biens
                                

                                     Iterator<Bien> it8 = ts0.iterator ();
                                     for (int i8 = 0; i8 < ts0.size() ; i8++) {
                                    	 System.out.println();
                                    	 Bien bien= it8.next();
                                    	 Bien.Transaction transaction = bien.getTransaction();
                                    	 int i9 = i8+1;
                                         switch (transaction) {
                                             case VENTE: System.out.println("Le prix du bien "+ i9 +" : "+"de type : "+bien.getClass().getSimpleName() +" "+ (long)bien.calculer_prix_vente_final(bien.getWilaya ())+" DA "+"Le prorietaire est : "+bien.getProprietaire().getNom()+" "+bien.getProprietaire().getPrenom() +"Ajouté le " + bien.getDate());break;
                                             case LOCATION :System.out.println("Le prix du bien "+i9 +" de type :  "+bien.getClass().getSimpleName()+ " : " +(long)bien.calculer_prix_location_final(bien.getWilaya ())+" DA "+"Le prorietaire est : "+bien.getProprietaire().getNom()+" "+bien.getProprietaire().getPrenom() +"Ajouté le " + bien.getDate()) ;break;
                                             case ECHANGE : System.out.print("Le prix du bien "+i9 + " de type :  "+bien.getClass().getSimpleName() +" (echange dans la meme wilaya) : " +(long)bien.calculer_prix_echange_final(bien.getWilaya (),bien.getWilaya ())+" DA"+" , "); System.out.println("(echange dans une autre wilaya) : " +(long)bien.calculer_prix_echange_final(bien.getWilaya (),wilaya0)+" DA "+"Le prorietaire est : "+bien.getProprietaire().getNom()+" "+bien.getProprietaire().getPrenom() +"Ajouté le " + bien.getDate());break;
                                      
                                    	 
                                     } 
                                     
                                      
                                	}
                               
                                }
                                break;
                                case 10:{
                                	System.out.println("Entrez le numero du bien que vous voulez afficher avec details");
                                	 Scanner sc68 = new Scanner (System.in);
                                     int rt = sc68.nextInt ();
                                     if((rt<=0)||(rt>ts0.size()))
                                     {
                                    	 System.out.println("Entrez un nombre valide");
                                    	 break ;
                                     }
                                	 Iterator<Bien> it88 = ts0.iterator ();
                                     for (int i8 = 0; i8 < rt-1 ; i8++) {it88.next();}
                                    	it88.next().afficher();
                                }break;
                                case 9:{
                                	System.out.println("Operation de recherche : ");
                                	Boolean b1 , b2 , b3 , b4 , b5 , b6 , b7 , b11,b21,b35;
                                	 b11 = false;
                                	 b21=false;
                                	 b35=false;
                                	System.out.println ("Voulez vous choisir le type de transction ? (true pour OUI , false pour NON)");
                                    Scanner scc1 = new Scanner (System.in);
                                    b1 = scc1.nextBoolean ();
                                    if(b1)
                                    {
                                    	String ll;
                                    	System.out.println ("Veillez introduire le type de transaction : ");
                                        Scanner scc11 = new Scanner (System.in);
                                        ll = scc11.nextLine ();
                                        val[0]=ll;
                                        System.out.println ("Voulez vous choisir le type de transction ? (true pour OUI , false pour NON)");
                                        Scanner sccc1 = new Scanner (System.in);
                                       
                                        b11 = sccc1.nextBoolean ();
                                        if(b11)
                                        {
                                        	String lcl = null;
                                        	System.out.println ("Veillez introduire le type de transaction : ");
                                            Scanner scc111 = new Scanner (System.in);
                                            ll = scc111.nextLine ();
                                            val[8]=lcl;
                                    }
                                    }
                                    System.out.println ("Voulez vous choisir une wilaya ? (true pour OUI , false pour NON)");
                                    Scanner scc2 = new Scanner (System.in);
                                    b2 = scc2.nextBoolean ();
                                    if(b2)
                                    {
                                    	String lk;
                                    	System.out.println ("Veillez introduire la wilaya : ");
                                        Scanner scc22 = new Scanner (System.in);
                                        lk = scc22.nextLine ();
                                        val[1]=lk;
                                        System.out.println ("Voulez vous choisir une wilaya ? (true pour OUI , false pour NON)");
                                        Scanner sclc2 = new Scanner (System.in);
                                        b21 = sclc2.nextBoolean ();
                                        if(b21)
                                        {
                                        	String lks=null;
                                        	System.out.println ("Veillez introduire la wilaya : ");
                                            Scanner scc422 = new Scanner (System.in);
                                            lks = scc422.nextLine ();
                                            val[7]=lks;
                                    }
                                    }
                                    System.out.println ("Voulez vous introduire un prix max ? (true pour OUI , false pour NON)");
                                    Scanner scc3 = new Scanner (System.in);
                                    b3 = scc3.nextBoolean ();
                                    if(b3)
                                    {
                                    	String lk;
                                    	System.out.println ("Veillez introduire le prix max : ");
                                        Scanner scc32 = new Scanner (System.in);                                       
                                        lk = scc32.nextLine ();
                                        val[2]=lk;
                                    }
                                    System.out.println ("Voulez vous introduire un prix min ? (true pour OUI , false pour NON)");
                                    Scanner scc4 = new Scanner (System.in);
                                    b4 = scc4.nextBoolean ();
                                    if(b4)
                                    {
                                    	String lk;
                                    	System.out.println ("Veillez introduire le prix min : ");
                                        Scanner scc35 = new Scanner (System.in);
                                        lk = scc35.nextLine ();
                                        val[3]=lk;
                                    }
                                    System.out.println ("Voulez vous introduire le type du bien ? (true pour OUI , false pour NON)");
                                    Scanner scc5 = new Scanner (System.in);
                                    b5 = scc5.nextBoolean ();
                                    if(b5)
                                    {
                                    	String lk;
                                    	System.out.println ("Veillez introduire le type du bien : ");
                                        Scanner scc36 = new Scanner (System.in);
                                        lk = scc36.nextLine ();
                                        val[4]="class "+lk;
                                        System.out.println ("Voulez vous introduire le type du bien ? (true pour OUI , false pour NON)");
                                        Scanner sccc5 = new Scanner (System.in);
                                        b35 = sccc5.nextBoolean ();
                                        if(b35)
                                        {
                                        	String lkf=null;
                                        	System.out.println ("Veillez introduire le type du bien : ");
                                            Scanner sccc36 = new Scanner (System.in);
                                            lkf = sccc36.nextLine ();
                                            val[10]="class "+lkf;}
                                    }
                                    System.out.println ("Voulez vous introduire la superficie minimale  ? (true pour OUI , false pour NON)");
                                    Scanner scc6 = new Scanner (System.in);
                                    b6 = scc6.nextBoolean ();
                                    if(b6)
                                    {
                                    	String lk;
                                    	System.out.println ("Veillez introduire le superficie minimale : ");
                                        Scanner scc37 = new Scanner (System.in);
                                        lk = scc37.nextLine ();
                                        val[5]=lk;
                                    }
                                    System.out.println ("Voulez vous introduire le nombre minimal de pieces  ? (true pour OUI , false pour NON)");
                                    Scanner scc7 = new Scanner (System.in);
                                    b7 = scc7.nextBoolean ();
                                    if(b7)
                                    {
                                    	String lk;
                                    	System.out.println ("Veillez introduire le nombre minimal de pieces : ");
                                        Scanner scc38 = new Scanner (System.in);
                                        lk = scc38.nextLine ();
                                        val[6]=lk;
                                    }
                                    
                                	imoesi.recherche(ts0,val ,b1,b2,b3,b4,b5,b6,b7,b11,b21,b35);
                                	
                            }break;
                                case 11 :{
                                	imoesi.afficher_bien (ts0);
                                }break;
                            }
                            System.out.println ("Voulez vous continuer ? (true pour OUI , false pour NON)");
                            Scanner sc_continu = new Scanner (System.in);
                            continu = sc_continu.nextBoolean ();
                        }
                        } else System.out.println ("Mot de passe incorrecte, veuillez ressayer S.V.P.");

                } else {
                    if ( i == 2 ) {
                        System.out.println ("Bienvenu Cher Client !!!");
                        System.out.println ("Choisissez l'action que vous voulez effectuer : ");
                        System.out.println ("1 - Envoyer un message a l'agence : ");
                        System.out.println("2- Affichage détaillé des biens :");
                        System.out.println("3- Affichage des biens sans datails :");
                        System.out.println("4-Affichage des prix finaux des biens : " );
                        System.out.println("5-Affichage d'un bien donné :");
                        System.out.println("6-Recherche par critères :");
                        System.out.println("7-Afficher les prix finaux :");
                        Scanner action_admin = new Scanner (System.in);
                        int j2 = action_admin.nextInt ();
                        boolean continu2 = true;
                        while (continu2) {
                            switch (j2) {
                                case 1: { //envoyer un message
                                    System.out.println ("----- Envoyer  un msg -----");
                                    System.out.println ("Entrez le message a envoyer : ");
                                    Scanner sc6_1 = new Scanner (System.in);
                                    String i6_1 = sc6_1.nextLine ();
                                    System.out.println ("Entrez votre nom et prenom : ");
                                    Scanner sc6_2 = new Scanner (System.in);
                                    String i6_2 = sc6_2.nextLine ();
                                    i_msg++;
                                    envoyer_msg (i6_1, i6_2, message, i_msg);

                                }
                                break;
                                case 2:{
                                	System.out.println("Entrez le numero du bien que vous voulez afficher avec details");
                                	 Scanner sc68 = new Scanner (System.in);
                                     int rt = sc68.nextInt ();
                                     if((rt<=0)||(rt>ts0.size()))
                                     {
                                    	 System.out.println("Entrez un nombre valide");
                                    	 break;
                                     }
                                	 Iterator<Bien> it88 = ts0.iterator ();
                                     for (int i8 = 0; i8 < rt-1 ; i8++) {it88.next();}
                                    	it88.next().afficher();
                                    }break;
                                case 3 :{
                                	imoesi.afficher_bien (ts0);
                                }break;
                                case 4 : {//afficher les prix finaux des biens
                                    

                                    Iterator<Bien> it8 = ts0.iterator ();
                                    for (int i8 = 0; i8 < ts0.size() ; i8++) {
                                   	 System.out.println();
                                   	 Bien bien= it8.next();
                                   	 Bien.Transaction transaction = bien.getTransaction();
                                   	 int i9 = i8+1;
                                        switch (transaction) {
                                        case VENTE: System.out.println("Le prix du bien "+ i9 +" : "+"de type : "+bien.getClass().getSimpleName() +" "+ (long)bien.calculer_prix_vente_final(bien.getWilaya ())+" DA "+"Le prorietaire est : "+bien.getProprietaire().getNom()+" "+bien.getProprietaire().getPrenom() +"Ajouté le " + bien.getDate());break;
                                        case LOCATION :System.out.println("Le prix du bien "+i9 +" de type :  "+bien.getClass().getSimpleName()+ " : " +(long)bien.calculer_prix_location_final(bien.getWilaya ())+" DA "+"Le prorietaire est : "+bien.getProprietaire().getNom()+" "+bien.getProprietaire().getPrenom() +"Ajouté le " + bien.getDate()) ;break;
                                        case ECHANGE : System.out.print("Le prix du bien "+i9 + " de type :  "+bien.getClass().getSimpleName() +" (echange dans la meme wilaya) : " +(long)bien.calculer_prix_echange_final(bien.getWilaya (),bien.getWilaya ())+" DA"+" , "); System.out.println("(echange dans une autre wilaya) : " +(long)bien.calculer_prix_echange_final(bien.getWilaya (),wilaya0)+" DA "+"Le prorietaire est : "+bien.getProprietaire().getNom()+" "+bien.getProprietaire().getPrenom() +"Ajouté le " + bien.getDate());break;
                                     
                                   	 
                                    } 
                                
                               	}
                              
                               }break;
                                case 5: { //afficher un bien donne
                                    System.out.println ("----- Afficher un bien -----");
                                    System.out.println ("Entrez le numero du bien a afficher : ");
                                    Scanner sc5 = new Scanner (System.in);
                                    int i5 = sc5.nextInt ();
                                    if((i5<=0)||(i5>ts0.size()))
                                    {
                                    	System.out.println("Veuillez introduire un nombre valide");
                                    	break;
                                    }
                                    Iterator<Bien> it5 = ts0.iterator ();
                                    for (int j5 = 0; j5 < i5 - 1; j5++) {
                                        it5.next ();
                                    }
                                    it5.next ().afficher_sans_details ();
                                }break;
                                case 6:{
                                	System.out.println("Operation de recherche : ");
                                	Boolean b1 , b2 , b3 , b4 , b5 , b6 , b7 ,b11,b21,b35;
                                	b11 = false;
                                	b21=false;
                                	b35=false;
                                	System.out.println ("Voulez vous choisir le type de transction ? (true pour OUI , false pour NON)");
                                    Scanner scc1 = new Scanner (System.in);
                                    b1 = scc1.nextBoolean ();
                                    if(b1)
                                    {
                                    	String ll;
                                    	System.out.println ("Veillez introduire le type de transaction : ");
                                        Scanner scc11 = new Scanner (System.in);
                                        ll = scc11.nextLine ();
                                        val[0]=ll;
                                        System.out.println ("Voulez vous choisir le type de transction ? (true pour OUI , false pour NON)");
                                        Scanner sccc1 = new Scanner (System.in);
                                        b11 = sccc1.nextBoolean ();
                                        if(b11)
                                        {
                                        	String lcl = null;
                                        	System.out.println ("Veillez introduire le type de transaction : ");
                                            Scanner scc111 = new Scanner (System.in);
                                            lcl = scc111.nextLine ();
                                            val[8]=lcl;
                                    }
                                    }
                                    System.out.println ("Voulez vous choisir une wilaya ? (true pour OUI , false pour NON)");
                                    Scanner scc2 = new Scanner (System.in);
                                    b2 = scc2.nextBoolean ();
                                    if(b2)
                                    {
                                    	String lk;
                                    	System.out.println ("Veillez introduire la wilaya : ");
                                        Scanner scc22 = new Scanner (System.in);
                                        lk = scc22.nextLine ();
                                        val[1]=lk;
                                        System.out.println ("Voulez vous choisir une wilaya ? (true pour OUI , false pour NON)");
                                        Scanner sclc2 = new Scanner (System.in);
                                        b21 = sclc2.nextBoolean ();
                                        if(b21)
                                        {
                                        	String lks=null;
                                        	System.out.println ("Veillez introduire la wilaya : ");
                                            Scanner scc422 = new Scanner (System.in);
                                            lks = scc422.nextLine ();
                                            val[7]=lks;
                                    }
                                    }
                                    System.out.println ("Voulez vous introduire un prix max ? (true pour OUI , false pour NON)");
                                    Scanner scc3 = new Scanner (System.in);
                                    b3 = scc3.nextBoolean ();
                                    if(b3)
                                    {
                                    	String lk;
                                    	System.out.println ("Veillez introduire le prix max : ");
                                        Scanner scc32 = new Scanner (System.in);                                       
                                        lk = scc32.nextLine ();
                                        val[2]=lk;
                                    }
                                    System.out.println ("Voulez vous introduire un prix min ? (true pour OUI , false pour NON)");
                                    Scanner scc4 = new Scanner (System.in);
                                    b4 = scc4.nextBoolean ();
                                    if(b4)
                                    {
                                    	String lk;
                                    	System.out.println ("Veillez introduire le prix min : ");
                                        Scanner scc35 = new Scanner (System.in);
                                        lk = scc35.nextLine ();
                                        val[3]=lk;
                                    }
                                    System.out.println ("Voulez vous introduire le type du bien ? (true pour OUI , false pour NON)");
                                    Scanner scc5 = new Scanner (System.in);
                                    b5 = scc5.nextBoolean ();
                                    if(b5)
                                    {
                                    	String lk;
                                    	System.out.println ("Veillez introduire le type du bien : ");
                                        Scanner scc36 = new Scanner (System.in);
                                        lk = scc36.nextLine ();
                                        val[4]="class "+lk;
                                        System.out.println ("Voulez vous introduire le type du bien ? (true pour OUI , false pour NON)");
                                        Scanner sccc5 = new Scanner (System.in);
                                        b35 = sccc5.nextBoolean ();
                                        if(b35)
                                        {
                                        	String lkf=null;
                                        	System.out.println ("Veillez introduire le type du bien : ");
                                            Scanner sccc36 = new Scanner (System.in);
                                            lkf = sccc36.nextLine ();
                                            val[10]="class "+lkf;}
                                    }
                                    System.out.println ("Voulez vous introduire la superficie minimale  ? (true pour OUI , false pour NON)");
                                    Scanner scc6 = new Scanner (System.in);
                                    b6 = scc6.nextBoolean ();
                                    if(b6)
                                    {
                                    	String lk;
                                    	System.out.println ("Veillez introduire le superficie minimale : ");
                                        Scanner scc37 = new Scanner (System.in);
                                        lk = scc37.nextLine ();
                                        val[5]=lk;
                                    }
                                    System.out.println ("Voulez vous introduire le nombre minimal de pieces  ? (true pour OUI , false pour NON)");
                                    Scanner scc7 = new Scanner (System.in);
                                    b7 = scc7.nextBoolean ();
                                    if(b7)
                                    {
                                    	String lk;
                                    	System.out.println ("Veillez introduire le nombre minimal de pieces : ");
                                        Scanner scc38 = new Scanner (System.in);
                                        lk = scc38.nextLine ();
                                        val[6]=lk;
                                    }
                                   
                                   
                                    
                                    
                                	imoesi.recherche(ts0,val ,b1,b2,b3,b4,b5,b6,b7,b11,b21,b35);
                                	
                            }break;
                                case 7 : {//afficher les prix finaux des biens
                                    

                                    Iterator<Bien> it8 = ts0.iterator ();
                                    for (int i8 = 0; i8 < ts0.size() ; i8++) {
                                   	 System.out.println();
                                   	 Bien bien= it8.next();
                                   	 Bien.Transaction transaction = bien.getTransaction();
                                   	 int i9 = i8+1;
                                        switch (transaction) {
                                            case VENTE: System.out.println("Le prix du bien "+ i9 +" : "+"de type : "+bien.getClass().getSimpleName() +" "+ (long)bien.calculer_prix_vente_final(bien.getWilaya ())+" DA "+"Le prorietaire est : "+bien.getProprietaire().getNom()+" "+bien.getProprietaire().getPrenom() +"Ajouté le " + bien.getDate());break;
                                            case LOCATION :System.out.println("Le prix du bien "+i9 +" de type :  "+bien.getClass().getSimpleName()+ " : " +(long)bien.calculer_prix_location_final(bien.getWilaya ())+" DA "+"Le prorietaire est : "+bien.getProprietaire().getNom()+" "+bien.getProprietaire().getPrenom() +"Ajouté le " + bien.getDate()) ;break;
                                            case ECHANGE : System.out.print("Le prix du bien "+i9 + " de type :  "+bien.getClass().getSimpleName() +" (echange dans la meme wilaya) : " +(long)bien.calculer_prix_echange_final(bien.getWilaya (),bien.getWilaya ())+" DA"+" , "); System.out.println("(echange dans une autre wilaya) : " +(long)bien.calculer_prix_echange_final(bien.getWilaya (),wilaya0)+" DA "+"Le prorietaire est : "+bien.getProprietaire().getNom()+" "+bien.getProprietaire().getPrenom() +"Ajouté le " + bien.getDate());break;
                                     
                                   	 
                                    } 
                                    
                                     
                               	}
                              
                               }
                               break;
                            } 
                            System.out.println ("Voulez vous continuer ? (true pour OUI , false pour NON)");
                            Scanner sc_continu2 = new Scanner (System.in);
                            continu2 = sc_continu2.nextBoolean ();
                        }
                    }
                }
                System.out.println ("Voulez vous continuer vers le menu principal ? (true pour OUI , false pour NON)");
                Scanner sc_continu_principal = new Scanner (System.in);
                continu_principal = sc_continu_principal.nextBoolean ();
                
                  	
            }
        }
        	catch(java.util.InputMismatchException exeption)
        	{
        		System.out.println("Choix invalide!!");
        	}}}
    }
        public static void envoyer_msg ( String msg, String client, String[][]message,int i)
        {

            message[i][0] = client;
            message[i][1] = msg;
        }

}
