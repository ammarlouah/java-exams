public class Main {
    public static void main(String[] args) throws Exception {
        String[] mat = {"1234","A","61"};
        Vehicule v1 = new Vehicule(mat);
        v1.lecture();
        System.out.println(v1.toString());

        Centre cen = new Centre(10,0);
        boolean test = cen.ajoutevehicule(v1);
        if(test) System.out.println("ajout avec succee");
        else System.out.println("echec d'ajout");
        cen.afficher(cen.getTable(), cen.getNbe());
    }
}
