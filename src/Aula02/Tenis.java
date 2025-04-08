package Aula02;

public class Tenis {
    //Atributos
    String cor;
    String modelo;
    int tamanho;
    double preco;
    boolean disponivel;

    //Atributo de referencia (outra classe que iremos criar)
    Marca marca;

    //Métodos
    //Método para aumentar o preço do tênis em porcentagens

    void aumentarPreco (float porcentagem){

        preco = preco + preco * porcentagem/100;
    }

    double aplicarDesconto (float porcentagem){
        double valorComDesconto;
        valorComDesconto = preco - preco*porcentagem/100;
        return valorComDesconto;
    }

}
