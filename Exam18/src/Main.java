import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        Medicament med1 = new Medicament(1);
        med1.lecture();
        med1.affichage();
        Medicament med2 = new Medicament(1);
        med2.lecture();
        med2.affichage();
        Pharmacie ph = new Pharmacie(5, 2);
        ph.ajouteMedicament(med1);
        ph.ajouteMedicament(med2);
        ph.afficher(ph.getTable(),ph.getNbe());
    }
}
