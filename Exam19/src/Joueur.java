import java.util.*;
public class Joueur extends Personne{
    private String nom;
    private String prenom;
    private String cin;
    private Date naissance;
    private double pds;
    private String pos;
    
    public Joueur(String nom, String prenom, String cin, Date naissance,double pds, String pos) {
        super(nom, prenom, cin, naissance);
        this.pds = pds;
        this.pos = pos;
    }

    public String toString(){
        String ch = super.toString() + " poids : "+pds+" position : " + pos;
        return ch;
    }
}
