package Ejercicio3_ISP.implementar;


import Ejercicio3_ISP.Interface.Conducible;
import Ejercicio3_ISP.Interface.Transportable;

public class Camion implements Conducible, Transportable {
    @Override
    public void conducir() {
        System.out.println("El camión está en marcha.");
    }

    @Override
    public void cargarMercancia() {
        System.out.println("El camión está cargando mercancías.");
    }
}
