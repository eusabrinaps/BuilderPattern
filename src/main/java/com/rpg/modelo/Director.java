package com.rpg.modelo;

public class Director {
    public Personagem criarMagoIniciante(PersonagemBuilder builder, String nome, Raca raca){
        return builder
                .nome(nome)
                .raca(raca)
                .nivel(1)
                .inteligencia(16)
                .sabedoria(13)
                .arma("Cajado")
                .armadura("Túnica de Seda")
                .habilidade("Míssil Mágico")
                .build();
    }

    public Personagem criarMagoElite(PersonagemBuilder builder, String nome, Raca raca) {
        return builder
                .nome(nome)
                .raca(raca)
                .nivel(15)
                .inteligencia(20)
                .sabedoria(16)
                .arma("Bastão Arcano")
                .armadura("Manto de Proteção")
                .habilidade("Bola de Fogo")
                .habilidade("Teletransporte")
                .habilidade("Parar o Tempo")
                .build();
    }

    public Personagem criarGuerreiroIniciante(PersonagemBuilder builder, String nome, Raca raca) {
        return builder
                .nome(nome)
                .raca(raca)
                .nivel(1)
                .forca(16)
                .constituicao(14)
                .destreza(10)
                .arma("Espada Longa")
                .armadura("Cota de Malha")
                .habilidade("Ataque Poderoso")
                .build();
    }

    public Personagem criarGuerreiroElite(PersonagemBuilder builder, String nome, Raca raca) {
        return builder
                .nome(nome)
                .raca(raca)
                .nivel(15)
                .forca(20)
                .constituicao(18)
                .destreza(12)
                .arma("Machado de Guerra Rúnico")
                .armadura("Armadura de Placas")
                .habilidade("Ataque Giratório")
                .habilidade("Brado de Guerra")
                .habilidade("Resistência Inabalável")
                .build();
    }
}
