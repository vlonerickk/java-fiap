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
}
