import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r;
        int q;
        int p;
        double total = 0.0;  // Variável total para acumular o valor das compras
        double desconto;
        double dinheiro;

        Scanner input = new Scanner(System.in);

        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto();

        do {
            System.out.println("[1] - Cadastrar Produtos\n[2] - Comprar Produtos\n[3] - Pagamento");
            System.out.print("Digite a operação que deseja realizar: ");
            String x = input.nextLine();  // Captura como string e converte quando necessário

            switch (x) {
                case "1":
                    System.out.println("########## CADASTRO DE PRODUTOS ##########");
                    System.out.println("------------------------------------------");
                    System.out.print("Digite o nome do 1º produto: ");
                    p1.setNome(input.nextLine());
                    System.out.print("Digite a quantidade no estoque: ");
                    p1.setEstoque(Integer.parseInt(input.nextLine()));
                    System.out.print("Digite o valor do produto: ");
                    p1.setValor(input.nextDouble());
                    input.nextLine();  // Consumir a quebra de linha pendente

                    System.out.print("Digite o nome do 2º produto: ");
                    p2.setNome(input.next());
                    input.nextLine();  // Consumir a quebra de linha pendente
                    System.out.print("Digite a quantidade no estoque: ");
                    p2.setEstoque(Integer.parseInt(input.nextLine()));
                    System.out.print("Digite o valor do produto: ");
                    p2.setValor(input.nextDouble());
                    input.nextLine();  // Consumir a quebra de linha pendente

                    System.out.print("Digite o nome do 3º produto: ");
                    p3.setNome(input.next());
                    input.nextLine();  // Consumir a quebra de linha pendente
                    System.out.print("Digite a quantidade no estoque: ");
                    p3.setEstoque(Integer.parseInt(input.nextLine()));
                    System.out.print("Digite o valor do produto: ");
                    p3.setValor(input.nextDouble());
                    input.nextLine();  // Consumir a quebra de linha pendente
                    break;

                case "2":
                    do {
                        System.out.println("########## COMPRA DE PRODUTOS ##########");
                        System.out.println("----------------------------------------");
                        System.out.println("Digite o produto que deseja comprar: ");
                        System.out.println("[1] - " + p1.getNome() + " - " + p1.getEstoque() + " unidades no estoque.");
                        System.out.println("[2] - " + p2.getNome() + " - " + p2.getEstoque() + " unidades no estoque.");
                        System.out.println("[3] - " + p3.getNome() + " - " + p3.getEstoque() + " unidades no estoque.");
                        System.out.print("Selecione o número do produto: ");
                        String z = input.nextLine();

                        switch (z) {
                            case "1":
                                System.out.println("Digite a quantidade de " + p1.getNome() + " que deseja comprar: ");
                                p1.setQuantidade_venda(Integer.parseInt(input.nextLine()));
                                p1.vender();
                                System.out.println("SUBTOTAL: " + p1.getSubtotal());
                                total += p1.getSubtotal();
                                System.out.println("TOTAL: " + total);
                                break;

                            case "2":
                                System.out.println("Digite a quantidade de " + p2.getNome() + " que deseja comprar: ");
                                p2.setQuantidade_venda(Integer.parseInt(input.nextLine()));
                                p2.vender();
                                System.out.println("SUBTOTAL: " + p2.getSubtotal());
                                total += p2.getSubtotal();
                                System.out.println("TOTAL: " + total);
                                break;

                            case "3":
                                System.out.println("Digite a quantidade de " + p3.getNome() + " que deseja comprar: ");
                                p3.setQuantidade_venda(Integer.parseInt(input.nextLine()));
                                p3.vender();
                                System.out.println("SUBTOTAL: " + p3.getSubtotal());
                                total += p3.getSubtotal();
                                System.out.println("TOTAL: " + total);
                                break;

                            default:
                                System.out.println("Opção Inválida");
                                break;
                        }

                        System.out.println("----------------------------------------------");
                        System.out.print("DIGITE 0 para COMPRAR MAIS ou QUALQUER OUTRO NÚMERO para SAIR: ");
                        q = Integer.parseInt(input.nextLine());

                    } while (q == 0);

                    System.out.println("---------------------------------------------");
                    System.out.println("#### SITUAÇÃO DO ESTOQUE APÓS AS COMPRAS ####");
                    System.out.println("[1] - " + p1.getNome() + " - " + p1.getEstoque() + " unidades no estoque.");
                    System.out.println("[2] - " + p2.getNome() + " - " + p2.getEstoque() + " unidades no estoque.");
                    System.out.println("[3] - " + p3.getNome() + " - " + p3.getEstoque() + " unidades no estoque.");

                    break;

                case "3":
                    System.out.println("############### PAGAMENTO  ###############");
                    System.out.println("------------------------------------------");
                    System.out.println("O TOTAL a pagar é " + total);
                    System.out.println("Como você deseja pagar?\n[1] - Pix (5% de desconto)\n[2] - Débito (5% de desconto)\n[3] - Espécie (5% de desconto)\n[4] - Crédito (parcelamento em até 3 parcelas) ");
                    p = (int) input.nextDouble();
                    input.nextLine();  // Consome a quebra de linha deixada no buffer
                    if (p == 1 || p ==2) {
                        desconto = total * 0.05;
                        System.out.println("-----------------------------------------");
                        System.out.println("Total: "+ total);
                        System.out.println("Desconto: "+ desconto);
                        System.out.println("TOTAL A PAGAR: "+(total - desconto));
                        System.out.println("-----------------------------------------");
                        System.out.println("#### PAGAMENTO REALIZADO COM SUCESSO ####");
                    }
                    else if (p == 3) {

                        System.out.println("-----------------------------------------");
                        desconto = total * 0.05;
                        System.out.println("-----------------------------------------");
                        System.out.println("Total: "+ total);
                        System.out.println("Desconto: "+ desconto);
                        System.out.println("TOTAL A PAGAR: "+(total - desconto));
                        System.out.println("Quanto em dinheiro você vai me entregar? ");
                        dinheiro = (input.nextDouble());
                        input.nextLine();  // Consome a quebra de linha deixada no buffer
                        if (dinheiro > (total-desconto)) {
                            System.out.println("-----------------------------------------");
                            System.out.println("Seu troco será de R$ " + (dinheiro - (total - desconto)));
                            System.out.println("#### PAGAMENTO REALIZADO COM SUCESSO ####");
                        }
                        else if (dinheiro < (total - desconto)) {
                                System.out.println("Dinheiro insuficiente para o Pagamento");
                        }
                        else {
                            System.out.println("#### PAGAMENTO REALIZADO COM SUCESSO ####");

                        }

                    }
                    else if (p == 4) {
                        System.out.println("-----------------------------------------");
                        System.out.println("TOTAL: "+ total);
                        System.out.println("Parcelamento (opcional): 3 parcelas de R$ "+(total/3));
                        System.out.println("-----------------------------------------");
                        System.out.println("#### PAGAMENTO REALIZADO COM SUCESSO ####");
                    }

                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;
            }
            System.out.println("----------------------------------------------");
            System.out.print("DIGITE 0 para VOLTAR AO MENU PRINCIPAL ou OUTRO NÚMERO para SAIR: ");
            r = Integer.parseInt(input.nextLine());

        } while (r == 0);

        input.close();
    }
}
