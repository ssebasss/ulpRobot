package entidades;
import java.util.Scanner;

public class Hombre {

    public Hombre() {
    }

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

        public void jugarConRobot(Robot robot, Hombre carlos){
        boolean levantar=robot.isDespertar();
        System.out.println("avanzar robot mano hombre");
        robot.avanzar(500, levantar);
        System.out.println("retroceder robot mano hombre");
        robot.retroceder(2000, levantar);
        robot.energiaActual();
           }


           public void jugarConRobotin(Robot robot, boolean levantar, Hombre juan, int pasos, int pasosAtras){
               robot.avanzar(pasos, levantar);
               robot.retroceder(pasosAtras, levantar);
               robot.dormirRobot();
               robot.despertar();
               robot.recargar();
               robot.bateriaLlena();
               robot.bateriaVacia();
               robot.recargar();
           }





}
