package com.example.facade;

public class Carrito {
    private String listaDeProductos;
    private double SubTotal;


    public Carrito(String listaDeProductos, double subTotal) {
        this.listaDeProductos = listaDeProductos;
        SubTotal = subTotal;
    }

    public String getListaDeProductos() {
        return listaDeProductos;
    }

    public void setListaDeProductos(String listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }

    public double getSubTotal() {
        return SubTotal;
    }

    public void setSubTotal(double subTotal) {
        this.SubTotal = subTotal;
    }
}
