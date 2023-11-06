public class Main {
    public static void main(String[] args) throws Exception {
        Candidat c1,c2;
        Concours cn1;
        c1 = new Candidat("louah", "ammar", "11");
        c2 = new Candidat("essaoudi", "oussama", "22");

        cn1 = new Concours(2);

        c1.lire();
        c2.lire();

        if(!cn1.ajouteCandidat(c1)) System.out.println("tableau plein");
        if(!cn1.ajouteCandidat(c2)) System.out.println("tableau plein");

        cn1.afficher(cn1.getTable(),cn1.getNbe());
    }
}
