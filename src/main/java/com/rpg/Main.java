package com.rpg;

import com.rpg.modelo.ClassePersonagem;
import com.rpg.modelo.Personagem;
import com.rpg.modelo.Raca;

public class Main {

    public static void main(String[] args) {

        Personagem guerreiro = new Personagem.Builder("Thorin Pedraferro", ClassePersonagem.GUERREIRO, Raca.ANAO)
                .nivel(5)
                .forca(16)
                .destreza(10)
                .constituicao(14)
                .inteligencia(8)
                .sabedoria(12)
                .carisma(10)
                .arma("Machado de Guerra Rúnico")
                .armadura("Armadura de Placas de Mitril")
                .habilidade("Ataque Giratório")
                .habilidade("Brado de Guerra")
                .habilidade("Resistência Anã")
                .historia("Filho de mineiros, Thorin jurou proteger seu clã após um ataque de trolls devastar sua aldeia.")
                .build();

        Personagem mago = new Personagem.Builder("Elariel", ClassePersonagem.MAGO, Raca.ELFO)
                .build();

        Personagem ladino = new Personagem.Builder("Pip Bolseiro", ClassePersonagem.LADINO, Raca.HALFLING)
                .nivel(8)
                .destreza(18)
                .carisma(14)
                .arma("Adaga Envenenada")
                .armadura("Gibão de Couro")
                .habilidade("Ataque Furtivo")
                .habilidade("Evasão")
                .build();

        System.out.println(guerreiro);
        System.out.println();
        System.out.println(mago);
        System.out.println();
        System.out.println(ladino);
    }
}
