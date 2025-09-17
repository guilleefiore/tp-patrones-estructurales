package com.example.proxy;
import java.util.Set;

public record Usuario(String nombre, Set<String> permisos) {
    public boolean tienePermiso(String archivo) {
        return permisos.contains(archivo);
    }
}
