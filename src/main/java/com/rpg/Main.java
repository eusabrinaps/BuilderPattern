package com.rpg;

import com.rpg.modelo.*;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        MagoBuilder magoIniciante = new MagoBuilder("Martin Fowler", Raca.ELFO);
        director.criarMagoIniciante(magoIniciante);
        Personagem mago = magoIniciante.build();

        GuerreiroBuilder guerreiroElite = new GuerreiroBuilder("Linus Torvalds", Raca.MEIO_ORC);
        director.criarGuerreiroElite(guerreiroElite);
        Personagem guerreiro = guerreiroElite.build();

        System.out.println(mago);
        System.out.println(guerreiro);
    }
}
