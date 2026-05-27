package com.rpg.modelo;

import java.util.ArrayList;
import java.util.List;

public class GuerreiroBuilder implements PersonagemBuilder {
    private final String nome;
    private final Raca raca;
    private int nivel = 1;
    private int forca = 16;
    private int destreza = 10;
    private int constituicao = 14;
    private int inteligencia = 8;
    private int sabedoria = 10;
    private int carisma = 10;
    private int pontosDeVida = 0;
    private String arma;
    private String armadura;
    private List<String> habilidades = new ArrayList<>();
    private String historia;

    public GuerreiroBuilder(String nome, Raca raca) {
        this.nome = nome;
        this.raca = raca;
    }

    @Override
    public PersonagemBuilder nivel(int nivel) {
        this.nivel = nivel;
        return this;
    }

    @Override
    public PersonagemBuilder forca(int forca) {
        this.forca = forca;
        return this;
    }

    @Override
    public PersonagemBuilder destreza(int destreza) {
        this.destreza = destreza;
        return this;
    }

    @Override
    public PersonagemBuilder constituicao(int constituicao) {
        this.constituicao = constituicao;
        return this;
    }

    @Override
    public PersonagemBuilder inteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
        return this;
    }

    @Override
    public PersonagemBuilder sabedoria(int sabedoria) {
        this.sabedoria = sabedoria;
        return this;
    }

    @Override
    public PersonagemBuilder carisma(int carisma) {
        this.carisma = carisma;
        return this;
    }

    @Override
    public PersonagemBuilder pontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
        return this;
    }

    @Override
    public PersonagemBuilder arma(String arma) {
        this.arma = arma;
        return this;
    }

    @Override
    public PersonagemBuilder armadura(String armadura) {
        this.armadura = armadura;
        return this;
    }

    @Override
    public PersonagemBuilder habilidade(String habilidade) {
        this.habilidades.add(habilidade);
        return this;
    }

    @Override
    public PersonagemBuilder historia(String historia) {
        this.historia = historia;
        return this;
    }

    public Personagem build() {
        Personagem personagem = new Personagem(nome, ClassePersonagem.GUERREIRO, raca, nivel, forca, destreza,
                constituicao, inteligencia, sabedoria, carisma, pontosDeVida, arma, armadura, habilidades, historia);
        reset();
        return personagem;
    }

    private void reset() {
        nivel = 1;
        forca = 16;
        destreza = 10;
        constituicao = 14;
        inteligencia = 8;
        sabedoria = 10;
        carisma = 10;
        pontosDeVida = 0;
        arma = null;
        armadura = null;
        habilidades = new ArrayList<>();
        historia = null;
    }
}
