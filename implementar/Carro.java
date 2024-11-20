package Ejercicio3_ISP.implementar;

import Ejercicio3_ISP.Interface.Conducible;

public class Carro implements Conducible {
    @Override
    public void conducir() {
        System.out.println("El carro está en marcha.");
    }
}