package com.example.proxy;

public class ArchivoReal implements Archivo {
    private final String nombre;
    private final String contenido;

    public ArchivoReal(String nombre) {
        this.nombre = nombre;
        System.out.println("[ArchivoReal] Cargando '" + nombre + "'...");
        try {
            Thread.sleep(300);
        } catch (InterruptedException ignored) {}
        this.contenido = "Contenido sensible de " + nombre;
    }

    @Override public String leer() {
        return contenido; // devuelve el contenido
    }
}
