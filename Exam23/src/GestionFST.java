import java.util.*;
import java.io.*;

public class GestionFST {
    private int max;
    private List<Compte> GCompte;
    private List<Etudiant> GEtud;

    GestionFST(int max){
        this.max = max;
    }

    public boolean ajouterCompte(Compte c){
        if(GCompte.size() >= this.max){
            return false;
        }
        GCompte.add(c);
        return true;
    }

    boolean ajouterEtud(Etudiant e){
        if(GEtud.size() >= max){
            return false;
        }
        GEtud.add(e);
        return true;
    }

    int rechercheEtud(String usr,String pass){
        ListIterator<Compte> iterator = GCompte.listIterator();
        while (iterator.hasNext()) {
            Compte cmp = iterator.next();
            if(cmp.getLogin() == usr && cmp.getPwd() == pass ){
                return cmp.getCne();
            }
            iterator.next();
        }
        return -1;
    }

    public void relevNotes(String usr,String pass) throws IOException{
        int cne = rechercheEtud(usr, pass);
        int i = -1;
        Etudiant etd;
        boolean test = false;
        if(cne == -1){
            System.out.println("Etudiant introuvable");
            return;
        }

        ListIterator<Etudiant> iterator = GEtud.listIterator();
        while (iterator.hasNext()) {
            etd = iterator.next();
            if(etd.getCne() == cne ){
                i = GEtud.indexOf(etd);
                break;
            }
            iterator.next();
        }

        etd = GEtud.get(i);

        if(!etd.validSemestre()){
            System.out.println("l'etudiant na pas valide tous les semestres");
            return;
        }

        File fich = new File("etudiant.txt");
        FileWriter ecr = new FileWriter(fich);
        ecr.write(etd.toString());
        ecr.close();
    }

}
