import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class MainAlumnos {

    private Random rd = new Random();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String []args){

        for(int i=0;i<3;i++) {
            int random = (int) (Math.random() * 10 + 1);
            ArrayList<Integer> notas = new ArrayList<Integer>();
            Alumno alumno = new Alumno();
            System.out.println("Introduce un nombre");
            String nombre = sc.nextLine();
            alumno.setNombre(nombre);
            System.out.println("Introduce la edad");
            int edad = sc.nextInt();
            sc.nextLine();
            alumno.setEdad(edad);
        }



            // for: crear alumne
                // crear: arraylist
                // iterar: crear nota, add nota
                // crear alumne (amb notes)
        }


    }

