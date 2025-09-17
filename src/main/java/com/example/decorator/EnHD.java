package com.example.decorator;

public class EnHD extends SubscripcionDecorator{
    public  EnHD ( Subscripcion subscripcion){
        super(subscripcion);
    }

    @Override
    public String descripcion(){
        return subscripcion.descripcion()+" en HD";
    }

    @Override
    public double costo(){
        return subscripcion.costo()+500;
    }
}
