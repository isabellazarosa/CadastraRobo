public class Industrial extends Robo {
    private String setor;

    public Industrial(int id, String modelo, double valorDiario, String setor) {
        super(id, modelo, valorDiario);
        this.setor = setor;
    }

    @Override
    public double calculaLocacao(int dias) {
        return dias * valorDiario;
    }

    @Override
    public String toString() {
        return super.toString() + ", Setor: " + setor;
    }
}
