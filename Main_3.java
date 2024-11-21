package Ejercicio3_ISP;
import Ejercicio3_ISP.Interface.Conducible;
import Ejercicio3_ISP.Interface.Transportable;
import Ejercicio3_ISP.implementar.Camion;
import Ejercicio3_ISP.implementar.Carro;
import Ejercicio3_ISP.implementar.Montacargas;


public class Main_3 {
    public static void main(String[] args) {
        
        Conducible carro = new Carro();
        carro.conducir();

        
        Camion camion = new Camion();
        camion.conducir();
        camion.cargarMercancia();

        
        Transportable montacargas = new Montacargas();
        montacargas.cargarMercancia();
    }
}
