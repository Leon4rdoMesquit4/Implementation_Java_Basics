public class Vendedor extends Empregado{
    private Double valorVendas;
    private int qntVendas;

    public Vendedor(String nome, int idade, String sexo, Double salario, String matricula, Double valorVendas, int qntVendas) {
        super(nome, idade, sexo, salario, matricula);
        this.valorVendas = valorVendas;
        this.qntVendas = qntVendas;
    }

    public Double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(Double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getQntVendas() {
        return qntVendas;
    }

    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }

    @Override
    public String toString() {
        return "Vendedor: \n" +
                "valorVendas = " + valorVendas +
                ", qntVendas = " + qntVendas +
                ", nome = " + nome +
                ", idade = " + idade +
                ", sexo = " + sexo;
    }
}
