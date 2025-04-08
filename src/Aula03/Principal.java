package Aula03;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        Cliente cliente = new Cliente();
        contaCorrente cc = new contaCorrente();

        //ler dados

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        cliente.nome = leitor.next() + leitor.nextLine();
        cliente.endereco = endereco;

        System.out.println("Digite o logradouro: ");
        endereco.logradouro = leitor.next() + leitor.nextLine();

        System.out.println("Digite o número do endereço: ");
        endereco.numero = leitor.nextShort();

        System.out.println("Digite o complemento: ");
        endereco.complemento = leitor.next() + leitor.nextLine();

        System.out.println("Digite o CEP: ");
        endereco.cep = leitor.next() + leitor.nextLine();

        cc.titular = cliente;

        //Pedir valor para depósito
        System.out.println("Digite um valor para depósito: ");
        cc.despositar(leitor.nextDouble());

        //Pedir valor para retirada
        System.out.println("Digite o valor do saque: ");
        cc.retirar(leitor.nextDouble());


        //Exibir os dados do cliente e o saldo

        System.out.println(cliente.retornaDados());
        System.out.println("Saldo: " + cc.saldo);



    }

}
