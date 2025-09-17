package com.example.composite;

// Archivo: Plato.java
public class Plato implements ElementoMenu {
    private String nombre;
    private double precio;

    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public Void mostrar() {
        // Implementación específica para un plato individual.
        System.out.println("  - Plato: " + nombre + " | Precio: $" + precio);

        return null;
    }
}
