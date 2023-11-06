public class Concours {
    private int max;
    Candidat table[];
    private int nbe;
    
    public Concours(int max) {
        this.max = max;
        table = new Candidat[this.max];
        this.nbe = 0;
    }
    
    public Candidat[] getTable() {
        return table;
    }
    public int getNbe() {
        return nbe;
    }
    boolean ajouteCandidat(Candidat can){
        if(nbe >= max) return false;
        table[nbe] = can;
        nbe++;
        return true;
    }

    public void afficher(Candidat[] tab,int d){
        for(int i=0;i<d;i++){
            System.out.println("Candidat "+(i+1)+" : "+tab[i].toString());
        }
    }

    public int NoteCandidat(Candidat can){
        int bac = 0,tc = 0,bar = 0;
        double noteBac,noteTc;
        noteBac = can.getBac().getNote();
        noteTc = can.getBac().getNote();

        if(noteBac < 10) bac = 0;
        if(noteBac >= 10 && noteBac < 12) bac = 1;
        else if(noteBac >= 12 && noteBac < 14) bac = 2;
        else if(noteBac >= 14 && noteBac < 16) bac = 3;
        else if(noteBac >= 16) bac = 4;

        if(noteTc < 10) tc = 0;
        else if(noteTc >= 10 && noteTc < 12) tc = 1;
        else if(noteTc >= 12 && noteTc < 14) tc = 2;
        else if(noteTc >= 14 && noteTc < 16) tc = 3;
        else if(noteTc >= 16) tc = 4;

        bar = bac + tc;
        return bar;
    }

    int[] NotationCandidats(){
        int[] notations = new int[nbe];
        for(int i=0;i<nbe;i++){
            notations[i] = NoteCandidat(table[i]);
        }
        return notations;
    }

    public void suppression(){

        for(int i=0;i<nbe;i++){
            if( (table[i].bac.getSpecialite() != "science mathematiques" && table[i].bac.getSpecialite() != "science experimentales") || !(table[i].tc.getSpecialite().contains("informatique"))){
                if(i == nbe-1) nbe--;
                else{
                    for(int j=i;j<nbe;j++){
                        table[j] = table[j+1];
                    }
                    nbe--;
                }
            }
        }
    }

    public void ordreMerite(){
        suppression();
        int[] notCan = NotationCandidats();
        Candidat tempC;
        int tempN;
        for(int i=0;i<nbe-1;i++){
            tempC = table[i];
            tempN = notCan[i];
            for(int j=i+1;i<nbe;j++){
                if(notCan[j] > notCan[i]){
                    tempC = table[i];
                    table[i] = table[j];
                    table[j] = tempC;

                    tempN = notCan[i];
                    notCan[i] = notCan[j];
                    notCan[j] = tempN;
                }
            }
        }

        System.out.println("Affichage des candidats par ordre merite.");

        for(int i=0 ; i<nbe ; i++){
            System.out.println("Candidate : " + table[i].toString() + " Notation : " + notCan[i]);
        }

    }
}
