public class GestionVac {
    private int max;
    private CitoyenVac tab[];
    private int nb;
    
    public GestionVac(int max) {
        this.max = max;
        tab = new CitoyenVac[this.max];
        this.nb = 0 ;
    }

    boolean ajouteCitoyen(CitoyenVac cit){
        if(this.nb == max) return false;
        tab[this.nb] = cit;
        this.nb++;
        return true;
    }

    public void afficher(CitoyenVac[] t,int d){
        for(int i=0;i<d;i++){
            System.out.println("Citoyen "+(i+1)+" :");
            System.out.println(t[i].toString());
        }
    }

    public int TypeVac(String typ){
        int count = 0;
        for(int i=0;i<this.nb;i++){
            if(this.tab[i].getVac().getType() == typ){
                count ++;
            }
        }
        return count;
    }

    public CitoyenVac[] CitoyenVacTyp(String typ){

        if(TypeVac(typ) == 0) return null;

        CitoyenVac[] cit = new CitoyenVac[TypeVac(typ)];
        int k=0;

        for(int i=0;i<this.nb;i++){
            if(this.tab[i].getVac().getType() == typ){
                cit[k] = this.tab[i];
                k++;
            }
        }
        return cit;
    }

    
}
