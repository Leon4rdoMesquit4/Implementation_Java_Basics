public class Gerente extends Empregado{
    private String nomeGerencia;

    public Gerente(String nome, int idade, String sexo, Double salario, String matricula, String nomeGerencia) {
        super(nome, idade, sexo, salario, matricula);
        this.nomeGerencia = nomeGerencia;
    }

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    @Override
    public String toString() {
        return "Gerente: \n" +
                "nomeGerencia = " + nomeGerencia +
                ", nome = " + nome +
                ", idade = " + idade +
                ", sexo = " + sexo;
    }
}
