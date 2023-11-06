import java.util.*;
public class Equipe {
    private char gr;
    private String sym;
    private String nom;
    private Personne ent;
    private int pts;
    private int mrq;
    private int rec;
    private int nbj;
    Joueur eqp[];
    
    public Equipe(String sym) {
        this.sym = sym;
    }

    static String clavier(){
        Scanner clav = new Scanner(System.in);
        return clav.nextLine();
    }

    public void lecture(){
        String nomE,prenomE,cinE,pos;
        int annee,mois,jours,pds;
        Date naissE;
        System.out.println("Veuillez saisir les informations suivants : ");
        System.out.println("groupe : ");
        gr = clavier().charAt(0);
        System.out.println("Nom : ");
        nom = clavier();
        System.out.println("les informations de l'entraineur de l'equipe : ");
            System.out.println("\t nom : ");
            nomE = clavier();
            System.out.println("\t prenom : ");
            prenomE = clavier();
            System.out.println("\t cin : ");
            cinE = clavier();
            System.out.println("\t date de naissance yyyy/mm/dd: ");
            System.out.println("\t annee : ");
            annee = Integer.parseInt(clavier());
            System.out.println("\t mois : ");
            mois = Integer.parseInt(clavier());
            System.out.println("\t jours : ");
            jours = Integer.parseInt(clavier());
            naissE = new Date(annee,mois,jours);
            ent = new Personne(nomE, prenomE, cinE,naissE);
        System.out.println("Le nombre de points : ");
        pts = Integer.parseInt(clavier());
        System.out.println("Le nombre de buts marques : ");
        mrq = Integer.parseInt(clavier());
        System.out.println("Le nombre de buts recus : ");
        rec = Integer.parseInt(clavier());
        System.out.println("Le nombre de joueurs de l'equipe : ");
        nbj = Integer.parseInt(clavier());
        eqp = new Joueur[nbj];
        for(int i=0;i<nbj;i++){
            System.out.println("Veuillez saisir les infos de joueur "+(i+1)+" : ");
            System.out.println("\t nom : ");
            nomE = clavier();
            System.out.println("\t prenom : ");
            prenomE = clavier();
            System.out.println("\t cin : ");
            cinE = clavier();
            System.out.println("\t date de naissance yyyy/mm/dd: ");
            System.out.println("\t annee : ");
            annee = Integer.parseInt(clavier());
            System.out.println("\t mois : ");
            mois = Integer.parseInt(clavier());
            System.out.println("\t jours : ");
            jours = Integer.parseInt(clavier());
            naissE = new Date(annee,mois,jours);
            System.out.println("\t Poids : ");
            pds = Integer.parseInt(clavier());
            System.out.println("\t Position : ");
            pos = clavier();
            eqp[i] = new Joueur(nomE, prenomE, cinE, naissE, pds, pos);
        }
    }

    public void affichage(){
        System.out.println("Groupe : "+gr);
        System.out.println("Symbole : "+sym);
        System.out.println("Nom : "+nom);
        System.out.println("L'entraineur : "+ent.toString());
        System.out.println("Nombre de points : "+pts);
        System.out.println("Nombre de buts marque : "+mrq);
        System.out.println("Nombre de buts recus : "+rec);
        System.out.println("Nomber de joueur de l'equipe : "+gr);
        for(int i=0;i<nbj;i++){
            System.out.println("Joueur"+(i+1)+" : "+eqp[i].toString());
        }
    }
}
