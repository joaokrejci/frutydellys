package com.frutydellys.main;

import com.frutydellys.characters.Inimigo;
import com.frutydellys.characters.Loja;
import com.frutydellys.characters.Npc;
import com.frutydellys.items.Item;
import com.frutydellys.maps.Locais;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        initializelocals();

        Game.gameLoop();
    }
    static void initializelocals() {
        locais.put("Praça", new Locais("Você vê uma bela praça com uma fonte no meio, uma Igreja, uma Loja de equipamentos e um Bar onde lê-se 'Quindecim'",null,null,null, new Locais[5]));
        locais.put("Loja", new Locais("É uma loja meio bagunçada, mas parece que será útil, o mercador parece simpático", null, null, new Npc[1], new Locais[1]));
        locais.put("Igreja", new Locais("É uma catedral enorme, com belos vitrais e um altar imponente, perto do altar você vê o Padre, ele parece estar te esperando", null, null, new Npc[1], new Locais[2]));
        locais.put("Campos de Treinamento", new Locais("Saindo da Igreja você se depara com os largos campos de treinamento e os soldados que estão se preparando para possível batalha, você avista o General, um Boneco de Treino e um Soldado de aparência amigável", null, new Inimigo[1], new Npc[2], new Locais[1]));
        locais.put("Bar", new Locais("É um bar meio escuro, que parece maior pelo lado de dentro, você avista algumas figuras estranhas, entre elas, um Elfo de aparência preocupada, um Anão que parece já ter bebido demais e um Barman que parece não ser muito expressivo",null,null,new Npc[3], new Locais[1]));
        locais.put("Floresta", new Locais("Você está próximo à entrada da Grande Floresta, ela é um pouco escura e parece ficar mais densa quanto mais se adentra, você avista uma Árvore suspeita, um grupo de Lobos e três ramificações a serem seguidas", new Item[1], new Inimigo[3],null, new Locais[4]));
        locais.put("Ramificação A", new Locais("Você chega à algum tipo de lamaçal, dentro dele há vários Porcos selvagens, eles não parecem atacar",null, new Inimigo[5],null, new Locais[2]));
        locais.put("Ramificação B", new Locais("Você sente o cheiro de fumaça e avista uma fogueira, perto dela há dois Goblins, eles parecem sedentos por sangue",null, new Inimigo[2],null, new Locais[4]));
        locais.put("Ramificação C", new Locais("Mais adentro da floresta, você se encontra com um grupo maior de Lobos",null,new Inimigo[5],null, new Locais[2]));
        locais.put("Caverna", new Locais("Seguindo os rastros dos Goblins, você encontra uma caverna, entrando nela você acha um grupo de Goblins e no fundo da caverna, uma linda Elfa presa",null, new Inimigo[6],new Npc[1], new Locais[1]));
        locais.put("Batalha Final", new Locais("O exército de Demônios chegou, é hora de acabar com isso de uma vez por todas e provar seu valor", null, new Inimigo[15],null,null));

        locais.get("Praça").setSaidas(new Locais[]{locais.get("Bar"),locais.get("Igreja"),locais.get("Loja"),locais.get("Floresta"),locais.get("Batalha Final")});
        locais.get("Loja").setSaidas(new Locais[]{locais.get("Praça")});
        //locais.get("Loja").setNpc();
        locais.get("Igreja").setSaidas(new Locais[]{locais.get("Praça"), locais.get("Campos de Treinamento")});
        //locais.get("Igreja").setNpc();
        locais.get("Campos de Treinamento").setSaidas(new Locais[]{locais.get("Igreja")});
        locais.get("Campos de Treinamento").setNpc(new Npc[]{});
        locais.get("Campos de Treinamento").setInimigos(new Inimigo[]{new Inimigo("Boneco", 0, 100, 1, 0, 0, "Só um saco de pancadas", null)});
        locais.get("Bar").setSaidas(new Locais[]{locais.get("Praça")});
        locais.get("Bar").setNpc(new Npc[]{});
        locais.get("Floresta").setSaidas(new Locais[]{locais.get("Praça"),locais.get("Ramificação A"),locais.get("Ramificação B"),locais.get("Ramificação C")});
        Inimigo lobo = new Inimigo("Lobo", 10, 2,25,5,10, "Lobo selvagem", null/*List.of(new Item("Pele de lobo", null))*/ );
        locais.get("Floresta").setInimigos(new Inimigo[]{lobo, lobo, lobo});
        locais.get("Ramificação A").setSaidas(new Locais[]{locais.get("Floresta"),locais.get("Ramificação B")});
        Inimigo porco = new Inimigo("Porco", 0, 0, 20, 1, 5, "A barriga dele é gostosa", null);
        locais.get("Ramificação A").setInimigos(new Inimigo[]{porco, porco, porco, porco, porco});
        locais.get("Ramificação B").setSaidas(new Locais[]{locais.get("Floresta"),locais.get("Ramificação A"),locais.get("Ramificação C"),locais.get("Caverna")});
        Inimigo goblin = new Inimigo("Goblin", 20, 5, 50, 3, 20, "Criatura maligna", null);
        locais.get("Ramificação B").setInimigos(new Inimigo[]{goblin, goblin});
        locais.get("Ramificação C").setSaidas(new Locais[]{locais.get("Floresta"),locais.get("Ramificação B")});
        locais.get("Ramificação C").setInimigos(new Inimigo[]{lobo, lobo, lobo, lobo, lobo});
        locais.get("Caverna").setSaidas(new Locais[]{locais.get("Ramificação B")});
        //locais.get("Caverna").setNpc();
        locais.get("Caverna").setInimigos(new Inimigo[]{goblin, goblin, goblin, goblin, goblin});
        Inimigo solDemonio = new Inimigo("Soldado Demônio", 30, 10, 80, 5, 0, "Um soldado do Rei Demônio", null);
        Inimigo reiDemônio = new Inimigo("Rei Demônio", 50, 20,300, 10,100000, "Quem diria que a batalha final seria contra seu próprio pai?",null);
        locais.get("Batalha Final").setInimigos(new Inimigo[]{solDemonio, solDemonio, solDemonio, solDemonio, solDemonio, solDemonio, solDemonio, solDemonio, solDemonio, solDemonio, solDemonio, solDemonio, solDemonio, solDemonio, reiDemônio});
    }
    public static HashMap<String, Locais> locais = new HashMap<>();


}
