public class ContaPoupanca {
    private String titular;
    private int conta;
    private String tipo;
    private double saldo;
    private double selic;
    private double deposito;
    private double saque;


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSelic() {
        return selic;
    }

    public void setSelic(double selic) {
        this.selic = selic;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public void depositar(double valor) {
        setSaldo(this.saldo+valor);
        System.out.println("------------------------------------------");
        System.out.println("Depósito de R$ "+valor+" efetuado com sucesso!");
        System.out.println("------------------------------------------");

    }
    public void sacar (double valor) {

        if (valor <= this.saldo) {
            setSaldo(this.saldo - valor);
            System.out.println("----------------------------------------");
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
            System.out.println("----------------------------------------");
        } else {
            System.out.println("-----------------------------------------------------");
            System.out.println("Não existe saldo suficiente para realizar este saque.");
        }
    }

    public void exibir_dados_conta() {
        System.out.println("----------------------------");
        System.out.println("------ DADOS DA CONTA ------");
        System.out.println("----------------------------");
        System.out.println("Tipo de conta: "+this.tipo);
        System.out.println("Titular: "+this.titular);
        System.out.println("Número da conta: "+this.conta);
        System.out.println("Saldo Atual: R$ "+this.saldo);
        System.out.println("----------------------------");

    }
    public void calcular_rendimento () {
        double rendimento;
        if (this.selic > 8.5) {
            rendimento = 0.005 * this.saldo;
        }
        else {
            rendimento = 0.007 * this.selic * this.saldo;
        }

        System.out.println("Mantendo o valor de R$ "+this.saldo+" na poupança, rendimento em um mês será de R$ "+rendimento+".");

    }

}
