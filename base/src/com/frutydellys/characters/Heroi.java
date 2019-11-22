package com.frutydellys.characters;
import com.frutydellys.items.Item;
import java.util.ArrayList;

public class Heroi {
    private String nome ;
    private enum  Classe{GUERREIRO,MAGO,PISTOLEIRO,PALADINO,LADRAO}
    private Classe classe;
    private float vida;
    private float defesa;
    private float ataque;
    private float velocidade;
    private float gold;

    private ArrayList<Item> inventario;

    public Heroi(String nome, float vida, ArrayList<Item> inventario) {
        this.nome = nome;
        this.vida = vida;
        this.inventario = inventario; //Itens iniciais, espada de madeira e capacete//
    }

    public String getNome() {
        return nome;
    }
    public float getVelocidade(){
        return velocidade;
    }

    public Classe getClasse() {
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


    public ArrayList<Item> getInventario() {
        return inventario;
    }

    public void setClasse(Classe classe) {
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

    public void setVelocidade(float velocidade){
        this.velocidade = velocidade;
    }

    public void setGold(float gold) {
        this.gold += gold;
    }

    public void adicionarItem(Item a) {
        inventario.add(a);
    }
    public void removerItem(Item a){
        inventario.remove(a);
    }
    public void ataqueHeroi(Inimigo b){
        if (b.getDefesa() >= ataque )
            System.out.println("O "+ nome +" acerta porém é muito fraco, seu merdinha!");
        else
            System.out.println("O Herói causa "+ b.receberAtaque(ataque)+" de dano!");

    }
    public void defesaHeroi(Inimigo b){
        if (defesa >= b.getAtaque())
            System.out.println("Inimigo é fraco demais para causar dano");
        else
            setVida(vida - (b.getAtaque()-defesa));
            System.out.println(nome+" recebe "+(b.getAtaque()-defesa)+" de dano");
    }
//    public float recebeAtaque(){
//
//    }
}

