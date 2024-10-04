public class Produto {
    private int codigo;
    private String nome;
    private double tamanho;
    private double peso;
    private String cor;
    private double valor;
    private int estoque;
    private int quantidade_venda;
    private double total = 0;
    private double subtotal = 0;



    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {this.estoque = estoque;}

    public int getQuantidade_venda() {return quantidade_venda;}

    public void setQuantidade_venda(int quantidade_venda) {this.quantidade_venda = quantidade_venda;}

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }


    public void vender() {
        if (quantidade_venda <= estoque) {
            estoque -= quantidade_venda;
            subtotal = quantidade_venda * valor;
            System.out.println(this.getQuantidade_venda() + " " + this.getNome() + "(s) vendidos(as) com sucesso!");
        } else {
            System.out.println("Não temos essa quantidade de " + nome + "(s) no estoque.");
        }
    }    





}
