package com.example.decorator;

public class EnUltraHD extends SubscripcionDecorator{
    public EnUltraHD(Subscripcion subscripcion){
        super(subscripcion);
    }

    @Override
    public String descripcion(){
        return subscripcion.descripcion()+" en UltraHD";
    }

    @Override
    public double costo(){
        return subscripcion.costo()+1000;
    }
}
