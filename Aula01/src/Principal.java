public class Principal {

    //Método principal, por onde o programa começa
    public static void main(String[] args) {

        //Criar um objeto a partir da classe Piloto
        Piloto bortoleto = new Piloto();
        bortoleto.nome = "Gabriel Bortoleto";
        bortoleto.equipe = "Sauber";
        bortoleto.peso = 45;
        bortoleto.vitorias = 0;

        //Criar um outro objeto do Piloto
        Piloto duarte = new Piloto();
        duarte.nome = "Gabriel Duarte";
        duarte.peso = 80.5f;
        duarte.equipe = "FIAP";
        duarte.vitorias = 2;

        //Exibir os valores
        System.out.println(bortoleto.nome + " Peso: " + bortoleto.peso);
        System.out.println(bortoleto.vitorias);
        System.out.println(duarte.nome);

    }

}
