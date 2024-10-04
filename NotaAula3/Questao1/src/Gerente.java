public class Gerente extends Funcionario{
    private String projeto;

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public String informarProjeto() {
        return this.projeto;

    }
}
