package br.com.alura.src.Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cachorro();

        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            System.out.println(cachorro);
        }
    }
}
