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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public Date getNaissance() {
        return naissance;
    }

    public void setNaissance(Date naissance) {
        this.naissance = naissance;
    }

    public double getPds() {
        return pds;
    }

    public void setPds(double pds) {
        this.pds = pds;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }
}
