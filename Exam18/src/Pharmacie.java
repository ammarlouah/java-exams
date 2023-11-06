import java.io.*;

public class Pharmacie {
    private int max;
    Medicament table[];
    private int nbe;
    
    public Pharmacie(int max, int nbe) {
        this.max = max;
        this.nbe = nbe;
        table = new Medicament[max];
    }

    public boolean ajouteMedicament(Medicament m){
        if(nbe == max) return false;
        for(int i=0;i<nbe;i++){
            if(table[i].getCode() == m.getCode()){
                table[i].setQuan(table[i].getQuan()+m.getQuan());
                table[i].setPrix(m.getPrix());
                return true;
            }
        }
        table[nbe] = m;
        return true;
    }

    public void afficher(Medicament[] ph,int d){
        System.out.println("Affichage des medicament : ");
        for(int i=0;i<d;i++){
            System.out.println("Medicament "+(i+1)+" : ");
            ph[i].affichage();
        }
    }
    
    public float total_prix(){
        float som = 0,prix;
        int tva;
        for(int i=0;i<nbe;i++){
            
            if(table[i].getType()=="Enfant"){
                tva = 5;
            }else if(table[i].getType()=="Adolescent"){
                tva = 7;
            }else{
                tva = 10;
            }
            
            prix = (float) table[i].getPrix();
            prix = prix + (prix*tva)/100;
            som+=prix;
        }
        return som;
    }

    Medicament[] supprime_Medicaments(String cpt){
        return null;
    }

    int fichier_vehicule(String ch) throws IOException{
        int i;
        Medicament m = new Medicament(0);
        File fichier = new File("Medicament.txt");
        for(i=0;i<nbe;i++){
            if(table[i].getNom().equals(ch)){
                m = table[i];
                break;
            }
        }
        if(i == nbe) return 0;
        FileWriter ecrivan = new FileWriter(fichier);
        ecrivan.write("Code : "+m.getCode()+"\n");
        ecrivan.write("Nom : "+m.getNom()+"\n");
        ecrivan.write("Type : "+m.getType()+"\n");
        ecrivan.write("Prix unitaire : "+m.getPrix()+"\n");
        ecrivan.write("Quantite : "+m.getQuan()+"\n");
        ecrivan.write("Composants : ");
        for(int j=0;j<m.getComp().length;j++){
            ecrivan.write(m.getComp()[j]);
        }
        ecrivan.write("Patient : "+m.getPat()+"\n");

        ecrivan.close();
        return 1;
    }

    public int getMax() {
        return max;
    }
    
    public Medicament[] getTable() {
        return table;
    }
    
    public int getNbe() {
        return nbe;
    }
}
