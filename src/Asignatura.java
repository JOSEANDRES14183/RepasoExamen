import java.util.ArrayList;
public class Asignatura {

    private String nombre;
    private ArrayList <Alumno> alumnos = new ArrayList();

    public Asignatura(String nombre,ArrayList <Alumno> alumnos){
        this.nombre=nombre;
        this.alumnos=alumnos;
    }

    public Asignatura(){}

    public void nuevoMatriculado(Alumno alumno){
        this.alumnos.add(alumno);
    }

    public void bajaAlumno(Alumno alumno){
        this.alumnos.remove(alumno);
    }

    public Alumno mejorAlumno(){
        Alumno alumno = new Alumno();
        double mejorMedia=0;
        for(int i=0;i<alumnos.size();i++){
            if(mejorMedia<alumnos.get(i).mediaNotas()){
                mejorMedia=alumnos.get(i).mediaNotas();
                alumno=alumnos.get(i);
            }
        }
        return alumno;
    }

    public void printAsignatura(){
        System.out.println("Nombre: "+this.nombre);
    }

    public void printAlumnos(){
        for(int i=0;i<alumnos.size();i++){
            alumnos.get(i).printAlumno();
            System.out.println("");
        }
    }

    //Getter

    public String getNombre(){
        return nombre;
    }

    public ArrayList <Alumno> getAlumnos(){
        return alumnos;
    }

    //Setter

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }


}
