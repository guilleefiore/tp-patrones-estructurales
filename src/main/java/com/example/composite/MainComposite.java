package com.example.composite;

public class MainComposite {
    public static void main(String[] args) {
        Plato arrozConPollo = new Plato("Arroz con Pollo", 12.50);
        Plato ensalada = new Plato("Ensalada Mixta", 8.00);
        Plato sopaDelDia = new Plato("Sopa del Día", 5.00);
        Plato pasta = new Plato("Pasta Carbonara", 15.75);
        Plato pizza = new Plato("Pizza Margarita", 14.00);

        Menu menuPrincipal = new Menu("Menú del Día");
        menuPrincipal.agregar(arrozConPollo);
        menuPrincipal.agregar(ensalada);

        Menu menuItaliano = new Menu("Menú Italiano");
        menuItaliano.agregar(sopaDelDia);
        menuItaliano.agregar(pasta);
        menuItaliano.agregar(pizza);

        menuPrincipal.agregar(menuItaliano);

        System.out.println("--- Mostrando el menú completo ---");
        menuPrincipal.mostrar();
        System.out.println("-----------------------------------");
    }
}
