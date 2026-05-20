package com.rpg.modelo;

public enum ClassePersonagem {
    GUERREIRO("Guerreiro", "Mestre do combate corpo a corpo"),
    MAGO("Mago", "Manipulador das artes arcanas"),
    LADINO("Ladino", "Especialista em furtividade e trapaças"),
    PALADINO("Paladino", "Guerreiro sagrado guiado pela luz divina"),
    ARQUEIRO("Arqueiro", "Atirador preciso das florestas");

    private final String nome;
    private final String descricao;

    ClassePersonagem(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
}
