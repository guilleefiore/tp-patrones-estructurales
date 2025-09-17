package com.example.facade;

import com.example.decorator.*;

public class MainFacade {
    public static void main(String[] args) {
        /**
         * Facade
         */
        Pago pago = new Pago("Mastercard",null);
        Carrito carrito = new Carrito("Remera , zapatilla, Pantalon", 1000 );
        Envio envio = new Envio("Calle Villanueva 132",500);
        TiendaFacade tienda = new TiendaFacade(carrito,envio,pago);
        tienda.realizarCompra();
    }
}
