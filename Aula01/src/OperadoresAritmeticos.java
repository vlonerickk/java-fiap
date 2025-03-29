public class OperadoresAritmeticos {

    public static void main(String[] args) {
        //Declarar 3 variáveis (cp, challenge, gs)
        float cp = 6;
        float challenge = 6;
        float gs = 5;

        //Calcular a média do semestre (20% cp, 20% challenge, 60% gs)
        double media = cp * 0.2 + challenge * 0.2 + gs * 0.6;

        //Exibir a média do semestre
        System.out.println("A média é " + media);

        int x = 10;
        x++; //incremento em 1 unidade (x = x + 1)
        System.out.println(x); // x = 11
        x--; //decremento em 1 unidade (x = x - 1)
        System.out.println(x); // x = 10
        x += 2; //x = x + 2;
        System.out.println(x); // x = 12
        x -= 4; //x = x -4;
        System.out.println(x); // x = 8
        x *= 3; //x = x * 3;
        System.out.println(x); // x = 24
        x /= 4; //x = x / 4;
        System.out.println(x); // x = 6
        x %= 2; //x = x % 2;
        System.out.println(x); //x = 0

    }
}
