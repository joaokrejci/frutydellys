package com.frutydellys.main;

import com.frutydellys.characters.Inimigo;
import com.frutydellys.characters.Loja;
import com.frutydellys.maps.Locais;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

    }
    void inicializarNPC(){
        inimigos.put("Lobos", new Inimigo("Lobo",20,0,40,10,20,"Um animal de quatros patas,faminto por carne"));
        inimigos.put("Goblins", new Inimigo("Globin",35,15,50,5,40,"Um duende horrendo,quando Deus estava atoa, decidiu criar essa porcaria"));
        inimigos.put("Boneco", new Inimigo("Boneco de treino",0,5,100,0,0,"Um boneco de pano, feito para treinar"));
        inimigos.put("Demonio", new Inimigo("Demonio",50,40,60,30,80,"Uma alma amaldiçoada, obrigada a servir pela eternidade ao rei"));
        inimigos.put("Rei Demonio",new Inimigo("Rei Demonio",100,70,120,50,1000,"O rei do submundo, com uma armadura feita com o saque dos seu inimigos"));
        inimigos.put("Porcos", new Inimigo("Porco",5,0,15,0,5,"Just a porco"));
    }
    void initializelocals() {
        locais.put("Praça", new Locais("Você vê uma bela praça com uma fonte no meio, uma Igreja, uma Loja de equipamentos e um Bar onde lê-se 'Quindecim'",null,null,null, null));
        locais.put("Loja", new Locais("É uma loja meio bagunçada, mas parece que será útil, o mercador parece simpático", null, null, null, null));
        locais.put("Igreja", new Locais("É uma catedral enorme, com belos vitrais e um altar imponente, perto do altar você vê o Padre, ele parece estar te esperando", null, null, null, null));
        locais.put("Campos de Treinamento", new Locais("Saindo da Igreja você se depara com os largos campos de treinamento e os soldados que estão se preparando para possível batalha, você avista o General, um Boneco de Treino e um Soldado de aparência amigável", null, null, null, null));
        locais.put("Bar", new Locais("É um bar meio escuro, que parece maior pelo lado de dentro, você avista algumas figuras estranhas, entre elas, um Elfo de aparência preocupada, um Anão que parece já ter bebido demais e um Barman que parece não ser muito expressivo",null,null,null,null));
        locais.put("Floresta", new Locais("Você está próximo à entrada da Grande Floresta, ela é um pouco escura e parece ficar mais densa quanto mais se adentra, você avista uma Árvore suspeita, um grupo de Lobos e três ramificações a serem seguidas", null,null,null,null));
        locais.put("Ramificação A", new Locais("Você chega à algum tipo de lamaçal, dentro dele há vários Porcos selvagens, eles não parecem atacar",null,null,null,null));
        locais.put("Ramificação B", new Locais("Você sente o cheiro de fumaça e avista uma fogueira, perto dela há dois Goblins, eles parecem sedentos por sangue",null,null,null,null));
        locais.put("Ramificação C", new Locais("Mais adentro da floresta, você se encontra com outro grupo de Lobos",null,null,null,null));
        locais.put("Caverna", new Locais("Seguindo os rastros dos Goblins, você encontra uma caverna, entrando nela você acha um grupo ainda maior de Goblins e no fundo da caverna, uma linda Elfa presa",null,null,null,null));
        locais.put("Batalha Final", new Locais("O exército de Demônios chegou, é hora de acabar com isso de uma vez por todas e provar seu valor", null, null,null,null));
    }
    public HashMap<String, Locais> locais = new HashMap<>();
    public HashMap<String, Inimigo> inimigos = new HashMap<>();


}
