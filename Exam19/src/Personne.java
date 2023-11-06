import java.util.*;
public class Personne{
    private String nom, prenom, cin, fonction;
    Date naissance;
    Personne(String n,String p,String c,Date d,String f){
        nom=n;
        prenom=p;
        cin=c;
        naissance=d;
    }
    public String toString(){
        String ch=" Nom: "+nom+" Prénom: "+prenom+" CIN: "+cin+" Date de naissance: "+naissance+" Fonction: "+fonction; return ch;
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
    public String getFonction() {
        return fonction;
    }
    public void setFonction(String fonction) {
        this.fonction = fonction;
    }
    public Date getNaissance() {
        return naissance;
    }
    public void setNaissance(Date naissance) {
        this.naissance = naissance;
    }
}