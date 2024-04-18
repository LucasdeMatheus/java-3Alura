package br.com.alura.src.Produto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> listaProduto = new ArrayList<>();

        Produto produto1 = new Produto("Chocolate", 25.50);
        produto1.setQuantidade(3);
        listaProduto.add(produto1);

        Produto produto2 = new Produto("Banana", 20);
        produto2.setQuantidade(5);
        listaProduto.add(produto2);

        Produto produto3 = new Produto("Apple", 10);
        produto3.setQuantidade(1);
        listaProduto.add(produto3);

        System.out.println(listaProduto.toString());
        ProdutoPerecivel produto4 = new ProdutoPerecivel("Biscoito", 12.75, "2023-12-31");
        System.out.println(produto4.toString());
    }
}
