package net.maromo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarCarros {
    List<Pessoa> listadePessoas;
    List<Carro> listadeCarros;

    //método Construtor
    public GerenciarCarros(){
        //inicializar as listas vazias
        listadeCarros = new ArrayList<>();
        listadePessoas = new ArrayList<>();
    }
    //Classe que realmente gerencie cadastros de carros e pessoas.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciarCarros gc = new GerenciarCarros();
        int opc = 0;
        do{
            //Menu
            System.out.println("Menu Principal");
            System.out.println("=------------=");
            System.out.println("1. Cadastrar Pessoa");
            System.out.println("2. Cadastrar Carro");
            System.out.println("3. Adicionar Propriedade");
            System.out.println("4. Transferir Propriedade");
            System.out.println("5. Listar dados da Pessoa");
            System.out.println("6. Listar dados do Carro");
            System.out.println("9. Sair");
            System.out.println("Digite sua opção: ");
            opc = Integer.parseInt(sc.nextLine());
            switch(opc){
                case 1:
                    gc.cadastrarPessoa();
                    break;
                case 2:
                    gc.cadastrarVeiculo();
                    break;
                case 3:
                    gc.adicionarCarroParaProprietario();
                    break;
                case 4:
                    gc.transferirPropriedade();
                    break;
                case 5:
                    gc.listarPessoas();
                    break;
                case 6:
                    gc.listarCarros();
                    break;
                case 9:
                    System.out.println("Final do Programa");
                    break;
                default:
                    System.out.println("Opção inválida, favor corrigir");
            }
        }while(opc!=9);
   }

    public void cadastrarPessoa(){
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        System.out.println("Digite o Código da Pessoa: ");
        pessoa.setCodPessoa(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o nome da Pessoa: ");
        pessoa.setNome(sc.nextLine());
        System.out.println("Digite seu endereço: ");
        pessoa.setEndereco(sc.nextLine());
        System.out.println("Digite seu telefone: ");
        pessoa.setTelefone(sc.nextLine());
        System.out.println("Digite dia do nascimento:");
        int dia = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o mês de nascimento:");
        int mes = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o ano de nascimento: ");
        int ano = Integer.parseInt(sc.nextLine());
        pessoa.setDataNascimento(LocalDate.of(ano, mes, dia));
        //adicionar pessoa na lista
        listadePessoas.add(pessoa);
        System.out.println("Pessoa cadastrada com sucesso");
    }

    public void cadastrarVeiculo(){
        Scanner sc = new Scanner(System.in);
        Carro carro = new Carro();
        System.out.println("Digite o Modelo do Carro: ");
        carro.setModelo(sc.nextLine());
        System.out.println("Digite o ano da Carro: ");
        carro.setAno(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite a placa do carro: ");
        carro.setPlaca(sc.nextLine());
        System.out.println("Digite o valor do carro ");
        carro.setValor(Double.parseDouble(sc.nextLine()));
        //adicionar carro na lista
        listadeCarros.add(carro);
        System.out.println("Carro cadastrado com sucesso");
    }

    public void adicionarCarroParaProprietario(){
        Scanner sc = new Scanner(System.in);
        String placaProcurada;
        int codigoPessoaProcurada;
        System.out.println("Registro para proprietário");
        System.out.println("Digite a placa do carro a ser registrado");
        placaProcurada = sc.nextLine();
        //procurar o carro na lista
        boolean achou = false;
        //Variavel para representar o carro
        Carro carro = new Carro();
        for(Carro c : listadeCarros){
            if(placaProcurada.equals(c.getPlaca())){
                achou = true;
                carro = c;
            }
        }
        if(achou){
            System.out.println("Digite o codigo da pessoa a registra o veiculo: ");
            codigoPessoaProcurada = Integer.parseInt(sc.nextLine());
            boolean achoup = false;
            Pessoa pessoa = new Pessoa();
            for(Pessoa p : listadePessoas){
                if(codigoPessoaProcurada == p.getCodPessoa()){
                    achoup = true;
                    pessoa = p;
                }
            }
            if(achoup){
                pessoa.adicionarCarroAdquirido(carro);
                System.out.println("Carro Adicionado ao Proprietário com Sucesso");
                return;
            }else{
                System.out.println("Pessoa não existe, favor confirmar");
            }
        }else{
            System.out.println("Não existe esse carro.");
            return;
        }
    }

    public void transferirPropriedade(){
        Scanner sc = new Scanner(System.in);
        int codPessoaComprou;
        int codPessoaVendeu;
        Pessoa pessoaCompra = new Pessoa();
        Pessoa pessoaVenda = new Pessoa();
        System.out.println("Digite o código do vendedor: ");
        codPessoaVendeu = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o código do comprador: ");
        codPessoaComprou = Integer.parseInt(sc.nextLine());
        int vez = 0;
        for(Pessoa p : listadePessoas){
            if(codPessoaVendeu == p.getCodPessoa()) {
                vez++;
                pessoaVenda = p;
            }
            if(codPessoaComprou == p.getCodPessoa()){
                vez++;
                pessoaCompra = p;
            }
        }
        if(vez==2){
            //procurar o carro pela placa
            System.out.println("Digite a placa do veiculo a ser transferido: ");
            String placaProcurada = sc.nextLine();
            Carro carro = new Carro();
            boolean achou = false;
            for(Carro c : listadeCarros){
                if(placaProcurada.equals(c.getPlaca())){
                    achou = true;
                    carro = c;
                }
            }
            if(achou){
                pessoaVenda.getCarros().remove(carro);
                pessoaCompra.adicionarCarroAdquirido(carro);
                System.out.println("Carro transferido com sucesso");
                System.out.println("Se duvidar, imprime para ver");
            }else{
                System.out.println("Impossível Transferir Veículo nâo Cadastrado");
            }
        }

    }
    public void listarPessoas(){
        for (Pessoa p : listadePessoas) {
            p.imprimirDadosDaPessoa();
        }
    }
    public void listarCarros(){
        for(Carro c : listadeCarros){
            c.imprimirDadosCarro();
        }
    }
}
