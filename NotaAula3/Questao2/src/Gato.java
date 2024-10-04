public class Gato extends Animal{

    public Gato(String nome) {
        super(nome);

    }

    public Gato() {
        super();
    }

    public void mia() {
        System.out.println("O gato "+getNome()+" da raça "+getRaca()+" está miando.");


    }
}
