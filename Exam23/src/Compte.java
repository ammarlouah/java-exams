import java.io.*;
import java.util.*;

public class Compte {
    private int cne;
    
    private String nm;
    private String pr;
    private String login;
    private String pwd;
    
    public int getCne() {
        return cne;
    }
    public String getLogin() {
        return login;
    }
    public String getPwd() {
        return pwd;
    }

    Compte(int cne){
        this.cne = cne;
    }

    public void creerCompte() throws IOException{
        Scanner clav = new Scanner(System.in);
        String ch;
        System.out.println("Veuillez saisir les information suivantes : ");
        System.out.println("Nom d'etudiant: ");
        ch = clav.nextLine();
        this.nm = ch;
        System.out.println("Prenom d'etudiant: ");
        ch = clav.nextLine();
        this.pr = ch;
        System.out.println("Nom d'utilisateur: ");
        ch = clav.nextLine();
        this.nm = ch;
        System.out.println("Mot de passe: ");
        ch = clav.nextLine();
        this.nm = chiffrer(ch,3);
    }

    public String toString(){
        String ch = "cne = "+this.cne+" nom = "+this.nm+" prenom = "+this.pr+" username = "+this.login+" mot de passe = "+this.pwd;
        return ch;
    }

    public String chiffrer(String pass,int pas){
        char[] arrch1 = new char[26];
        char temp;
        String ch1;
        arrch1 = pass.toCharArray();
        
        return "";
    }
}
