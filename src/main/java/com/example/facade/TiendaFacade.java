package com.example.facade;

public class TiendaFacade {
    private Pago pago;
    private  Carrito carrito;
    private Envio envio;

    public TiendaFacade( Carrito carrito, Envio envio, Pago pago) {
        this.pago = pago;
        this.carrito = carrito;
        this.envio = envio;
    }

    public void realizarCompra(){
        this.pago.setCostoTotal(this.carrito.getSubTotal()+this.envio.getCostroEnvio());
        System.out.println("Se realizo la compra de "+this.carrito.getListaDeProductos());
        System.out.println("Con envio hacia "+ this.envio.getDireccion());
        System.out.println(("De un costo de " + this.pago.getCostoTotal() + " con el metodo " + this.pago.getMetodoDePago()));
    }
}
