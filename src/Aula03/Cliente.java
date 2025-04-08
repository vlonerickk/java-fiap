package Aula03;

public class Cliente {
    String nome;
    String cpf;
    Endereco endereco;

    String retornaDados(){
        return "Nome: " + nome + ", CPF :" + cpf + ", Endereço: " + endereco.retornaEndereco();
    }
}
