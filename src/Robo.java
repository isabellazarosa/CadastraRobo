public abstract class Robo {
    protected int id;
    protected String modelo;
    protected double valorDiario;

    public Robo(int id, String modelo, double valorDiario) {
        this.id = id;
        this.modelo = modelo;
        this.valorDiario = valorDiario;
    }

    public abstract double calculaLocacao(int dias);

    @Override
    public String toString() {
        return "ID: " + id + ", Modelo: " + modelo + ", Valor Diário: " + valorDiario;
    }
}
