public class Empregado extends Pessoa{
    private Double salario;
    private String matricula;

    public Empregado(String nome, int idade, String sexo, Double salario, String matricula) {
        super(nome, idade, sexo);
        this.salario = salario;
        this.matricula = matricula;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double valorInss(){
        return salario*0.11;
    }
    @Override
    public String toString() {
        return "Empregado: " +
                "salario = " + salario +
                ", matricula = " + matricula +
                ", nome = " + nome +
                ", idade = " + idade +
                ", sexo = " + sexo;
    }
}
