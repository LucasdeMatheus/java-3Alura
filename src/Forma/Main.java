package br.com.alura.src.Forma;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setRaio(9);

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(5);

        // Lista de formas
        ArrayList<Forma> lista = new ArrayList<>();
        lista.add(circulo);
        lista.add(quadrado);

        // Calcular e imprimir a área de cada forma
        for (Forma forma : lista) {
            System.out.println(forma.calcularArea());
        }
    }
}
