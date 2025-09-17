package com.example.bridge;

public class SMS implements CanalEnvio {
    @Override
    public void enviar(String asunto, String cuerpo) {
        System.out.println("[SMS] Asunto: " + asunto + " - " + cuerpo);
    }
}
