public class Animal {
    private String nome;
    private String raca;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }


    public Animal () {

    };

    public Animal(String nome){
        this.nome = nome;

    }

    public void caminha() {
        System.out.println(getNome()+" está caminhando.");
    }


}
