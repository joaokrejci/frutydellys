package com.frutydellys.ui;

import java.util.Scanner;

/*
    Classe responsável pelos Menus
*/
public class Menus {
    Scanner sc = new Scanner(System.in);
    private int mp, mj, pause;
    public void menuPrincipal() {
        System.out.println("==============================");
        System.out.println("|         FRUTYDELLYS        |");
        System.out.println("==============================");
        System.out.println("| [1] Iniciar jogo           |");
        System.out.println("| [2] Sair do jogo           |");
        System.out.println("==============================");
        System.out.print(" >>> ");
        mp = sc.nextInt();
        while ((mp != 1) && (mp != 2)) {
            System.out.print(" >>> ");
            mp = sc.nextInt();
        }
    }
    public int getMp() {
        return mp;
    }
    public void setMp(int mp) {
        this.mp = mp;
    }

    public void menuInicioJogo() {
        System.out.println("=========Iniciar jogo=========");
        System.out.println("| [1] Jogar                  |");
        System.out.println("| [2] Mapa                   |");
        System.out.println("| [3] Ajuda                  |");
        System.out.println("| [4] Sair                   |");
        System.out.println("==============================");
        System.out.println(" >>> ");
        mj = sc.nextInt();
        while (mj < 1 || mj > 4) {
            System.out.print(" >>> ");
            mj = sc.nextInt();
        }
    }
    public int getMj() {
        return mj;
    }
    public void setMj(int mj) {
        this.mj = mj;
    }

    public void menuPause() {
        System.out.println("============Pausa=============");
        System.out.println("| [1] Voltar                 |");
        System.out.println("| [2] Mapa                   |");
        System.out.println("| [3] Sair                   |");
        System.out.println("==============================");
        System.out.println(" >>> ");
        pause = sc.nextInt();
        while (pause < 1 || pause > 3) {
            System.out.print(" >>> ");
            pause = sc.nextInt();
        }
    }
}

