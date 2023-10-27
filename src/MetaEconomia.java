public class MetaEconomia {
    private double valorMeta;
    private boolean alcancada;

    public MetaEconomia(double valorMeta) {
        this.valorMeta = valorMeta;
        this.alcancada = false;
    }

    public double getValorMeta() {
        return valorMeta;
    }

    public boolean isAlcancada() {
        return alcancada;
    }

    public void alcancarMeta() {
        alcancada = true;
    }
}
