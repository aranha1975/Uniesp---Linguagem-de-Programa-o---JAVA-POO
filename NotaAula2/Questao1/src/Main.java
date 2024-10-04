import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int voltar = 2;

        do {

            System.out.println("----------------------------------");
            System.out.println("########## BANCO UNIESP ##########");
            System.out.println("----------------------------------");
            System.out.println("[1] - Conta Corrente\n[2] - Conta Poupança\nSelecione o tipo de conta: ");
            int menu1 = input.nextInt();

            switch (menu1) {
                case 1:
                    ContaCorrente c1 = new ContaCorrente();
                    c1.setTitular("Márcio");
                    c1.setSaldo(0);
                    c1.setConta(986572);
                    c1.setTipo("Corrente");
                    int continuar1 = 0;
                    do {
                        System.out.println("--------------------------------------------");
                        System.out.println("-------------- CONTA CORRENTE --------------");
                        System.out.println("--------------------------------------------");
                        System.out.print("[1] - Depositar\n[2] - Sacar\n[3] - Usar Cheque especial\n[4] - Exibir dados da conta\nDigite a opção desejada: ");
                        int menu2 = input.nextInt();
                        switch (menu2) {
                            case 1:
                                System.out.println("--------------------------------------------");
                                System.out.println("O saldo atual da conta é R$ " + c1.getSaldo());
                                System.out.println("Digite o valor em reais que deseja DEPOSITAR: ");
                                double deposito = input.nextDouble();
                                c1.depositar(deposito);
                                break;
                            case 2:
                                System.out.println("--------------------------------------------");
                                System.out.println("O saldo atual da conta é R$ " + c1.getSaldo());
                                System.out.println("Digite o valor em reais que deseja SACAR: ");
                                double saque = input.nextDouble();
                                c1.sacar(saque);
                                break;
                            case 3:
                                System.out.println("--------------------------------------------");
                                System.out.println("O saldo atual da conta é R$ " + c1.getSaldo());
                                System.out.println("Digite o valor do cheque que você quer emitir: ");
                                double cheque = input.nextInt();
                                c1.usar_cheque_especial(cheque);
                                break;
                            case 4:
                                c1.exibir_dados_conta();
                                break;

                            default:
                                System.out.println("-------------------------------------");
                                System.out.println("Opção Inválida");

                        }

                        System.out.println("-------------------------------------");
                        System.out.print("[0] - Voltar para Menu Conta Corrente\n[1] - Sair e ver outras opções\nDigite a opção escolhida: ");
                        continuar1 = input.nextInt();
                    } while (continuar1 == 0);

                    break;

                case 2:

                    ContaPoupanca c2 = new ContaPoupanca();
                    c2.setTitular("Márcio");
                    c2.setSaldo(0);
                    c2.setConta(986572);
                    c2.setTipo("Poupança");
                    int continuar2 = 0;
                    do {

                        System.out.println("--------------------------------------------");
                        System.out.println("-------------- CONTA POUPANÇA --------------");
                        System.out.println("--------------------------------------------");
                        System.out.print("[1] - Depositar\n[2] - Sacar\n[3] - Calcular Rendimento\n[4] - Exibir dados da conta\nDigite a opção desejada: ");
                        int menu = input.nextInt();
                        switch (menu) {
                            case 1:
                                System.out.println("--------------------------------------------");
                                System.out.println("O saldo atual da conta é R$ " + c2.getSaldo());
                                System.out.println("Digite o valor em reais que deseja DEPOSITAR: ");
                                double deposito = input.nextDouble();
                                c2.depositar(deposito);
                                break;
                            case 2:
                                System.out.println("--------------------------------------------");
                                System.out.println("O saldo atual da conta é R$ " + c2.getSaldo());
                                System.out.println("Digite o valor em reais que deseja SACAR: ");
                                double saque = input.nextDouble();
                                c2.sacar(saque);
                                break;
                            case 3:
                                System.out.println("--------------------------------------------");
                                System.out.println("O saldo atual da poupança é R$ " + c2.getSaldo());
                                System.out.println("Digite o valor da SELIC atual: ");
                                c2.setSelic(input.nextInt());
                                c2.calcular_rendimento();
                                break;

                            case 4:
                                c2.exibir_dados_conta();
                                break;

                            default:
                                System.out.println("-------------------------------------");
                                System.out.println("Opção Inválida");
                        }

                        System.out.println("-------------------------------------");
                        System.out.print("[0] - Voltar para Menu Conta Poupança\n[1] - Sair e ver outras opções\nDigite a opção escolhida: ");
                        continuar2 = input.nextInt();
                    } while (continuar2 == 0);

                    break;

                default:
                    System.out.println("-------------------------------");
                    System.out.println("Opção Inválida");
            }
            System.out.println("-------------------------------");
            System.out.print("[2] - Sair para Menu Principal\n[3] - Fechar o programa\nDigite a opção escolhida: ");
            voltar = input.nextInt();


        } while (voltar == 2);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("************ Obrigado por usar nosso sistema bancário! ************");
        System.out.println("-------------------------------------------------------------------");




    }

}