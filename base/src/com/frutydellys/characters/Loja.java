package com.frutydellys.characters;
import com.frutydellys.items.Item;
import java.util.ArrayList;

public class Loja {
    protected String nome;
    protected ArrayList<Item> estoque;
    private Item.tipoEquipamentoEnum tipo;

    public Loja(String nome, ArrayList<Item> estoque, tipoEquipamentoEnum tipo) {
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
            Case ARMA :System.out.println();
        }

    }
}
