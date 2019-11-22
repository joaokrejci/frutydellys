package com.frutydellys.items;

import com.frutydellys.characters.Heroi;

import java.util.ArrayList;

public class Item  extends Heroi {
    private String nmEquipamento;
    private TipoEquipamentoEnum tipoEquipamento;

    private int magia;
    private int velocidade;
    private int defesa;

    public Item(String nome, float vida, ArrayList<Item> inventario) {
        super(nome, vida, inventario);
    }


    public String getNmEquipamento() {
        return nmEquipamento;

    }

    public void setNmEquipamento(String nmEquipamento) {
        this.nmEquipamento = nmEquipamento;
    }

    public TipoEquipamentoEnum getTipoEquipamento() {
        return tipoEquipamento;
    }

    public void setTipoEquipamento(TipoEquipamentoEnum tipoEquipamento) {
        this.tipoEquipamento = tipoEquipamento;
    }


    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }



    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }



    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }


    /*public class PocaoMagica extends Item(){
        public int escarlarte;//item de vida +50
        public int prateada;//item de foça +8
        public int prateadaPlus;//item de forca +20
        public int HeroiRelutante;//item de dobro de força
        public int CONSTANTINE;//item de reviver
        public int acrobata;//item de velocidade +15
        public int porDoSol;//item de 0 dano;
        public int Oceano;//item de dano de -50 ao inimigo
        public int chamas;//item de dano de -50 ao inimigo
        private int PRECIOSO;//item de sem dano e com perda de vida por contagem de -1 por segundo
        public int beer;//item que pode ser vendido

        public void class escarlate extends PocaoMagica(useItem,nome){


        }
    }*/


}

