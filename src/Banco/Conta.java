package Banco;

public class Conta {
    private String numero, nome;
    private double saldo;

    //Constructors
    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public Conta(String numero) {
        this.numero = numero;
        this.saldo = 0;
    }

    //Getters and Setters Section

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Methods
    //check for exceptions, not for boolean results
    public void depositar(double valor){
        saldo += valor;
        System.out.println("Valor Depositado: "+valor+" Saldo Atual: "+saldo);
        System.out.println("Operação Concluída com Sucesso!");
    }

    public boolean sacar(double valor){
        if(saldo < valor){
            System.out.println("Saldo Insuficiente! "+ " Valor do Saque: " + valor + "Saldo da Conta: " + saldo);
            return false;
        }
        else
            System.out.println("Valor Sacado: " + valor);
        saldo -= valor;
        System.out.println("Operação Concluída com Sucesso!");
        return true;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                '}';
    }
    public void conta(String nome){
        this.nome = nome;
    }
}
