package com.company.aula2108c.modelo;

public class Aluno {
    private int rm;
    private String nome;
    private String email;

    public Aluno(int rm, String nome, String email){
        this.rm = rm;
        this.nome = nome;
        this.email = email;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "rm=" + rm +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
