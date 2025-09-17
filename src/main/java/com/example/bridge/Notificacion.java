package com.example.bridge;

public abstract class Notificacion {
    protected CanalEnvio canal;

    public Notificacion(CanalEnvio canal) {
        this.canal = canal;
    }

    // Punto de extensión: todas las notificaciones llaman al canal
    public abstract void notificar(String mensaje);
}
