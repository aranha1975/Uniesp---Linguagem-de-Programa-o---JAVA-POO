public class Main {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("Toby");
        Cachorro c2 = new Cachorro("Hercules");
        Cachorro c3 = new Cachorro();
        Gato g1 = new Gato("Cruel");
        Gato g2 = new Gato("Lumumba");
        Gato g3 = new Gato();

        c1.setRaca("Bulldog");
        c2.setRaca("Pastor Alemão");
        c3.setNome("Totó");
        c3.setRaca("Poodle");
        g1.setRaca("Angorá");
        g2.setRaca("Siamês");
        g3.setNome("Mingau");
        g3.setRaca("Persa");

        c1.late();
        c2.late();
        c3.late();

        g1.mia();
        g2.mia();
        g3.mia();

        c1.caminha();
        g3.caminha();
    }

}