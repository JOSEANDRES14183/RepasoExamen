public class Pelicula {

    private String titulo;
    private int duracion;
    private String director;

    public Pelicula(String titulo,int duracion,String director){
        this.titulo=titulo;
        this.duracion=duracion;
        this.director=director;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getDuracion(){
        return duracion;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public void setDuracion(int duracion){
        this.duracion=duracion;
    }

    public void setDirector(String director){
        this.director=director;
    }

    public Pelicula(){}

}
