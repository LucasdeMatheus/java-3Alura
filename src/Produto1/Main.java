package br.com.alura.src.Produto1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produto1 p1 = new Produto1(5, "Banana");
        Produto1 p2 = new Produto1(12, "Maçã");
        Produto1 p3 = new Produto1(54, "Abacate");
        Produto1 p4 = new Produto1(8, "Laranja");
        Produto1 p5 = new Produto1(3, "Limão");

        ArrayList<Produto1> Lista = new ArrayList<>();
        Lista.add(p1);
        Lista.add(p2);
        Lista.add(p3);
        Lista.add(p4);
        Lista.add(p5);

        double total = 0;
        int quantidade = 0;

        for (Produto1 p : Lista) {
            total += p.getPreco();
            quantidade++;
        }
        double media = total / quantidade;

        System.out.println("""
                Total: %f
                Quantidade: %d
                média: %f
                """.formatted(total, quantidade, media));
    }
}
