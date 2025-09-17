package com.example.decorator;

public abstract class SubscripcionDecorator implements Subscripcion {

    protected Subscripcion subscripcion;

    public SubscripcionDecorator(Subscripcion subscripcion){
        this.subscripcion = subscripcion;
    }

    @Override
    public String descripcion(){
        return "";
    }

    @Override
    public double costo(){
        return 0;
    }

}
