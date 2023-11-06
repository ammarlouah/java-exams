import java.io.*;

public class Emplacement {
    private int num;
    private boolean eta;
    
    public void setEta(boolean eta) {
        this.eta = eta;
    }

    private Horaire deb;
    private Vehicule veh;

    
    public void setVeh(Vehicule veh) {
        this.veh = veh;
    }

    public void setDeb(Horaire deb) {
        this.deb = deb;
    }

    Emplacement(int nm){
        num = nm;
        eta = true;
    }
    
    public Horaire getDeb() {
        return deb;
    }


    public Vehicule getVeh() {
        return veh;
    }

    public String clavier() throws IOException{
        String h;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        h = reader.readLine();
        return h;
    }

    public void stationner() throws IOException{
        String mat,marq,typ,heur,minu;
        System.out.println("Veuillez saisir les informations de Vehicule : ");

        System.out.println("Le matricule : ");
        mat = clavier();
        System.out.println("La marque : ");
        marq = clavier();
        System.out.println("Le type : ");
        typ = clavier();

        this.veh = new Vehicule(mat, marq, typ);

        System.out.println("Veuillez saisir les informations horaires : ");

        System.out.println("L'heur' : ");
        heur = clavier();
        System.out.println("Minutes' : ");
        minu = clavier();
        deb = new Horaire(Integer.parseInt(heur), Integer.parseInt(minu));

    }

    private Horaire dureeStationnement(Horaire fin){
        return new Horaire(12, 12);
    }

    int fraisStationnement(Horaire fin){
        int frais;
        Horaire hor = dureeStationnement(fin);
        int heur,minu;
        heur = hor.getHeur();
        minu = hor.getMinu();

        if(veh.getMarq()=="Moto"){
            if((heur == 1 && minu == 0) || (heur < 1)){
                frais = 10;
            }else if((heur > 1 || heur == 1 && minu > 0) && heur <=2 && minu == 0){
                frais = 10+5;
            }else{
                frais = 10+5+2;
            }
        }else{
            if((heur == 1 && minu == 0) || (heur < 1)){
                frais = 15;
            }else if((heur > 1 || heur == 1 && minu > 0) && heur <=2 && minu == 0){
                frais = 15+10;
            }else{
                frais = 15+10+5;
            }
        }
        return frais;
    }

    public int getNum(){
        return num;
    }

    public boolean getEtat(){
        return eta;
    }

    public String toString(){
        String ch = "numero d'emplacement :" + num + "\n" + "etat d'emplacement : " + eta + "\n" +"Vehiule : " + veh.toString() + "\n" + "heur de stationnement : " + deb.toString();
        return ch;
    }
}
