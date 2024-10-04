public class Aluno {

    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private double media;
    private String situacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void calcular_media() {

        this.media = (this.nota1 + this.nota2 + this.nota3) / 3;
    }

    public void verificar_aprovacao() {

        if (this.media >= 7) {
            situacao = "APROVADO";
        } else if (this.media < 4) {
            situacao = "REPROVADO";
        }else {
            situacao = "NA FINAL";

        }
    }
    public void DetalhesAluno() {
        System.out.println("O aluno "+this.nome+" tirou "+this.nota1+ " na primeira nota, "+this.nota2+" na segunda nota e "+this.nota3+" na terceira nota.");
        System.out.println("A média do aluno " + this.nome + " é " + this.media);
        System.out.println(this.nome + " está " + this.situacao + "!");
    }


}
