import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Pelicula [] peliculas = new Pelicula[3];

        for(int i=0;i<peliculas.length;i++){
            Pelicula pelicula = new Pelicula();
            peliculas[i]=pelicula;
            System.out.println("Introduce el título:");
            String titulo= sc.nextLine();
            peliculas[i].setTitulo(titulo);
            System.out.println("Introduce la duración");
            int duracion = sc.nextInt();
            sc.nextLine();
            peliculas[i].setDuracion(duracion);
            System.out.println("Introdcue el director");
            String director = sc.nextLine();
            peliculas[i].setDirector(director);
        }

        Cinema cine = new Cinema("ENP",50,peliculas);
        System.out.println("La película más larga es "+cine.peliculaMasLarga().getTitulo());

    }


}
