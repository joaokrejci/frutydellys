package com.frutydellys.characters;

public class Inimigo {
    private String nome;
    private float ataque;
    private float defesa;
    private float vida;
    private float agilidade;
    private float gold;
    private String descricao;

    public Inimigo(String nome, float ataque, float defesa, float vida, float agilidade, float gold, String descricao) {
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
        this.vida = vida;
        this.agilidade = agilidade;
        this.gold = gold;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public float getAtaque() {
        return ataque;
    }

    public float getDefesa() {
        return defesa;
    }

    public float getVida() {
        return vida;
    }

    public float getAgilidade() {
        return agilidade;
    }

    public float getGold() {
        return gold;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }
}
