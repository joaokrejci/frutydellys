package com.frutydellys.main;

import com.frutydellys.maps.Locais;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

    }
    void initializelocals() {
        locais.put("Praça", new Locais("",null,null,null,null));

    }
    public HashMap<String, Locais> locais = new HashMap<>();


}
