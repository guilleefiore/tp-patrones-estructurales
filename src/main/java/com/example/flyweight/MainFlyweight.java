package com.example.flyweight;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.*;

public class MainFlyweight {
    public static void main(String[] args) {
        List<Arbol> arboles = new ArrayList<>();
        int nroArboles = 1_000_000;

        String[] nombres = {"Pino", "Roble", "Abedul"};
        String[] colores = {"Marrón", "Marrón Claro", "Blanco"};
        String[] texturas = {"Rugosa", "Lisa", "Manchada"};

        Random rand = new Random();

        for (int i = 0; i < nroArboles; i++) {
            int tipoIndex = rand.nextInt(nombres.length);
            TipoArbol tipoArbol = FactoryArbol.getTipoArbol(
                    nombres[tipoIndex], colores[tipoIndex], texturas[tipoIndex]);

            int x = rand.nextInt(1000);
            int y = rand.nextInt(1000);

            Arbol arbol = new Arbol(x, y, tipoArbol);
            arboles.add(arbol);
        }

        // Cantidad de árboles creados
        NumberFormat nf = NumberFormat.getIntegerInstance(new Locale("es", "AR"));
        System.out.println("Árboles creados (contexto): " + nf.format(arboles.size()));

        // Ejemplos de árboles creados
        for (int i = 0; i < 10; i++) {
            arboles.get(i).dibujar();
        }
    }
}
