import java.util.ArrayList;
public class Cinema {

    private String nombre;
    private int numSalas;
    private Pelicula [] peliculas;

    public Cinema(String nombre, int numSalas, Pelicula [] peliculas){
        this.nombre=nombre;
        this.numSalas=numSalas;
        this.peliculas=peliculas;
    }

    public Pelicula peliculaMasLarga(){
        int peliculaMasLarga = 0;
        Pelicula pelicula = new Pelicula();

        for(int i=0;i<peliculas.length;i++){
            if(peliculas[i].getDuracion()>peliculaMasLarga){
                peliculaMasLarga=peliculas[i].getDuracion();
                pelicula=peliculas[i];
            }
        }

        return pelicula;
    }


}
