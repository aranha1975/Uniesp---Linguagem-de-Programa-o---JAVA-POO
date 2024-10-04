import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Aluno aluno1 = new Aluno();
        Scanner input = new Scanner(System.in);
        Scanner inputText = new Scanner((System.in));

        System.out.print("Digite o nome do aluno: ");
        aluno1.setNome(inputText.next());
        System.out.print("Digite a primeira nota: ");
        aluno1.setNota1(input.nextDouble());
        System.out.print("Digite a segunda nota: ");
        aluno1.setNota2(input.nextDouble());
        System.out.print("Digite a terceira nota: ");
        aluno1.setNota3(input.nextDouble());


        aluno1.calcular_media();
        aluno1.verificar_aprovacao();
        aluno1.DetalhesAluno();



    }

}
