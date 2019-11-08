package com.frutydellys.maps;

public class Locais {
    String descricao;
    String itens[];
    String inimigos[];
    String npc[];
    String saidas[];

    public Locais(String descricao, String[] itens, String[] inimigos, String[] npc, String[] saidas) {
        this.descricao = descricao;
        this.itens = itens;
        this.inimigos = inimigos;
        this.npc = npc;
        this.saidas = saidas;
    }

    public String getDescricao() {
        return descricao;
    }

}
