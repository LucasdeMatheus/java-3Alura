package br.com.alura.src.Modelo;

public abstract class Titulo implements Comparable<Titulo>{
        private String nome;
        private int anoDeLancamento;
        private boolean incluidoNoPlano;
        private double somaDasAvaliações;
        private int totalDeAvaliacoes;
        private int duracaoEmMinutos;

        public Titulo(String nome, int anoDeLancamento) {
            this.nome = nome;
            this.anoDeLancamento = anoDeLancamento;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setAnoDeLancamento(int anoDeLancamento) {
            this.anoDeLancamento = anoDeLancamento;
        }

        public void setIncluidoNoPlano(boolean incluidoNoPlano) {
            this.incluidoNoPlano = incluidoNoPlano;
        }

        public void setSomaDasAvaliações(double somaDasAvaliações) {
            this.somaDasAvaliações = somaDasAvaliações;
        }

        public void setDuracaoEmMinutos(int duracaoEmMinutos) {
            this.duracaoEmMinutos = duracaoEmMinutos;
        }

        public void avalia(double nota){
            somaDasAvaliações += nota;
            totalDeAvaliacoes++;;
        }

        public String getNome() {
            return nome;
        }

        public int getAnoDeLancamento() {
            return anoDeLancamento;
        }

        public boolean isIncluidoNoPlano() {
            return incluidoNoPlano;
        }

        public double getSomaDasAvaliações() {
            return somaDasAvaliações;
        }

        public int getTotalDeAvaliacoes() {
            return totalDeAvaliacoes;
        }

        public int getDuracaoEmMinutos() {
            return duracaoEmMinutos;
        }

        public double pegaMedia(){
            return  somaDasAvaliações / totalDeAvaliacoes;
        }

        public abstract int getClassificacao();

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
