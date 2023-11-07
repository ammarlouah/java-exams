import java.io.*;
import java.util.*;
public class Personne {
    private String nom,prenom,cin;
    private int age;

    Personne(String n,String p,String c,int a){
        nom = n;
        prenom = p;
        cin = c;
        age = a;
    }

    static String clavier() throws IOException{
        try (Scanner cl = new Scanner(System.in)) {
            return cl.nextLine();
        }
    }
    
    public String toString(){
        String ch = "Nom: "+nom+"Prenom: "+prenom+"CIN: "+cin+"Age: "+age;
        return ch;
    }
    
    public String getCin() {
        return cin;
    }
    
    public String getPrenom() {
        return prenom;
    }
    
    public String getNom() {
        return nom;
    }
    
    public int getAge() {
        return age;
    }
}
