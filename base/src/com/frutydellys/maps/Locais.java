package com.frutydellys.maps;

import com.frutydellys.characters.Inimigo;
import com.frutydellys.characters.Npc;
import com.frutydellys.items.Item;

public class Locais {
    String descricao;
    Item[] itens;
    Inimigo[] inimigos;
    Npc[] npc;
    Locais[] saidas;

    public Locais(String descricao, Item[] itens, Inimigo[] inimigos, Npc[] npc, Locais[] saidas) {
        this.descricao = descricao;
        this.itens = itens;
        this.inimigos = inimigos;
        this.npc = npc;
        this.saidas = saidas;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }

    public Inimigo[] getInimigos() {
        return inimigos;
    }

    public void setInimigos(Inimigo[] inimigos) {
        this.inimigos = inimigos;
    }

    public Npc[] getNpc() {
        return npc;
    }

    public void setNpc(Npc[] npc) {
        this.npc = npc;
    }

    public Locais[] getSaidas() {
        return saidas;
    }

    public void setSaidas(Locais[] saidas) {
        this.saidas = saidas;
    }

    public String getDescricao() {
        return descricao;
    }

}
