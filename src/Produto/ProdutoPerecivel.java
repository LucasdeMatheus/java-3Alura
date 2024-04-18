package br.com.alura.src.Produto;

public class ProdutoPerecivel extends Produto {
    private String dataValidade;
    public ProdutoPerecivel(String nome, double preco, String dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "ProdutoPerecivel{" +
                "dataValidade='" + dataValidade + '\'' +
                '}';
    }
}
