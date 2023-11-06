public class Vehicule {
    private String mat;
    private String marq;
    private String typ;

    Vehicule(String mt,String mr,String tp){
        mat = mt;
        marq = mr;
        typ = tp;
    }

    public String toString(){
        String ch = "Matricule: " + mat + "Marque" + marq + "Type: " + typ;
        return ch;
    }

    String getType(){
        return typ;
    }

    String getMarq(){
        return marq;
    }

    String getMat(){
        return mat;
    }

}
