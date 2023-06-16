package Gente;

import Lalala.Curso;
import Lalala.Endereco;
import Lalala.Telefone;

import java.util.ArrayList;

public class Aluno extends Pessoa{
    private Curso curso;
    private ArrayList<Double> notas;

    public Aluno(String nome, String cpf, String email, ArrayList<Telefone> telefones, Endereco endereco, Curso curso, ArrayList<Double> notas) {
        super(nome, cpf, email, telefones, endereco);
        this.curso = curso;
        this.notas = notas;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(double nota) {
        this.notas.add(nota);
    }

    public double calcularMedia(){
        double soma = 0;
        for(int i = 0; i<notas.size(); i++){
            soma+= notas.get(i);
        }
        return soma/ (notas.size());
    }

    public void imprimir(){
        System.out.println("Aluno{" +
                "nome='" + getNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", endereco=" + getEndereco() +
                "curso=" + curso.getNome() +
                ", notas=" + notas +
                '}');
    }


}
