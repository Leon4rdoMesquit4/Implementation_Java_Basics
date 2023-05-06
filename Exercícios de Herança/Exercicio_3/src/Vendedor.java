public class Vendedor extends Empregado{
    private Double valorVendas;
    private Double comissao;

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, Double salarioBase, Double imposto, Double valorVendas, Double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public Double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(Double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    @Override
    public Double calcularSalario() {
        return salarioBase + (valorVendas * comissao);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "valorVendas=" + valorVendas +
                ", comissao=" + comissao +
                ", codigoSetor=" + codigoSetor +
                ", salarioBase=" + salarioBase +
                ", imposto=" + imposto +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
