package Gente;

import Lalala.Endereco;
import Lalala.Telefone;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String cpf;
    private String email;

    private ArrayList<Telefone> telefones;
    private Endereco endereco;

    public Pessoa(String nome, String cpf, String email, ArrayList<Telefone> telefones, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefones = telefones;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco.toString();
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone telefone) {
        this.telefones.add(telefone);
    }

    public void imprimir() {
        System.out.println("Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", endereco=" + endereco +
                '}');
    }
}
