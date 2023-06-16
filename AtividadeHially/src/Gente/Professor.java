package Gente;

import Lalala.Curso;
import Lalala.Endereco;
import Lalala.Telefone;

import java.util.ArrayList;

public class Professor extends Pessoa{
    private String titulacao;
    private double salario;
    private ArrayList<Curso> cursos;

    public Professor(String nome, String cpf, String email, ArrayList<Telefone> telefones, Endereco endereco, String titulacao, double salario, ArrayList<Curso> cursos) {
        super(nome, cpf, email, telefones, endereco);
        this.titulacao = titulacao;
        this.salario = salario;
        this.cursos = cursos;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCursos() {
        StringBuilder temporario = new StringBuilder();
        for (Curso curso : cursos) {
            temporario.append(curso.getNome()).append(" ");
        }
        return temporario.toString();
    }

    public void setCursos(Curso curso) {
        this.cursos.add(curso);
    }

    public void imprimir() {
        System.out.println("Pessoa{" +
                "nome='" + getNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", endereco=" + getEndereco() +
                "titulacao='" + titulacao + '\'' +
                ", salario=" + salario +
                ", cursos=" + getCursos() +
                '}' + '}');
    }

}
