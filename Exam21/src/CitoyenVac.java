import java.io.IOException;

public class CitoyenVac extends Personne{
    private String nom,prenom,cin;
    private int age;
    private Vaccin vac;
    
    private DateVac prem;
    
    CitoyenVac(String nom, String prenom, String cin, int age) {
        super(nom, prenom, cin, age);
    }
    
    public void lire() throws IOException{
        String type;
        int nbj,annee,mois,jours;
        System.out.println("entrer le type de vaccin: ");
        type = clavier();
        System.out.println("entrer le nombre de jours entre les deux doses: ");
        nbj = Integer.parseInt(super.clavier());
        this.vac = new Vaccin(type, nbj);
        System.out.println("entrer la date de vaccin : ");
        System.out.println("Annee");
        annee = Integer.parseInt(clavier());
        System.out.println("Mois");
        mois = Integer.parseInt(clavier());
        System.out.println("Jour");
        jours = Integer.parseInt(clavier());
        this.prem = new DateVac(jours, mois, annee);
    }
    
    public String toString(){
        return super.toString() + vac.toString() + prem.toString();
    }
    
    public Vaccin getVac() {
        return vac;
    }
    
}
