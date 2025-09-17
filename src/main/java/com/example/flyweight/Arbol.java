package com.example.flyweight;

public class Arbol {
    private final float x;
    private final float y;
    private final TipoArbol tipo;

    public Arbol(float x, float y, TipoArbol tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    public void dibujar() {
        tipo.dibujar(x, y);
    }
}
