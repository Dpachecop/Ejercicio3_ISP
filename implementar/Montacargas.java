package Ejercicio3_ISP.implementar;


import Ejercicio3_ISP.Interface.Transportable;


public class Montacargas implements Transportable {
    @Override
    public void cargarMercancia() {
        System.out.println("El montacargas está cargando mercancías pesadas.");
    }
}
