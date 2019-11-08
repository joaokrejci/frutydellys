package com.frutydellys.maps;

import com.frutydellys.characters.Inimigo;
import com.frutydellys.characters.Npc;
import com.frutydellys.items.Item;

public class Local {
    String descricao;
    Item[] itens;
    Inimigo[] inimigos;
    Npc[] npc;
    Local[] saidas;

    public Local(String descricao, Item[] itens, Inimigo[] inimigos, Npc[] npc, Local[] saidas) {
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
