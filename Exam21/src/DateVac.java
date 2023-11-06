public class DateVac {
    private int jours,mois,annee;

    
    DateVac(int j,int m,int a){
        jours = j;
        mois = m;
        annee = a;
    }
    
    public int getJours() {
        return jours;
    }

    public int getMois() {
        return mois;
    }

    public int getAnnee() {
        return annee;
    }

    public String toString(){
        return(""+jours+" "+mois+" "+annee);
    }
}
