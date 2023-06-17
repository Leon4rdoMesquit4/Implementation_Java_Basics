package Mian;

import Gente.Aluno;
import Gente.Professor;
import Lalala.Curso;
import Lalala.Endereco;
import Lalala.Telefone;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Matemática");
        Curso curso2 = new Curso("Física");
        Curso curso3 = new Curso("Química");
        Curso curso4 = new Curso("Biologia");
        Curso curso5 = new Curso("Química");

        ArrayList<Curso> cursosProfessor = new ArrayList<Curso>();
        cursosProfessor.add(curso2);
        cursosProfessor.add(curso3);

        Telefone telefone1 = new Telefone("Móvel", "061", "99587-8564");
        Telefone telefone2 = new Telefone("Movel", "062", "99487-8204");
        Telefone telefone3 = new Telefone("Fixo", "063", "3587-8564");
        Telefone telefone4 = new Telefone("Fixo", "021", "98744-3332");
        ArrayList<Telefone> telefonesProfessor = new ArrayList<Telefone>();
        ArrayList<Telefone> telefonesAluno = new ArrayList<Telefone>();
        telefonesProfessor.add(telefone1);
        telefonesProfessor.add(telefone3);
        telefonesAluno.add(telefone2);
        telefonesAluno.add(telefone4);

        Endereco endereco1 = new Endereco("Santana 320", "Marinha dos Santos", "Mariscos");
        Endereco endereco2 = new Endereco("Santana 310", "Marinha dos Santos", "Mariscos");

        ArrayList<Double> notaAluno1 = new ArrayList<>();
        notaAluno1.add(10d);
        notaAluno1.add(10d);
        notaAluno1.add(9.2d);
        notaAluno1.add(9.8d);
        notaAluno1.add(10d);
        notaAluno1.add(9d);

        ArrayList<Double> notaAluno2 = new ArrayList<>();
        notaAluno2.add(8d);
        notaAluno2.add(8.9d);
        notaAluno2.add(7.6d);
        notaAluno2.add(9.8d);

        Aluno aluno1 = new Aluno("Marcos", "123321345-98", "jhfjkgdkfdg@gmail.com", telefonesAluno,
                endereco1, curso2, notaAluno1);
        aluno1.imprimir();
        Professor professor1 = new Professor("Raimundo", "974795379-46", "dfhjhhjkd@jdskdh.com",
                telefonesProfessor, endereco2, "Mestre", 23945.43, cursosProfessor);
        professor1.imprimir();
        System.out.println(aluno1.calcularMedia());

        aluno1.imprimir();
    }
}
