package com.frutydellys.ui;


import java.util.Scanner;

public class Menus {
    private int mp;
    public void menuPrincipal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("==========Frutydellys=========");
        System.out.println(" [1] Iniciar");
        System.out.println(" [2] Sair");
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

}

