import java.io.*;

public class Candidat extends Personne{
    // private String nom,prenom,cin;
    Diplome bac,tc;
    
    public Candidat(String nom, String prenom, String cin) {
        super(nom, prenom, cin);
    }

    public void lire() throws IOException{
        System.out.println("entrer les info de baccalaureat : ");
        System.out.println("entrer le type : ");
        String typ = Personne.clavier();
        System.out.println("entrer le specialite : ");
        String sp = Personne.clavier();
        System.out.println("entrer l annee : ");
        int an = Integer.parseInt(Personne.clavier());
        System.out.println("entrer la note : ");
        double note = Double.parseDouble(Personne.clavier());
        this.bac = new Diplome(typ, sp, an, note);
        System.out.println("entrer les info de diplome technicien specialise : ");
        System.out.println("entrer le type : ");
        typ = Personne.clavier();
        System.out.println("entrer le specialite : ");
        sp = Personne.clavier();
        System.out.println("entrer l annee : ");
        an = Integer.parseInt(Personne.clavier());
        System.out.println("entrer la note : ");
        note = Double.parseDouble(Personne.clavier());
        this.tc = new Diplome(typ, sp, an, note);
    }

    public String toString(){
        return "Candidat : \n" + super.toString() + "\nBaccalaureat : \n" + bac.toString() + "\nDiplome TC: \n" + tc.toString();
    }

    public Diplome getBac() {
        return bac;
    }

    public Diplome getTc() {
        return tc;
    }
}
