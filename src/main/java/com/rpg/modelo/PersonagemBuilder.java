package com.rpg.modelo;

public interface PersonagemBuilder {
    PersonagemBuilder nivel (int nivel);
    PersonagemBuilder forca (int forca);
    PersonagemBuilder destreza (int destreza);
    PersonagemBuilder constituicao (int constituicao);
    PersonagemBuilder inteligencia (int inteligencia);
    PersonagemBuilder sabedoria (int sabedoria);
    PersonagemBuilder carisma (int carisma);
    PersonagemBuilder pontosDeVida (int pontosDeVida);
    PersonagemBuilder arma (String arma);
    PersonagemBuilder armadura (String armadura);
    PersonagemBuilder habilidade (String habilidade);
    PersonagemBuilder historia (String historia);
}
