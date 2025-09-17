package com.example.bridge;

public class Email implements CanalEnvio {
    @Override
    public void enviar(String asunto, String cuerpo) {
        System.out.println("[EMAIL] Asunto: " + asunto + " | Cuerpo: " + cuerpo);
    }
}
