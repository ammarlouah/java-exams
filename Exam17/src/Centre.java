import java.io.*;

public class Centre {
    private int max;
    private Vehicule table[];
    private int nbe;

    public Centre(int max, int nbe) {
        this.max = max;
        this.nbe = nbe;
        table = new Vehicule[max];
    }

    public int recherchevehicule(String[] im){
        for(int i=0;i<nbe;i++){
            if(table[i].getMat().equals(im)){
                return i;
            }
        }
        return -1; 
    }

    public boolean ajoutevehicule(Vehicule v){
        int i = recherchevehicule(v.getMat());
        if(i != -1){
            table[i].setNom(v.getNom());
            table[i].setCin(v.getCin());
            return true;
        }
        if(nbe == max) return false;
        table[nbe] = v;
        nbe++;
        return true;
    }

    public void afficher(Vehicule[] A,int d){
        System.out.println("Affichage des vehicules.");
        for(int i=0;i<d;i++){
            System.out.println("Vehicule "+(i+1)+ " : ");
            System.out.println(A[i].toString());
        }
    }

    public float fiscale_prix(){
        float som = 0;
        for(int i=0;i<nbe;i++){
            int pf = table[i].getFiscal();
            float prix;
            if(table[i].getCarb().equals("Essence")){
                if(pf < 8) prix = 350;
                else if(pf>=8 && pf<=10) prix = 650;
                else if(pf>=11 && pf<=14) prix = 3000;
                else prix = 8000;
            }
            else{
                if(pf < 8) prix = 700;
                else if(pf>=8 && pf<=10) prix = 1500;
                else if(pf>=11 && pf<=14) prix = 6000;
                else prix = 20000;
            }
            som+=prix;
        }
        return som;
    }

    public boolean testSupp(Vehicule v){
        int annee,mois,jours,som,ref;
        jours = v.getMod()[0];
        mois = v.getMod()[1];
        annee = v.getMod()[2];
        som = jours + mois*30 + annee *365;
        ref = 21 + 11*30 + 2016*365;
        if((ref-som) > 20*365) return true;
        return false;
    } 

    public Vehicule[] supprime_vehicules(){
        Vehicule[] supp = new Vehicule[nbe];
        int index=0;
        for(int i=0;i<nbe-1;i++){
            if(testSupp(table[i])){
                supp[index] = table[i];
                index++;
                for(int j=i;j<nbe;j++){
                    table[j]=table[j+1];
                }
                nbe--;
            }
        }
        if(testSupp(table[nbe])) nbe--;
        return supp;
    }

    public int fichier_vehicule(String[] im) throws IOException{
        int index = recherchevehicule(im);
        if(index == -1) return 0;
        Vehicule v = table[index];
        File fichier = new File("Vehicule.txt");
        FileWriter ecr = new FileWriter(fichier);
        ecr.write(v.toString());
        ecr.close();
        return 1;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public Vehicule[] getTable() {
        return table;
    }

    public void setTable(Vehicule[] table) {
        this.table = table;
    }

    public int getNbe() {
        return nbe;
    }

    public void setNbe(int nbe) {
        this.nbe = nbe;
    }
}
