package com.example.proxy;

import java.util.Set;

public class MainProxy {
    public static void main(String[] args) {
        var admin    = new Usuario("admin",    Set.of("reporte.pdf","secret.txt","publico.md"));
        var invitado = new Usuario("invitado", Set.of("publico.md"));

        Archivo a1 = new ArchivoProxy("reporte.pdf", admin);
        Archivo a2 = new ArchivoProxy("secret.txt", invitado);
        Archivo a3 = new ArchivoProxy("publico.md", invitado);

        System.out.println(a1.leer());
        System.out.println(a2.leer());
        System.out.println(a3.leer());
        System.out.println(a1.leer()); // ya no recarga
    }
}
