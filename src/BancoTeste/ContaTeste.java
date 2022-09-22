package BancoTeste;

import Banco.Conta;

public class ContaTeste {
    public static void main(String[] args) {
        Conta conta1 = new Conta("3",300.0);
        Conta conta2 = new Conta("2");

        conta1.toString();
        conta2.toString();

        if(conta1.sacar(50))
            System.out.println("Success! " + conta1.getSaldo());
        else
            System.out.println("Fail!");
        if(conta2.sacar(50))
            System.out.println("Success! " + conta2.getSaldo());
        else
            System.out.println("Fail!");

        conta1.depositar(50);
        conta2.depositar(50);
        conta1.getSaldo();
        conta2.getSaldo();

        conta2.conta("Jorge");
        conta1.conta("(you)");


    }
}
