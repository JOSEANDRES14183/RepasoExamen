import com.sun.org.apache.bcel.internal.generic.ALOAD;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class MainAlumnos {

    private Random rd = new Random();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String []args){
        ArrayList <Alumno> alumnos = new ArrayList<Alumno>();
        ArrayList <Alumno> alumnosMates= new ArrayList<Alumno>();
        ArrayList <Alumno> alumnosCastellano=new ArrayList<Alumno>();
        ArrayList <Alumno> alumnosCiencias=new ArrayList<Alumno>();
        ArrayList <Alumno> alumnosSinAsignatura=new ArrayList<Alumno>();

            //Crear alumnos
            System.out.println("Introduce el número de alumnos que quieres crear");
            int nAlumnos = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < nAlumnos; i++) {
                ArrayList<Integer> notas = new ArrayList<Integer>();
                Alumno alumno = new Alumno();
                System.out.println("Introduce un nombre");
                String nombre = sc.nextLine();
                alumno.setNombre(nombre);
                System.out.println("Introduce la edad");
                int edad = sc.nextInt();
                sc.nextLine();
                alumno.setEdad(edad);
                int id = i;
                alumno.setId(id);
                for (int j = 0; j < 3; j++) {
                    int random = (int) (Math.random() * 10 + 1);
                    notas.add(random);
                }
                alumno.setNotas(notas);
                System.out.println("¿A qué asignatura quieres asignarlo?\n" +
                        "1- Matemáticas\n" +
                        "2- Castellano\n" +
                        "3- Ciencias");
                int opcAsignatura = sc.nextInt();
                sc.nextLine();
                switch (opcAsignatura) {
                    case 1:
                        alumnosMates.add(alumno);
                        break;
                    case 2:
                        alumnosCastellano.add(alumno);
                        break;
                    case 3:
                        alumnosCiencias.add(alumno);
                        break;
                    default:
                        alumnosSinAsignatura.add(alumno);
                        break;
                }
                alumnos.add(alumno);
            }
            Asignatura matematicas = new Asignatura("Matematicas", alumnosMates);
            Asignatura castellano = new Asignatura("Castellano", alumnosCastellano);
            Asignatura ciencias = new Asignatura("Ciencias", alumnosCiencias);

            //Matricular alumnos
            for (int i = 0; i < alumnos.size(); i++) {
                System.out.println(alumnos.get(i).getNombre());
                System.out.println(alumnos.get(i).getId());
                System.out.println("");
            }
            System.out.println("¿Que alumno quieres matricular?(Introduce su ID)");

            int opcAlumno = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < alumnos.size(); i++) {
                Alumno alumno = new Alumno();
                if (alumnos.get(i).getId() == opcAlumno) {
                    alumno = alumnos.get(i);
                    System.out.println("¿A qué asignatura lo quieres matricular?\n" +
                            "1- Matemáticas\n" +
                            "2- Castellano\n" +
                            "3- Ciencias");
                    int opcAsignatura = sc.nextInt();
                    sc.nextLine();
                    switch (opcAsignatura) {
                        case 1:
                            alumnosMates.add(alumno);
                            break;
                        case 2:
                            alumnosCastellano.add(alumno);
                            break;
                        case 3:
                            alumnosCiencias.add(alumno);
                            break;
                    }
                }
            }

            //Dar de baja alumnos
            System.out.println("¿En qué asignatura quieres dar de baja?\n" +
                    "1- Matemáticas\n" +
                    "2- Castellano\n" +
                    "3- Ciencias");
            int opcAsignatura = sc.nextInt();
            sc.nextLine();
            Asignatura asignatura = new Asignatura();
            if (opcAsignatura == 1) {
                asignatura = matematicas;
            } else if (opcAsignatura == 2) {
                asignatura = castellano;
            } else if (opcAsignatura == 3) {
                asignatura = ciencias;
            } else {
                System.out.println("No has seleccionado ninguna asignatura");
            }

            asignatura.printAlumnos();
            System.out.println("Selecciona que alumno quieres dar de baja (Introduce el ID)");
            int opcAlumnoBaja = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < asignatura.getAlumnos().size(); i++) {
                if (asignatura.getAlumnos().get(i).getId() == opcAlumno) {
                    asignatura.bajaAlumno(asignatura.getAlumnos().get(i));
                }
            }

            //Mostrar todos los alumnos
            matematicas.printAsignatura();
            System.out.println("");
            matematicas.printAlumnos();
            System.out.println("");
            castellano.printAsignatura();
            System.out.println("");
            castellano.printAlumnos();
            System.out.println("");
            ciencias.printAsignatura();
            System.out.println("");
            ciencias.printAlumnos();
        }



        // for: crear alumne
                // crear: arraylist
                // iterar: crear nota, add nota
                // crear alumne (amb notes)
        }




