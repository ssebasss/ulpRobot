package entidades;

public class Hombre {

   public void jugarConRobot(Robot robot, boolean levantar){

        System.out.println("avanzar robot mano hombre");
        robot.avanzar(500, levantar);
        System.out.println("retroceder robot mano hombre");
        robot.retroceder(2000, levantar);
        robot.energiaActual();
        robot.dormirRobot();
           }







}
