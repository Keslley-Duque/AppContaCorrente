/*
Implemente um aplicativo “AppContaCorrenteSimples” que possui uma classe ContaCorrente
com atributos como número da conta, o nome do titular e o saldo.

Implemente construtor(es) e métodos de acesso aos atributos. 
Implemente métodos para permitir saque e depósito na conta corrente.
É necessário prever que o saque deverá ser permitido somente em caso de haver saldo. 
Caso contrário deverá ser emitida uma mensagem alertando o cliente sobre o ocorrido.

Ao usuário deverá ser dada a oportunidade de, após a conta ter sido criada, 
selecionar se ele deseja consultar o saldo, depositar ou sacar.
*/

public class ContaCorrente {
    private String numeroDaConta, nomeDoTitular;
    private double saldo;

    public ContaCorrente() {
    }

    public ContaCorrente(String numeroDaConta, String nomeDoTitular) {
        this.setNumeroDaConta(numeroDaConta);
        this.setNomeDoTitular(nomeDoTitular);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta2) {
        this.numeroDaConta = numeroDaConta2;
    }

    public Double deposito(double valor) {

        return saldo += valor;
    }

    public boolean saque(double valor) {

        if (saldo < valor) {
            return false;
        } else {
            saldo -= valor;
            return true;
        }
    }

    public String dados() {
        return "Dados do Usuario" + "\nNome do titular: " + nomeDoTitular + "\nNumero da Conta: " + numeroDaConta
                + "\nSaldo da conta: " + saldo;
    }

}