package com.example.adapter;

public class ImpresoraAdapter implements Impresora { // no haría falta adaptar a PDF, pero lo hacemos para clarificar
    private ImpresoraPDF impresoraPDF;
    private ImpresoraTexto impresoraTexto;

    public ImpresoraAdapter(ImpresoraPDF impresoraPDF, ImpresoraTexto impresoraTexto) {
        this.impresoraPDF = impresoraPDF;
        this.impresoraTexto = impresoraTexto;
    }

    @Override
    public void imprimir(String documento) {
        if (documento.endsWith(".pdf")) {
            impresoraPDF.imprimirPDF(documento);
        } else if (documento.endsWith(".txt")) {
            impresoraTexto.imprimirTexto(documento);
        } else {
            System.out.println("Formato no soportado: " + documento);
        }
    }
}
