import java.util.ArrayList;
public class Asignatura {

    private String nombre;
    private ArrayList <Alumno> alumnos = new ArrayList();

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
