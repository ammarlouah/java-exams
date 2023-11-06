public class Coupe {
    private int max;
    Equipe table[];
    private int nbe;
    
    public Coupe(int max) {
        this.max = max;
    }

    public boolean ajouteEquipe(Equipe eq){
        if(nbe == max) return false;

        return true;
    }

    public void afficher(Equipe[] tab,int d){
        for(int i=0;i<nbe;i++){
            table[i].affichage();
        }
    }

    public void triGrp(int idDeb,int idFin){
        Equipe temp;
        int dif1,dif2;
        for(int i=idDeb;i<idFin;i++){
            temp = table[i];
            for(int j=i+1;j<=idFin;j++){
                if(table[i].getPts() < table[j].getPts()){
                    temp = table[i];
                    table[i]=table[j];
                    table[j]=temp;
                }else if(table[i].getPts() == table[j].getPts()){
                    dif1 = table[i].getMrq()-table[i].getRec();
                    dif2 = table[j].getMrq()-table[j].getRec();
                    if(dif1 < dif2){
                        temp = table[i];
                        table[i]=table[j];
                        table[j]=temp;
                    }
                }
            }
        }
    }

    void premTour(){
        for(int i=0;i<nbe;i+=4){
            triGrp(i, i+3);
        }
        afficher(table, nbe);
    }

    void deuxTour(){
        Equipe[] supp = new Equipe[nbe/2];
        int k=0;
        for(int i=0;i<nbe;i+=4){
            triGrp(i, i+3);
        }
        int i=0;
        while (i<nbe) {
            supp[k] = table[i+2];
            k++;
            supp[k] = table[i+3];
            k++;
            table[i+2]=table[i+4];
            table[i+3]=table[i+5];
            i+=2;
        }
        supp[k] = table[i+2];
        k++;
        supp[k] = table[i+3];
        k++;
        nbe-=2;
        afficher(supp, k);
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public Equipe[] getTable() {
        return table;
    }

    public void setTable(Equipe[] table) {
        this.table = table;
    }

    public int getNbe() {
        return nbe;
    }

    public void setNbe(int nbe) {
        this.nbe = nbe;
    }
}
