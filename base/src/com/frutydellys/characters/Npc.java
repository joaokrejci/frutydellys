package com.frutydellys.characters;

public class Npc {
    private String nome;
    private String descrição;

    public Npc(String nome, String descrição) {
        this.nome = nome;
        this.descrição = descrição;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
}
