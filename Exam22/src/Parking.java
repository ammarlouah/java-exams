public class Parking {
    private Emplacement park[];
    private int max;
    private int nl;
    private int recettes[];

    Parking(int max,int nl){
        this.max = max;
        this.nl = nl;
        park = new Emplacement[this.max];
    }

    int rechercheLibre(){
        for(int i=0;i<park.length;i++ ){
            if(park[i].getEtat() == true){
                return i+1;
            }
        }
        return -1;
    }

    void accederParking(Vehicule v,Horaire acc){
        int index = rechercheLibre();
        if(index == -1){
            System.out.println("le parking est plein");
            return;
        }
        park[index-1] = new Emplacement(index);
        park[index-1].setVeh(v);
        park[index-1].setDeb(acc);
        park[index-1].setEta(false);
    }

    void quitterParking(Vehicule v,Horaire quit){
        for(int i=0;i<park.length;i++){
            if(park[i].getVeh().getMarq() == v.getMarq()){
                park[i].setEta(true);
                System.out.println("les frais = " + park[i].fraisStationnement(quit));
                return;
            }
        }
    }

    
}
