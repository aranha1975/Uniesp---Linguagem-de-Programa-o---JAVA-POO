import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Uber corrida1 = new Uber();

        System.out.print("Digite a distância percorrida em quilômetros: ");
        corrida1.setDistancia(input.nextDouble());
        System.out.print("Digite o tempo de espera em minutos: ");
        corrida1.setTempoEspera(input.nextInt());
        System.out.print("Digite a tarifa base: ");
        corrida1.setTarifaBase(input.nextDouble());
        System.out.print("Digite o fator de demanda R$(1.0 = normal, 1.5=pico): ");
        corrida1.setFatorDemanda(input.nextDouble());

        corrida1.exibirDetalhesCorrida();
    }
}