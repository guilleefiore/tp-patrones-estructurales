package com.example.adapter;

public class MainAdapter {
    public static void main(String[] args) {
        // Instanciamos el adapter pasando las impresoras necesarias
        ImpresoraAdapter impresora = new ImpresoraAdapter(new ImpresoraPDF(), new ImpresoraTexto());

        // Mismo método imprimir()
        impresora.imprimir("TrabajoFinal.pdf"); // usa ImpresoraPDF
        impresora.imprimir("NotasClase.txt"); // usa ImpresoraTexto
        impresora.imprimir("Imagen.png"); // formato no soportado
    }
}
