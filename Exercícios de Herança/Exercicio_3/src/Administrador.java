public class Administrador extends Empregado{
    private Double ajudaDeCusto;

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, Double salarioBase, Double imposto, Double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(Double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public Double calcularSalario(){
        return salarioBase + ajudaDeCusto;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "ajudaDeCusto=" + ajudaDeCusto +
                ", codigoSetor=" + codigoSetor +
                ", salarioBase=" + salarioBase +
                ", imposto=" + imposto +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
