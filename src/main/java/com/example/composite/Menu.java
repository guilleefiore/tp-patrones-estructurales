package com.example.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu implements ElementoMenu {
    private String nombre;
    private List<ElementoMenu> elementos;

    public Menu(String nombre) {
        this.nombre = nombre;
        this.elementos = new ArrayList<>();
    }

    public void agregar(ElementoMenu elemento) {
        elementos.add(elemento);
    }

    // Método para eliminar un elemento.
    public void eliminar(ElementoMenu elemento) {
        elementos.remove(elemento);
    }

    @Override
    public Void mostrar() {
        System.out.println("-> Menú: " + nombre);
        for (ElementoMenu elemento : elementos) {

            elemento.mostrar();

        }
        return null;
    }

}

