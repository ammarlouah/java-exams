public class Vaccin {
    private String type;
    private int nbj;
    Vaccin(String ty,int nb){
        type = ty;
        nbj = nb;
    }

    public String toString(){
        String ch = "Type: "+type+"Periode entre les deux doses: "+nbj;
        return ch;
    }

    String getType(){
        return type;
    }

    int getNbj(){
        return nbj;
    }

}
