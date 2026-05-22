package com.rpg.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Personagem {

    private final String nome;
    private final ClassePersonagem classe;
    private final Raca raca;

    private final int nivel;
    private final int forca;
    private final int destreza;
    private final int constituicao;
    private final int inteligencia;
    private final int sabedoria;
    private final int carisma;
    private final int pontosDeVida;
    private final String arma;
    private final String armadura;
    private final List<String> habilidades;
    private final String historia;

    Personagem(String nome, ClassePersonagem classe, Raca raca, int nivel, int forca, int destreza,
                      int constituicao, int inteligencia, int sabedoria, int carisma, int pontosDeVida,
                      String arma, String armadura, List<String> habilidades, String historia) {
        this.nome = nome;
        this.classe = classe;
        this.raca = raca;
        this.nivel = nivel;
        this.forca = forca + raca.getBonusForca();
        this.destreza = destreza + raca.getBonusDestreza();
        this.constituicao = constituicao + raca.getBonusConstituicao();
        this.inteligencia = inteligencia;
        this.sabedoria = sabedoria;
        this.carisma = carisma;
        this.pontosDeVida = pontosDeVida > 0 ? pontosDeVida: calcularPontosDeVida();
        this.arma = arma;
        this.armadura = armadura;
        this.habilidades = List.copyOf(habilidades);
        this.historia = historia;
    }
    private int calcularPontosDeVida() {
        return (constituicao * nivel) + (nivel * 8);
    }
    //    private Personagem(Builder builder) {
//        this.nome = builder.nome;
//        this.classe = builder.classe;
//        this.raca = builder.raca;
//        this.nivel = builder.nivel;
//        this.forca = builder.forca + raca.getBonusForca();
//        this.destreza = builder.destreza + raca.getBonusDestreza();
//        this.constituicao = builder.constituicao + raca.getBonusConstituicao();
//        this.inteligencia = builder.inteligencia;
//        this.sabedoria = builder.sabedoria;
//        this.carisma = builder.carisma;
//        this.pontosDeVida = builder.pontosDeVida > 0 ? builder.pontosDeVida : calcularPontosDeVida();
//        this.arma = builder.arma;
//        this.armadura = builder.armadura;
//        this.habilidades = Collections.unmodifiableList(builder.habilidades);
//        this.historia = builder.historia;
//    }
    public String getNome() { return nome; }
    public ClassePersonagem getClasse() { return classe; }
    public Raca getRaca() { return raca; }
    public int getNivel() { return nivel; }
    public int getForca() { return forca; }
    public int getDestreza() { return destreza; }
    public int getConstituicao() { return constituicao; }
    public int getInteligencia() { return inteligencia; }
    public int getSabedoria() { return sabedoria; }
    public int getCarisma() { return carisma; }
    public int getPontosDeVida() { return pontosDeVida; }
    public String getArma() { return arma; }
    public String getArmadura() { return armadura; }
    public List<String> getHabilidades() { return habilidades; }
    public String getHistoria() { return historia; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.repeat("=", 50).append("\n");
        sb.append("  ").append(nome.toUpperCase()).append("\n");
        sb.repeat("=", 50).append("\n");
        sb.append(String.format("  Raça:   %s%n", raca.getNome()));
        sb.append(String.format("  Classe: %s — %s%n", classe.getNome(), classe.getDescricao()));
        sb.append(String.format("  Nível:  %d%n", nivel));
        sb.repeat("-", 50).append("\n");
        sb.append("  ATRIBUTOS\n");
        sb.append(String.format("  Força:        %d%n", forca));
        sb.append(String.format("  Destreza:     %d%n", destreza));
        sb.append(String.format("  Constituição: %d%n", constituicao));
        sb.append(String.format("  Inteligência: %d%n", inteligencia));
        sb.append(String.format("  Sabedoria:    %d%n", sabedoria));
        sb.append(String.format("  Carisma:      %d%n", carisma));
        sb.append(String.format("  Pontos de Vida: %d%n", pontosDeVida));
        sb.repeat("-", 50).append("\n");
        sb.append("  EQUIPAMENTO\n");
        sb.append(String.format("  Arma:    %s%n", arma != null ? arma : "Nenhuma"));
        sb.append(String.format("  Armadura:%s%n", armadura != null ? armadura : "Nenhuma"));

        if (!habilidades.isEmpty()) {
            sb.repeat("-", 50).append("\n");
            sb.append("  HABILIDADES\n");
            habilidades.forEach(h -> sb.append("  - ").append(h).append("\n"));
        }

        if (historia != null && !historia.isBlank()) {
            sb.repeat("-", 50).append("\n");
            sb.append("  HISTÓRIA\n");
            sb.append("  ").append(historia).append("\n");
        }

        sb.repeat("=", 50);
        return sb.toString();
    }

//    public static class Builder {
//
//        private final String nome;
//        private final ClassePersonagem classe;
//        private final Raca raca;
//
//        private int nivel = 1;
//        private int forca = 10;
//        private int destreza = 10;
//        private int constituicao = 10;
//        private int inteligencia = 10;
//        private int sabedoria = 10;
//        private int carisma = 10;
//        private int pontosDeVida = 0;
//        private String arma = null;
//        private String armadura = null;
//        private final List<String> habilidades = new ArrayList<>();
//        private String historia  = null;
//
//        public Builder(String nome, ClassePersonagem classe, Raca raca) {
//            if (nome == null || nome.isBlank()) {
//                throw new IllegalArgumentException("O personagem precisa de um nome.");
//            }
//            this.nome   = nome;
//            this.classe = classe;
//            this.raca   = raca;
//        }
//
//        public Builder nivel(int nivel) {
//            if (nivel < 1 || nivel > 20) {
//                throw new IllegalArgumentException("Nível deve estar entre 1 e 20.");
//            }
//            this.nivel = nivel;
//            return this;
//        }
//
//        public Builder forca(int forca) {
//            this.forca = forca;
//            return this;
//        }
//
//        public Builder destreza(int destreza) {
//            this.destreza = destreza;
//            return this;
//        }
//
//        public Builder constituicao(int constituicao) {
//            this.constituicao = constituicao;
//            return this;
//        }
//
//        public Builder inteligencia(int inteligencia) {
//            this.inteligencia = inteligencia;
//            return this;
//        }
//
//        public Builder sabedoria(int sabedoria) {
//            this.sabedoria = sabedoria;
//            return this;
//        }
//
//        public Builder carisma(int carisma) {
//            this.carisma = carisma;
//            return this;
//        }
//
//        public Builder pontosDeVida(int pontosDeVida) {
//            this.pontosDeVida = pontosDeVida;
//            return this;
//        }
//
//        public Builder arma(String arma) {
//            this.arma = arma;
//            return this;
//        }
//
//        public Builder armadura(String armadura) {
//            this.armadura = armadura;
//            return this;
//        }
//
//        public Builder habilidade(String habilidade) {
//            this.habilidades.add(habilidade);
//            return this;
//        }
//
//        public Builder historia(String historia) {
//            this.historia = historia;
//            return this;
//        }
//
//        public Personagem build() {
//            return new Personagem(this);
//        }
//    }
}
