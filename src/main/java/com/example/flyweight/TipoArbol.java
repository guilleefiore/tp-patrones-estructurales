package com.example.flyweight;

public class TipoArbol {
    String tipo;
    String color;
    String textura;

    public TipoArbol(String tipo, String color, String textura) {
        this.tipo = tipo;
        this.color = color;
        this.textura = textura;
    }

    public void dibujar(float x, float y) {
        System.out.printf("  %-10s | %-13s | %-9s | (%4.0f,%4.0f)%n",
                this.tipo, this.color, this.textura, x, y);
    }
}
