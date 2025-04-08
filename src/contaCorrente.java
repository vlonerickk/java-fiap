public class contaCorrente {
    double saldo;
    Cliente titular;

    void despositar (double valor){
        saldo += valor;
    }
    void retirar (double valor){
        saldo -= valor;
    }
    double retornarSaldo(){
        return saldo;
    }

}
