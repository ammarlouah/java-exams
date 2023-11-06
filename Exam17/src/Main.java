public class Main {
    public static void main(String[] args) throws Exception {
        String[] mat = {"1234","A","61"};
        Vehicule v1 = new Vehicule(mat);
        v1.lecture();
        System.out.println(v1.toString());
    }
}
