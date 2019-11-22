package com.frutydellys.items;

public class Pocao extends Item {
    int forca;
    int vida;
    int defesa;

    public Pocao(String nome,TipoEquipamentoEnum tipoEquipamento, int forca, int vida , int defesa){
        this.defesa = defesa;
        this.forca = forca;
        this.vida = vida;

    }
}
