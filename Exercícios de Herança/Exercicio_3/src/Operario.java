public class Operario extends Empregado{
    private Double valorProducao;
    private Double comissao;

    public Operario(String nome, String endereco, String telefone, int codigoSetor, Double salarioBase, Double imposto, Double valorProducao, Double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public Double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(Double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    @Override
    public Double calcularSalario(){
        return salarioBase + (comissao * valorProducao);
    }

    @Override
    public String toString() {
        return "Operador{" +
                "valorProducao=" + valorProducao +
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
