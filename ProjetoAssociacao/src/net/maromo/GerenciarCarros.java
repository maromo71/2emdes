package net.maromo;

import java.time.LocalDate;

public class GerenciarCarros {

    public static void main(String[] args) {
	    //Definindo um cliente para 2 carros
        Pessoa cliente = new Pessoa();
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        //definir os dados do cliente
        cliente.setNome("Rodrigo Prof.");
        cliente.setEndereco("Rua da Etec, 237");
        cliente.setTelefone("(19)3870-6070");
        cliente.setDataNascimento(LocalDate.of(1979, 11, 20));
        //Cadastrar o dado do primeiro carro
        carro1.setAno(2020);
        carro1.setModelo("Ferrari 359");
        carro1.setPlaca("DDF-1A33");
        carro1.setValor(580000.0);
        //Cadatrar o dados do segundo carro
        carro2.setAno(1971);
        carro2.setModelo("Fusca");
        carro2.setPlaca("AAA-8777");
        carro2.setValor(5000.0);
        //Ligação dos objetos
        cliente.adicionarCarroAdquirido(carro1);
        cliente.adicionarCarroAdquirido(carro2);

        cliente.imprimirDadosDaPessoa();

    }
}
