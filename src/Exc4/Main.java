package br.com.alura.src.Exc4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listNumeros = new ArrayList<>();
        listNumeros.add(7);
        listNumeros.add(5);
        listNumeros.add(11);
        listNumeros.add(9);
        listNumeros.add(6);
        listNumeros.add(10);
        listNumeros.add(8);
        Collections.sort(listNumeros);
        System.out.println(listNumeros);
        System.out.println("\n********************************************\n");

        Titulo titulo1 = new Titulo();
        titulo1.setNome("Seila lá");

        Titulo titulo2 = new Titulo();
        titulo2.setNome("Não sei");

        Titulo titulo3 = new Titulo();
        titulo3.setNome("EU NÃ0 SEI");

        Titulo titulo4 = new Titulo();
        titulo4.setNome("Não faço ideia");

        ArrayList<String> titulos = new ArrayList<>();
        titulos.add(titulo1.getNome());
        titulos.add(titulo2.getNome());
        titulos.add(titulo3.getNome());
        titulos.add(titulo4.getNome());
        Collections.sort(titulos);
        System.out.println(titulos);
        System.out.println("\n********************************************\n");


        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);
    }
}
