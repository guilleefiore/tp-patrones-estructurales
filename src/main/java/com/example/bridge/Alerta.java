package com.example.bridge;

public class Alerta extends Notificacion {
    public Alerta(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void notificar(String mensaje) {
        canal.enviar("ALERTA", mensaje);
    }
}
