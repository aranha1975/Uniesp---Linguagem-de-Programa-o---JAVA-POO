public class Cachorro extends Animal{

    public Cachorro(String nome) {
        super(nome);
    }

        public Cachorro() {
        super();
    }

    public void late() {
        System.out.println("O cachorro "+getNome()+" da Raça "+getRaca()+" está latindo.");
    }
}
