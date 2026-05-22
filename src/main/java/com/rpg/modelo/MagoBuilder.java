package com.rpg.modelo;

import java.util.ArrayList;
import java.util.List;

public class MagoBuilder implements PersonagemBuilder{
    private String nome;
    private Raca raca;
    private int nivel;
    private int forca;
    private int destreza;
    private int constituicao;
    private int inteligencia;
    private int sabedoria;
    private int carisma;
    private int pontosDeVida;
    private String arma;
    private String armadura;
    private final List<String> habilidades = new ArrayList<>();
    private String historia;

    @Override
    public PersonagemBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public PersonagemBuilder raca(Raca raca) {
        this.raca = raca;
        return this;
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

    @Override
    public Personagem build() {
        return new Personagem(nome, ClassePersonagem.MAGO, raca, nivel, forca, destreza, constituicao,
                inteligencia, sabedoria, carisma, pontosDeVida, arma, armadura,habilidades, historia);
    }
}
