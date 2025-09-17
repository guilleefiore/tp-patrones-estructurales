package com.example.decorator;

public class conDescargasOffline extends SubscripcionDecorator{
    public conDescargasOffline(Subscripcion subscripcion){
        super(subscripcion);
    }

    @Override
    public String descripcion(){
        return subscripcion.descripcion()+" con descargas Offline";
    }

    @Override
    public double costo(){
        return subscripcion.costo()+700;
    }
}
