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
}