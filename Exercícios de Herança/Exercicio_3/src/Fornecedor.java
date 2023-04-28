public class Fornecedor extends Pessoa{
    protected Double valorCredito;
    protected Double valorDivida;

    public Fornecedor(Double valorCredito, Double valorDivida, String nome,
                      String endereco, String telefone) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public Double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(Double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public Double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(Double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public Double obterSaldo(){
        return valorCredito - valorDivida;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "valorCredito=" + valorCredito +
                ", valorDivida=" + valorDivida +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
