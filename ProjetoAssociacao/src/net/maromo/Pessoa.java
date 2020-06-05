package net.maromo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private LocalDate dataNascimento;
    //Importante - isntanciar o seu atributo da lista
    private List<Carro> carros = new ArrayList<>();

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    //Adicionar carros a pessoas.
    public void adicionarCarroAdquirido(Carro carro){
        carros.add(carro);
        System.out.println("Carro cadastrado para o cliente: " + nome);
    }

    public void imprimirDadosDaPessoa(){
        System.out.println("Dados do Cliente");
        System.out.println("--------------------------");
        System.out.println("nome = " + nome);
        System.out.println("endereco = " + endereco);
        System.out.println("telefone = " + telefone);
        System.out.println("dataNascimento = " + dataNascimento);
        System.out.println("Dados dos Veículos do cliente: " + nome);
        for (Carro carro: carros) {
            carro.imprimirDadosCarro();
        }
    }

}
