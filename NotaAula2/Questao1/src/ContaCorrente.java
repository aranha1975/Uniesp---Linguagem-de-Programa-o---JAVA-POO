public class ContaCorrente {
    private String titular;
    private int conta;
    private String tipo;
    private double saldo;
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
    public void usar_cheque_especial (double valor) {
        if (valor < this.saldo) {
            System.out.println("------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("você tem saldo suficiente na conta, para compensação do cheque a ser emitido, portanto não precisa entrar no cheque especial. ");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        }
        else {
        System.out.println("--------------------------------------------------");
        System.out.println("O saldo atual é de R$ "+this.saldo+".\nVocê quer emitir um cheque no valor de R$ "+valor+".\nPortanto você usará R$ "+(valor - this.saldo)+" de cheque especial.");
        System.out.println("--------------------------------------------------");
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


}
