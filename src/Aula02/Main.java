package Aula02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Criar um objeto responsável para ler os dados digitados.

        Scanner leitor = new Scanner(System.in);

        Tenis tenis = new Tenis();
        //Colocar o objeto marca dentro do tênis
        Marca marca = new Marca();

        //Criar um objeto tenis com os valores digitados pelo usuário

        System.out.println("Digite o nome da marca: ");
        marca.nome = leitor.next();

        System.out.println("Digite a logo do tênis: ");
        marca.logo = leitor.next();


        System.out.println("Digite a cor do tênis: ");
        tenis.cor = leitor.next() + leitor.nextLine();

        System.out.println("Digite o modelo do tênis: ");
        tenis.modelo = leitor.next() + leitor.nextLine();

        System.out.println("Digite o tamanho do tênis: ");
        tenis.tamanho = leitor.nextInt();

        System.out.println("Digite o preço do tênis: ");
        tenis.preco = leitor.nextDouble();

        System.out.println("Esse tênis está disponivel: ");
        tenis.disponivel = leitor.nextBoolean();

        System.out.println("Aula02.Marca: " + marca.nome + "\nLogo: " + marca.logo + "\nCor: " + tenis.cor + "\nModelo: " + tenis.modelo + "\nTamanho: " + tenis.tamanho + "\nPreço: " + tenis.preco + "\nDisponível: " + tenis.disponivel);

        //Chamar/invocar o método para aumentar o valor do tenis

        tenis.aumentarPreco(10);

        //Exibir os valores no Scanner
        System.out.println("Valor atualizado: " + tenis.preco);

        //Chamar o método para calcularo o preço com desconto

        double valorDesconto = tenis.aplicarDesconto(10);
        System.out.println("Tênis com desconto: " + valorDesconto);

    }
}
