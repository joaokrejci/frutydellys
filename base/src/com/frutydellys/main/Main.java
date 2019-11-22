package com.frutydellys.main;

import com.frutydellys.characters.Loja;
import com.frutydellys.maps.Locais;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        initializelocals();
    }
    static void initializelocals() {
        locais.put("Praça", new Locais("Você vê uma bela praça com uma fonte no meio, uma Igreja, uma Loja de equipamentos e um Bar onde lê-se 'Quindecim'",null,null,null, new Locais[5]));
        locais.put("Loja", new Locais("É uma loja meio bagunçada, mas parece que será útil, o mercador parece simpático", null, null, null, new Locais[1]));
        locais.put("Igreja", new Locais("É uma catedral enorme, com belos vitrais e um altar imponente, perto do altar você vê o Padre, ele parece estar te esperando", null, null, null, new Locais[2]));
        locais.put("Campos de Treinamento", new Locais("Saindo da Igreja você se depara com os largos campos de treinamento e os soldados que estão se preparando para possível batalha, você avista o General, um Boneco de Treino e um Soldado de aparência amigável", null, null, null, new Locais[1]));
        locais.put("Bar", new Locais("É um bar meio escuro, que parece maior pelo lado de dentro, você avista algumas figuras estranhas, entre elas, um Elfo de aparência preocupada, um Anão que parece já ter bebido demais e um Barman que parece não ser muito expressivo",null,null,null, new Locais[1]));
        locais.put("Floresta", new Locais("Você está próximo à entrada da Grande Floresta, ela é um pouco escura e parece ficar mais densa quanto mais se adentra, você avista uma Árvore suspeita, um grupo de Lobos e três ramificações a serem seguidas", null,null,null, new Locais[4]));
        locais.put("Ramificação A", new Locais("Você chega à algum tipo de lamaçal, dentro dele há vários Porcos selvagens, eles não parecem atacar",null,null,null, new Locais[2]));
        locais.put("Ramificação B", new Locais("Você sente o cheiro de fumaça e avista uma fogueira, perto dela há dois Goblins, eles parecem sedentos por sangue",null,null,null, new Locais[4]));
        locais.put("Ramificação C", new Locais("Mais adentro da floresta, você se encontra com outro grupo de Lobos",null,null,null, new Locais[2]));
        locais.put("Caverna", new Locais("Seguindo os rastros dos Goblins, você encontra uma caverna, entrando nela você acha um grupo ainda maior de Goblins e no fundo da caverna, uma linda Elfa presa",null,null,null,new Locais[1]));
        locais.put("Batalha Final", new Locais("O exército de Demônios chegou, é hora de acabar com isso de uma vez por todas e provar seu valor", null, null,null,null));

        locais.get("Praça").setSaidas(new Locais[]{locais.get("Bar"),locais.get("Igreja"),locais.get("Loja"),locais.get("Floresta"),locais.get("Batalha Final")});
        locais.get("Loja").setSaidas(new Locais[]{locais.get("Praça")});
        locais.get("Igreja").setSaidas(new Locais[]{locais.get("Praça"), locais.get("Campos de Treinamento")});
        locais.get("Campos de Treinamento").setSaidas(new Locais[]{locais.get("Igreja")});
        locais.get("Bar").setSaidas(new Locais[]{locais.get("Praça")});
        locais.get("Floresta").setSaidas(new Locais[]{locais.get("Praça"),locais.get("Ramificação A"),locais.get("Ramificação B"),locais.get("Ramificação C")});
        locais.get("Ramificação A").setSaidas(new Locais[]{locais.get("Floresta"),locais.get("Ramificação B")});
        locais.get("Ramificação B").setSaidas(new Locais[]{locais.get("Floresta"),locais.get("Ramificação A"),locais.get("Ramificação C"),locais.get("Caverna")});
        locais.get("Ramificação C").setSaidas(new Locais[]{locais.get("Floresta"),locais.get("Ramificação B")});
        locais.get("Caverna").setSaidas(new Locais[]{locais.get("Ramificação B")});
        locais.get("Batalha Final").setSaidas(null);
    }
    public static HashMap<String, Locais> locais = new HashMap<>();


}
