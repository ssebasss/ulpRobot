import entidades.Bateria;
import entidades.Robot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        Robot rb= new Robot();
        System.out.println("vas a despertar al robot?");
        boolean levantar= rb.despertar();
        System.out.println(  "hay un true?  "+rb.isDespertar());

        System.out.println(levantar);
        //Probando Giuli

        System.out.println("ingrese los pasos que el robot avanzará: ");
        int pasos=sc.nextInt();
        rb.avanzar(pasos, levantar);
        System.out.println();
        System.out.println("ingrese los pasos que el robot retrocederá: ");
        int pasosAtras=sc.nextInt();
        rb.retroceder(pasosAtras, levantar);
        System.out.println("-----------------------cargando bateria------------------------------");
        rb.recargar();
        System.out.println("-----------------------bateria esta cargada? ------------------------------");
        rb.bateriaLlena();

    }
}
