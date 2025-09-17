package com.example.bridge;

public class Promocion extends Notificacion {
    public Promocion(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void notificar(String mensaje) {
        canal.enviar("PROMOCIÓN", mensaje);
    }
}
