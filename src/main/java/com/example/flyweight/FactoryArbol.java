package com.example.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FactoryArbol {
    private static Map<String, TipoArbol> arbolesPorTipo = new HashMap<>();

    public static TipoArbol getTipoArbol(String nombre, String color, String textura) {
        if (!arbolesPorTipo.containsKey(nombre)) {
            System.out.println("Creando árbol... llamado...: " + nombre);
            arbolesPorTipo.put(nombre, new TipoArbol(nombre, color, textura));
        }
        return arbolesPorTipo.get(nombre);
    }
}
