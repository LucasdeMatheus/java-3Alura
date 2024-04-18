package br.com.alura.src.ContaBancaria;

public class ContaBancaria {
    private int númeroDaConta;
    private double saldo;

    public int getNúmeroDaConta() {
        return númeroDaConta;
    }

    public void setNúmeroDaConta(int númeroDaConta) {
        this.númeroDaConta = númeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(int númeroDaConta, double saldo) {
        this.númeroDaConta = númeroDaConta;
        this.saldo = saldo;
    }
}
