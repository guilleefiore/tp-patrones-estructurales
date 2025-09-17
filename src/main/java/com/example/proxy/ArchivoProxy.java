package com.example.proxy;

public class ArchivoProxy implements Archivo {
    private final String nombre;
    private final Usuario usuario;
    private ArchivoReal real; // lazy

    public ArchivoProxy(String nombre, Usuario usuario) {
        this.nombre = nombre;
        this.usuario = usuario;
    }

    @Override
    public String leer() {
        if (!usuario.tienePermiso(nombre)) {
            String msg = "[ACCESO DENEGADO] " + usuario.nombre() + " -> " + nombre;
            System.out.println(msg);
            return msg;
        }
        if (real == null) real = new ArchivoReal(nombre); // se instancia el archivo real en la primer lectura
        System.out.println("[OK] " + usuario.nombre() + " accede a " + nombre);
        return real.leer();
    }
}
