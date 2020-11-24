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

        System.out.println("Introduce el número de alumnos que quieres crear");
        int nAlumnos = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<nAlumnos;i++) {
            ArrayList<Integer> notas = new ArrayList<Integer>();
            Alumno alumno = new Alumno();
            System.out.println("Introduce un nombre");
            String nombre = sc.nextLine();
            alumno.setNombre(nombre);
            System.out.println("Introduce la edad");
            int edad = sc.nextInt();
            sc.nextLine();
            alumno.setEdad(edad);
            int id=i;
            alumno.setId(id);
            for(int j=0;j<3;j++){
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
            switch (opcAsignatura){
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

        //Matricular alumnos
        System.out.println("¿Que alumno quieres matricular?");
        for(int i=0;i<alumnos.size();i++){
            System.out.println(alumnos.get(i).getNombre());
            System.out.println(alumnos.get(i).getId());
            System.out.println("");
        }



        Asignatura matematicas = new Asignatura("Matematicas",alumnosMates);
        Asignatura castellano = new Asignatura("Castellano",alumnosCastellano);
        Asignatura ciencias = new Asignatura("Ciencias",alumnosCiencias);

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




        // for: crear alumne
                // crear: arraylist
                // iterar: crear nota, add nota
                // crear alumne (amb notes)
        }


    }

