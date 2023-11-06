import java.io.*;
import java.util.*;

public class Vehicule {
    private String nom;
    private String cin;
    private String marque;
    private int[] mod = new int[3];
    private String carb;
    private String etat;
    private int fiscal;
    private String mat[] = new String[3];
    
    public Vehicule(String[] mat) {
        this.mat = mat;
    }

    static String clavier(){
        Scanner clav = new Scanner(System.in);
        String ch = clav.nextLine();
        clav.close();
        return ch;
    }

    public void lecture() throws IOException{
        System.out.println("Veuillez saisir les informations suivantes : ");
        System.out.println("nom : ");
        nom = clavier();
        System.out.println("cin : ");
        cin = clavier();
        System.out.println("marque : ");
        marque = clavier();

        System.out.println("model : ");
        System.out.println("\t jours : ");
        mod[0] = Integer.parseInt(clavier());
        System.out.println("\t mois : ");
        mod[1] = Integer.parseInt(clavier());
        System.out.println("\t annee : ");
        mod[2] = Integer.parseInt(clavier());
        
        System.out.println("carburant : ");
        carb = clavier();
        System.out.println("etat : ");
        etat = clavier();
        System.out.println("fiscal : ");
        fiscal = Integer.parseInt(clavier());
    }

    public String toString(){
        return "nom : " +nom+" | " + "cin : "+cin+" | " + "marque : "+marque+" | " + "model : "+mod[0]+"-"+mod[1]+"-"+mod[2]+" | " + "carburant : "+carb+" | " + "etat : "+etat+" | " + "fiscal : "+fiscal+" | " + "matricule : "+mat[0]+"-"+mat[1]+"-"+mat[2];
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int[] getMod() {
        return mod;
    }

    public void setMod(int[] mod) {
        this.mod = mod;
    }

    public String getCarb() {
        return carb;
    }

    public void setCarb(String carb) {
        this.carb = carb;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public int getFiscal() {
        return fiscal;
    }

    public void setFiscal(int fiscal) {
        this.fiscal = fiscal;
    }

    public String[] getMat() {
        return mat;
    }

    public void setMat(String[] mat) {
        this.mat = mat;
    }
}
