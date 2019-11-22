package com.frutydellys.items;

public class Arma extends Item {
    int forca;
    int defesa;

    public Arma(String nome, TipoEquipamentoEnum tipoEquipamento, int forca, int defesa) {
        this.defesa = defesa;
        this.forca = forca;

    }
}