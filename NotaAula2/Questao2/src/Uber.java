public class Uber {
    private double distancia;
    private int tempoEspera ;
    private double tarifaBase;
    private double fatorDemanda;

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setTempoEspera(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public void setFatorDemanda(double fatorDemanda) {
        this.fatorDemanda = fatorDemanda;
    }

    public double calculaValorCorrida() {
        double valor_final = (this.distancia * 2) + (this.tempoEspera * 0.5) + (this.tarifaBase * this.fatorDemanda);
        return valor_final;

    }
    public void exibirDetalhesCorrida() {
        System.out.println("-=-=-=-=-= DETALHES DA CORRIDA =-=-=-=-=-");
        System.out.println("-----------------------------------------");
        System.out.println("Distância Percorrida: "+this.distancia+" km.");
        System.out.println("Tempo de Espera: "+this.tempoEspera+" minutos.");
        System.out.println("Tarifa Base: R$ "+this.tarifaBase);
        System.out.println("Fator de Demanda: "+this.fatorDemanda);
        System.out.println("-----------------------------------------");
        System.out.printf("VALOR TOTAL DA CORRIDA: R$ %.2f", calculaValorCorrida());
    }

}
