package com.frutydellys.characters;
import com.frutydellys.items.Item;
import com.frutydellys.items.TipoEquipamentoEnum;

import java.util.ArrayList;

public class Loja {
    protected String nome;
    protected ArrayList<Item> estoque;
    private TipoEquipamentoEnum tipo;

    public Loja(String nome, ArrayList<Item> estoque, TipoEquipamentoEnum tipo) {
        this.nome = nome;
        this.estoque = estoque;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Item> getEstoque() {
        return estoque;
    }
    public void setEstoque(Item itens) {
        estoque.add(itens);
    }
    public ArrayList<Item> retornarItem(){

        switch(tipo){
            case ARMA :System.out.println();
        }
        return null;
    }
}
