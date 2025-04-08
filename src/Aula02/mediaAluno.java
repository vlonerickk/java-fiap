package Aula02;

import java.util.Scanner;

public class mediaAluno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Aluno aluno1 = new Aluno();


        System.out.println("Digite o nome do aluno: ");
        String nomeDoAluno = leitor.next();

        System.out.println("Digite a turma do aluno: ");
        String turmaDoAluno = leitor.next();

        System.out.println("Digite a primeira nota: ");
        aluno1.nota1 = leitor.nextDouble();

        System.out.println("Digite a segunda nota: ");
        aluno1.nota2 = leitor.nextDouble();

        System.out.println("Digite a terceira nota: ");
        aluno1.nota3 = leitor.nextDouble();

        aluno1.mediaFinal = (aluno1.nota1 +  aluno1.nota2 + aluno1.nota3) /3;

        System.out.println("Nome do Aula02.Aluno: " + nomeDoAluno + "\nTurma do aluno: " + turmaDoAluno +"\nnota 1: " + aluno1.nota1 + "\nNota 2: " + aluno1.nota2 + "\nNota 3: " + aluno1.nota3 + "\nMédia Final: " + aluno1.mediaFinal);

    }
}
