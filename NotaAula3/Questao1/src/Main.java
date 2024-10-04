import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputtexto = new Scanner(System.in);
        Gerente g1 = new Gerente();
        Programador p1 = new Programador();

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("Digite o nome do Gerente: ");
        g1.setNome(input.nextLine());
        System.out.print("Digite o ano de nascimento: ");
        g1.setNasc(input.nextInt());
        System.out.print("Digite o salário: ");
        g1.setSalario(input.nextDouble());
        System.out.print("Digite o nome do Projeto que o gerente está trabalhando: ");
        g1.setProjeto(inputtexto.nextLine());


        System.out.println("--------------------------------------------------------------------------");
        System.out.print("Digite o nome do Programador: ");
        p1.setNome(inputtexto.nextLine());
        System.out.print("Digite o ano de nascimento: ");
        p1.setNasc(input.nextInt());
        System.out.print("Digite o salário: ");
        p1.setSalario(input.nextDouble());
        System.out.print("Digite o nome da liguagem de programação usada: ");
        p1.setLinguagem(inputtexto.nextLine());

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-= INDFORMAÇÕES SOBRE O GERENTE =-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(g1.getNome()+" tem "+g1.calcularIdade()+" anos e está trabalhando com o projeto "+g1.getProjeto());
        g1.informarSalario();


        System.out.println("--------------------------------------------------------------------------");
        System.out.println("-=-=-=-=-=-=-=-=-=-= INDFORMAÇÕES SOBRE O PROGRAMADOR =-=-=-=-=-=-=-=-=-=-");
        System.out.println(p1.getNome()+" tem "+p1.calcularIdade()+" anos e é especialista em liguagem "+p1.getLinguagem());
        p1.informarSalario();

    }
}