package com.example.facade;

public class Pago {
    private String metodoDePago;
    private Double costoTotal;

    public Pago(String metodoDePago, Double costoTotal) {
        this.metodoDePago = metodoDePago;
        this.costoTotal = costoTotal;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public String getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(String metodoDePago) {
        this.metodoDePago = metodoDePago;
    }
}
