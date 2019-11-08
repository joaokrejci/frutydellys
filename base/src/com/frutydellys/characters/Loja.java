package com.frutydellys.characters;
import com.frutydellys.items.Item;
import java.util.ArrayList;

public class Loja {
    private String nome;
    private ArrayList<Item> estoque;

    public Loja(String nome, ArrayList<Item> estoque) {
        this.nome = nome;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Item> getEstoque() {
        return estoque;
    }
}
