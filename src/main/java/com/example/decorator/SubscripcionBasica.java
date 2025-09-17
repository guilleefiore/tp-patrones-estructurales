package com.example.decorator;

public class SubscripcionBasica implements Subscripcion {
    @Override
    public String descripcion(){
        return "Subscripción basica";
    }
    @Override
    public double costo() {
        return 1000.0;
    }
}
