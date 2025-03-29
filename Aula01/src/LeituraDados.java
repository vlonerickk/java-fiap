import java.util.Scanner;

public class LeituraDados {

    public static void main(String[] args) {

        //Criar o objeto responsável por ler as informações
        Scanner leitor = new Scanner(System.in);

        //Cria uma variável e lê um valor do tipo float
        System.out.println("Digite o valor do produto");
        float valor = leitor.nextFloat();

        //Lê a quantidade do produto
        System.out.println("Digite a quantidade");
        int qtd = leitor.nextInt();

        //Exibir o valor total
        float valorTotal = valor * qtd;
        System.out.println("O valor total é "  + valorTotal);

    }
}
