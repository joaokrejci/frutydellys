package com.frutydellys.characters;
import com.frutydellys.items.Item;
import java.util.ArrayList;

public class Heroi {
    private String nome ;
    private enum  classe{guerreiro,mago,pistoleiro,paladino,ladrão};
    private classe classe;
    private float vida = 100;
    private float defesa;
    private float ataque;
    private float agilidade;
    private float gold;
    private float mana;
    private ArrayList<Item> inventário;

    public Heroi(String nome, float vida, ArrayList<Item> inventário) {
        this.nome = nome;
        this.vida = vida;
        this.inventário = inventário; //Itens iniciais, espada de madeira e capacete//
    }

    public String getNome() {
        return nome;
    }
    public Float getAgilidade(){
        return agilidade;
    }

    public Heroi.classe getClasse() {
        return classe;
    }

    public float getVida() {
        return vida;
    }

    public float getDefesa() {
        return defesa;
    }

    public float getAtaque() {
        return ataque;
    }

    public float getGold() {
        return gold;
    }

    public float getMana() {
        return mana;
    }

    public ArrayList<Item> getInventário() {
        return inventário;
    }

    public void setClasse(Heroi.classe classe) {
        this.classe = classe;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }

    public void setDefesa(float defesa) {
        this.defesa = defesa;
    }

    public void setAtaque(float ataque) {
        this.ataque = ataque;
    }

    public void setAgilidade(float agilidade){
        this.agilidade = agilidade;
    }

    public void setGold(float gold) {
        this.gold = gold + this.gold;
    }

    public void setMana(float mana) {
        this.mana = mana;
    }

    public void adicioarItem(Item a) {
        inventário.add(a);
    }
    public void removerItem(Item a){
        inventário.remove(a);
    }
    public void ataqueHeroi(Inimigos b){
        if (b.getDefesa() >= getAtaque() )
            System.out.println("O"+ this.nome +"acerta porém é muito fraco, seu merdinha!");
        else
            b.setVida(b.getVida() - (getAtaque() - b.getDefesa()));
            System.out.println("O Herói causa "+(getAtaque() - b.getDefesa())+" de dano!");

    }
    public void defesaHeroi(Inimigos b){
        if (getDefesa() >= b.getAtaque())
            System.out.println("Inimigo é fraco demais para causar dano");
        else
            setVida(getVida() - (b.getAtaque()-getDefesa()));
            System.out.println(this.nome+" recebe "+(b.getAtaque()-getDefesa())+" de dano");
    }

}

