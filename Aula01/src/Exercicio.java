import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        //Criar o objeto para ler os dados
        Scanner leitor = new Scanner(System.in);

        //Ler o nome do aluno
        System.out.println("Digite o nome do aluno:");
        String nome = leitor.next() + leitor.nextLine();

        //Ler as notas das CPs (3 cps)
        System.out.println("Digite a nota da CP 1");
        double cp1 = leitor.nextDouble();

        System.out.println("Digite a nota da CP 2");
        double cp2 = leitor.nextDouble();

        System.out.println("Digite a nota da CP 3");
        double cp3 = leitor.nextDouble();

        //Ler a nota do challenge
        System.out.println("Digite a nota do Challenge");
        double challenge = leitor.nextDouble();

        //Ler a nota da GS
        System.out.println("Digite a nota da GS");
        double gs = leitor.nextDouble();

        //Calcular a média de CP
        double mediaCp = (cp1 + cp2 + cp3) / 3;

        //Calcular a média final
        double media = mediaCp * 0.2 + challenge * 0.2 + gs * 0.6;

        //Exibir o nome e a média final
        System.out.println(nome + " possui a média " + media);

    }
}
