package com.frutydellys.main;

import com.frutydellys.maps.Locais;

import java.util.Scanner;

import static com.frutydellys.main.Main.locais;

public class Game {
    public static boolean isRunning = true;
    public static Locais localAtual = locais.get("Praça");
    public static Scanner scanner = new Scanner(System.in);
    public static String entryString;
    public static String[] commands;

    static void readCommand(){
        entryString = scanner.next();
        if(entryString == "sair") isRunning = false;
    }

    static void gameLoop(){
        System.out.println("Bem vindo a Frutydellys\n");
        System.out.println(localAtual.getDescricao());

        while(isRunning){
            Game.readCommand();
        }
    }
}
