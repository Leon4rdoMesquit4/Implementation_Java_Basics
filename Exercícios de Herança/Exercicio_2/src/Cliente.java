public class Cliente extends Pessoa{
    private Double valorDivida;
    private int anoNascimento;

    public Cliente(String nome, int idade, String sexo, Double valorDivida, int anoNascimento) {
        super(nome, idade, sexo);
        this.valorDivida = valorDivida;
        this.anoNascimento = anoNascimento;
    }

    public Double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(Double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        return "Cliente: \n" +
                "ValorDivida = " + valorDivida +
                ", anoNascimento = " + anoNascimento +
                ", nome = " + nome +
                ", idade = " + idade +
                ", sexo = " + sexo ;
    }
}
