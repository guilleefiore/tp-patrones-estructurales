package com.example.bridge;

public class MainBridge {
    public static void main(String[] args) {
        Notificacion alertaEmail = new Alerta(new Email());
        Notificacion recordatorioSMS = new Recordatorio(new SMS());
        Notificacion promoEmail = new Promocion(new Email());

        alertaEmail.notificar("Servidor caído en producción");
        recordatorioSMS.notificar("Reunión a las 10:00 horas");
        promoEmail.notificar("Hoy 50% OFF en membresías");
    }
}
