public class Diplome {
    private String type;
    private String specialite;
    private int annee;
    private double note;

    public Diplome(String type, String specialite, int annee, double note) {
        this.type = type;
        this.specialite = specialite;
        this.annee = annee;
        this.note = note;
    }

    public String toString(){
        String ch="Type: "+type+"Specialite: "+specialite+"Annee: "+annee+"Note: "+note;
        return ch;
    }

    public String getType() {
        return type;
    }

    public String getSpecialite() {
        return specialite;
    }

    public int getAnnee() {
        return annee;
    }

    public double getNote() {
        return note;
    }

}
