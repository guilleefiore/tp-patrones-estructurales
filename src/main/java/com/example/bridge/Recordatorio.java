package com.example.bridge;

public class Recordatorio extends Notificacion {
    public Recordatorio(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void notificar(String mensaje) {
        canal.enviar("RECORDATORIO", mensaje);
    }
}
