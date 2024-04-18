package br.com.alura.src.Exc1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Redes whatsapp = new Redes();
        whatsapp.setRedesocial("Whatsapp");

        Redes facebook = new Redes();
        facebook.setRedesocial("Facebook");

        Redes instagram = new Redes();
        instagram.setRedesocial("Instagram");

        ArrayList<Redes> listaStrings = new ArrayList<>();
        listaStrings.add(whatsapp);
        listaStrings.add(facebook);
        listaStrings.add(instagram);

        for (Redes rede : listaStrings) {
            System.out.println(rede.getRedesocial());
        }
    }

}
