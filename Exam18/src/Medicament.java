import java.io.*;
import java.util.*;
public class Medicament {
    private int code;
    private String nom;
    private double prix;
    private String type;
    private int nb;
    private String comp[];
    private String pat;
    private int quan;
    
    public Medicament(int code) {
        this.code = code;
    }

    static String clavier() throws IOException{
        try (Scanner clav = new Scanner(System.in)) {
            return clav.nextLine();
        }
    }

    public void lecture() throws IOException{
        System.out.println("Veuillez saisir les informations suivants");
        System.out.println("nom : ");
        this.nom = clavier();
        System.out.println("prix : ");
        this.prix = Double.parseDouble(clavier());
        System.out.println("type : ");
        this.type = clavier();
        System.out.println("nombre de produits : ");
        this.nb = Integer.parseInt(clavier());
        this.comp = new String[this.nb];
        System.out.println("Les produits constituant le medicament : ");
        for(int i=0;i<this.nb;i++){
            System.out.println("Produit "+(i+1)+" : ");
            comp[i] = clavier();
        }
        System.out.println("le patient : ");
        this.pat = clavier();
        System.out.println("quantite : ");
        this.quan = Integer.parseInt(clavier());
    }

    public void affichage(){
        System.out.println("code : "+code);
        System.out.println("nom : "+nom);
        System.out.println("prix : "+prix);
        System.out.println("type : "+type);
        System.out.println("nombre de produits : "+nb);
        System.out.println("les produits constituant le medicament : ");
        for(int i=0;i<nb;i++){
            System.out.println("Produit "+(i+1)+" : "+comp[i]);
        }
        System.out.println("Patient : "+pat);
        System.out.println("quantite : "+quan);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNb() {
        return nb;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }

    public String[] getComp() {
        return comp;
    }

    public void setComp(String[] comp) {
        this.comp = comp;
    }

    public String getPat() {
        return pat;
    }

    public void setPat(String pat) {
        this.pat = pat;
    }

    public int getQuan() {
        return quan;
    }

    public void setQuan(int quan) {
        this.quan = quan;
    }
}
