package Aula03;

public class Endereco {
    String logradouro;
    short numero;
    String complemento;
    String cep;

    String retornaEndereco(){
        return "Logradouro: " + logradouro + ", Número: " + numero + ", Complemento: " + complemento + ", CEP: " + cep;
    }
}
