public class Horaire {
    private int heur;
    private int minu;

    Horaire(int h,int m){
        heur = h;
        minu = m;
    }

    public String toString(){
        String ch = "+heur+" + heur + minu + "Minutes";
        return ch;
    }

    int getHeur(){
        return heur;
    }

    int getMinu(){
        return minu;
    }
}
