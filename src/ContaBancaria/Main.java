package br.com.alura.src.ContaBancaria;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1001, 1500.0);
        ContaBancaria conta2 = new ContaBancaria(1002, 2000.0);
        ContaBancaria conta3 = new ContaBancaria(1003, 3000.0);
        ContaBancaria conta4 = new ContaBancaria(1004, 2500.0);
        ContaBancaria conta5 = new ContaBancaria(1005, 3500.0);

        ArrayList<ContaBancaria> Lista = new ArrayList<>();
        Lista.add(conta1);
        Lista.add(conta2);
        Lista.add(conta3);
        Lista.add(conta4);
        Lista.add(conta5);

        ContaBancaria maior = Lista.get(0);
        for(ContaBancaria saldo : Lista){
            if(saldo.getSaldo() >= maior.getSaldo()){
                maior = saldo;
            }
        }
        System.out.println("saldo: " + maior.getSaldo() + "\nnumero da conta: " + maior.getNúmeroDaConta());

    }
}
