package model;

public class Usuario {
    private String nome;
    private String cpf;
    private String matricula;

    public Usuario(String nome, String cpf, String matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void imprimeUsuario() {
        System.out.println("Nome: "+ nome);
        System.out.println("CPF: "+ cpf);
        System.out.println("Matricula: "+ matricula);
    }
}