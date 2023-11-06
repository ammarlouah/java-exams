public class Main {
    public static void main(String[] args) throws Exception {
        Equipe mar = new Equipe("MAR");
        mar.lecture();
        Coupe wc = new Coupe(32);
        boolean test = wc.ajouteEquipe(mar);
        if(!test) System.out.println("le tablau est plein");
        wc.afficher(wc.getTable(), wc.getNbe());
    }
}
