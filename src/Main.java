import entidades.Bateria;
import entidades.Hombre;
import entidades.Robot;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Hombre hombre= new Hombre();
        Robot rb = new Robot();
        System.out.println("vas a despertar al robot?");
        boolean levantar = rb.despertar();
        System.out.println();
        Menu(rb, levantar, hombre);
    }

    public static void Menu(Robot rb, boolean levantar, Hombre hombre) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int opcion = 0;
        while (levantar != false && opcion != 10) {
            System.out.println("1. avanzar");
            System.out.println("2. retroceder");
            System.out.println("3. dormir robot");
            System.out.println("4. despertar robot");
            System.out.println("5. recargar totalmente bateria? ");
            System.out.println("6. verificar si esta al 100% de carga la bateria? ");
            System.out.println("7. verificar si esta al 0% de carga la bateria?");
            System.out.println("8. ¿Carga la bateria? ");
            System.out.println("9. Jugar hombre con robot");
            System.out.println("10. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println(" Ingrese los pasos que el robot avanzará: ");
                    int pasos = sc.nextInt();
                    rb.avanzar(pasos, levantar);break;
                case 2:
                    System.out.println("Ingrese los pasos que el robot retrocederá: ");
                    int pasosAtras = sc.nextInt();
                    rb.retroceder(pasosAtras, levantar);break;
                case 3:
                    System.out.println("Apagando robot");
                    levantar = false;
                    System.out.println("Robot fuera de servicio " + levantar);break;
                case 4:
                    levantar=true;
                    System.out.println("Robot activo " + levantar);break;
                case 5:
                   rb.recargar();
                    break;
                case 6:
                    System.out.println(rb.bateriaVacia());break;
                case 7:
                    rb.bateriaVacia();break;
                case 8:
                    rb.energiaActual();break;
                case 9:hombre.jugarConRobot(rb, levantar);break;
                case 10:
                    opcion=10;break;
                default:
                    System.out.println("-----------ingrese opcion valida-------------");
            }
        }
        if (opcion==10){
            System.out.println("gracias por operar el robotin");
            System.out.println();
        }
        if (levantar == false) {
            System.out.println("Imposible hacer funcion alguna con el robot apagado");
            System.out.println();
        }
    }
}
