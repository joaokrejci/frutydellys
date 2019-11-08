package com.frutydellys.main;

import com.frutydellys.maps.Local;

import java.util.HashMap;

public class Main {
    public static HashMap<String, Local> locais = new HashMap<>();

    public static void main(String[] args) {
        initializeLocais();
    }

    private static void initializeLocais() {
        locais.put("Praça", new Local("",null,null,null,null));
    }
}
