public class Funcionario {
    protected String nome;
    protected int nasc;
    protected double salario;
    protected  int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNasc() {
        return nasc;
    }

    public void setNasc(int nasc) {
        this.nasc = nasc;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void informarSalario() {

        System.out.printf("O salário de %s é de R$ %.2f%n", this.getNome(), this.getSalario());
    }

    public int calcularIdade() {
        idade = (2024 - this.getNasc());
        return idade;
    }
}
