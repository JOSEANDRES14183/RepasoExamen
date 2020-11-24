package Punto;

public class Punto {

    private double x;
    private double y;

    public Punto(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double distanciaPunto(Punto punto){
        double distancia = Math.sqrt(Math.pow((this.x-punto.x),2)+Math.pow((this.y-punto.y),2));
        return distancia;
    }
}
