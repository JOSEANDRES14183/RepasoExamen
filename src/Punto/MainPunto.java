package Punto;

public class MainPunto {

    public static void main(String [] args){
        Punto punto = new Punto(3.2,4.8);
        Punto punto1 = new Punto(6.2,7.9);
        System.out.println(punto.distanciaPunto(punto1));
    }
}
