package com.example.facade;

public class Envio {
    private String direccion;
    private double costroEnvio;

    public Envio(String direccion, double costroEnvio) {
        this.direccion = direccion;
        this.costroEnvio = costroEnvio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getCostroEnvio() {
        return costroEnvio;
    }

    public void setCostroEnvio(double costroEnvio) {
        this.costroEnvio = costroEnvio;
    }
}
