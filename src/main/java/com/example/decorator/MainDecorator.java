package com.example.decorator;

public class MainDecorator {
    public static void main(String[] args) {
        /**
         Decorator
         **/
        Subscripcion sub1 = new SubscripcionBasica();
        conDescargasOffline subHDDO = new conDescargasOffline(new EnHD(sub1));
        System.out.println(subHDDO.descripcion());
        System.out.println(subHDDO.costo());

        EnUltraHD subDOUHD = new EnUltraHD(new conDescargasOffline(sub1));
        System.out.println(subDOUHD.descripcion());
        System.out.println(subDOUHD.costo());

        conDescargasOffline subHDUHDDO =new conDescargasOffline(new EnHD(new EnUltraHD(sub1)));
        System.out.println(subHDUHDDO.descripcion());
        System.out.println(subHDUHDDO.costo());

    }
}
