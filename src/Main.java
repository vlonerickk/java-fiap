import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Criar um objeto responsável para ler os dados digitados.

        Scanner leitor = new Scanner(System.in);

        Tenis tenis = new Tenis();

        //Criar um objeto tenis com os valores digitados pelo usuário

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

        System.out.println("Cor: " + tenis.cor + "\nModelo: " + tenis.modelo + "\nTamanho: " + tenis.tamanho + "\nPreço: " + tenis.preco + "\nDisponível: " + tenis.disponivel);

        //Exibir os valores que estão dentro do objeto


    }
}
