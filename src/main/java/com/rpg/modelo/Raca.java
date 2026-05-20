package com.rpg.modelo;

public enum Raca {
    HUMANO("Humano", 0, 0, 0),
    ELFO("Elfo", 0, 2, 1),
    ANAO("Anão", 2, 0, 1),
    MEIO_ORC("Meio-Orc", 3, -1, 0),
    HALFLING("Halfling", -1, 1, 2);

    private final String nome;
    private final int bonusForca;
    private final int bonusDestreza;
    private final int bonusConstituicao;

    Raca(String nome, int bonusForça, int bonusDestreza, int bonusConstituicao) {
        this.nome = nome;
        this.bonusForca = bonusForça;
        this.bonusDestreza = bonusDestreza;
        this.bonusConstituicao = bonusConstituicao;
    }

    public String getNome() { return nome; }
    public int getBonusForca() { return bonusForca; }
    public int getBonusDestreza() { return bonusDestreza; }
    public int getBonusConstituicao() { return bonusConstituicao; }
}
