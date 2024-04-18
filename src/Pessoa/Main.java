package br.com.alura.src.Pessoa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa P1 = new Pessoa();
        P1.setNome("Lucas");
        P1.setIdade(18);

        Pessoa P2 = new Pessoa();
        P2.setNome("Julio");
        P2.setIdade(19);

        Pessoa P3 = new Pessoa();
        P3.setNome("Maria");
        P3.setIdade(20);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(P1);
        listaDePessoas.add(P2);
        listaDePessoas.add(P3);
        System.out.println(listaDePessoas.get(0).toString());
        System.out.println(listaDePessoas.get(1).toString());
        System.out.println(listaDePessoas.get(2).toString());
        System.out.println(listaDePessoas);
        System.out.println("Tamanho da Lista: " + listaDePessoas.size());
    }
}
