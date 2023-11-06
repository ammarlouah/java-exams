import java.io.*;
import java.util.*;
public class Etudiant {
    private int cne;
    public int getCne() {
        return cne;
    }

    private String fil;
    private double[] notes = new double[6];
    
    public double[] getNotes() {
        return notes;
    }

    Etudiant(int cne,String fil){
        this.cne=cne;
        this.fil=fil;
    }

    public String clavier() throws IOException{
        Scanner clav = new Scanner(System.in);
        String ch = clav.nextLine();
        return ch;
    }

    public void saisirNotes() throws IOException{
        String note;
        for(int i=0 ; i<6 ; i++){
            System.out.println("Entrer la note de semestre " + (i+1) + " :");
            note = clavier();
            notes[i] = Double.parseDouble(note);
        }
    }

    public String toString(){
        String ch = "la filiere = " + this.fil;
        for(int i=0;i<6;i++){
            ch += " | semestre "+ (i+1) + " = " + notes[i]; 
        }
        return ch;
    }

    public boolean validSemestre(){
        for(int i=0;i<6;i++){
            if(notes[i] < 10) return false;
        }
        return true;
    }
}
