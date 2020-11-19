import java.util.ArrayList;
public class Alumno {

    private String nombre;
    private int edad;
    private int id;
    private ArrayList <Integer> notas = new ArrayList();

    public Alumno(String nombre, int edad, int id, ArrayList <Integer> notas){
        this.nombre=nombre;
        this.edad=edad;
        this.id=id;
        this.notas=notas;
    }

    public Alumno(){}

    public void printAlumno(){
        System.out.println("Nombre: "+this.nombre+"\nEdad: "+this.edad+"\nID: "+this.id+"\nMedia notas: "+mediaNotas());
    }

    public double mediaNotas(){
        int nota=0;
        for(int i=0;i<notas.size();i++){
            nota+=notas.get(i);
        }
        return nota / notas.size();
    }

    //Getters

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public int getId(){
        return id;
    }

    public ArrayList <Integer> getNotas(){
        return notas;
    }

    //Setters

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public void setId(int id){
        this.id=id;
    }

    public void setNotas(ArrayList <Integer> notas){
        this.notas=notas;
    }


}
