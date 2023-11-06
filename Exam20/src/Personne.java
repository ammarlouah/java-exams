import java.io.*;
import java.util.*;

public class Personne {
    
    private String nom,prenom,cin;
    
    public Personne(String nom, String prenom, String cin) {
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
    }

    static String clavier() throws IOException{
        Scanner cl = new Scanner(System.in);
        return cl.nextLine();
    }

    public String toString(){
        String ch="Nom: "+nom+"Prenom: "+prenom+"CIN: "+cin;
        return ch;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getCin() {
        return cin;
    }

}
