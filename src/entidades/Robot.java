package entidades;

import java.util.Scanner;

public class Robot {

    private Bateria bateria;
    private boolean despertar;

    public Robot() {
        this.bateria = new Bateria();
        this.despertar = false;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public boolean isDespertar() {
        return despertar;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "bateria=" + bateria +
                ", despertar=" + despertar +
                '}';
    }


    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public boolean despertar() {
        boolean despiertando = sc.next().equalsIgnoreCase("si") ? true : false;
        if (despiertando == true) {
            this.despertar = true;
            System.out.println("robot encendido, lo tendrá Juan");
        } else {
            System.out.println("robot Apagado!!! ");
        }
        return despiertando;
    }


    public void avanzar(int pasos, boolean levantar) {
        int unidades_consumidas_por_paso = 10;
        boolean continuar = true;
        if (levantar) {
            while (bateria.getCarga() - ((unidades_consumidas_por_paso * pasos) / 100) > 0 && continuar == true) {
                int consumo = ((unidades_consumidas_por_paso * pasos) / 100);
                bateria.setCarga(bateria.getCarga() - consumo);
                System.out.println("el robot avanzó " + pasos + " pasos y queda una carga de " + bateria.getCarga() + " unidades");
                System.out.println("si queres seguir avanzando agregando 's' para continuar ??");
                continuar = sc.next().equalsIgnoreCase("s") ? true : false;
                if (continuar == true) {
                    System.out.println("pone los pasos");
                    pasos = sc.nextInt();
                }
            }
            if (bateria.getCarga() - ((unidades_consumidas_por_paso * pasos) / 100) < 0) {
                System.out.println("No hay suficiente carga para realizar los pasos pedidos");
            }
            if (continuar != true) {
                System.out.println("proceso de avance terminado");
            }
        }
        if (levantar != true) {
            System.out.println("robot Apagado, no se puede continuar");
        }
    }

    public void retroceder(int pasosAtras, boolean levantar) {
        int unidades_consumidas_por_paso = 10;
        boolean continuar = true;
        if (levantar) {
            while (bateria.getCarga() - ((unidades_consumidas_por_paso * pasosAtras) / 100) > 0 && continuar == true) {
                int consumo = ((unidades_consumidas_por_paso * pasosAtras) / 100);
                bateria.setCarga(bateria.getCarga() - consumo);
                System.out.println("el robot retrocedió " + pasosAtras + " pasos y queda una carga de " + bateria.getCarga() + " unidades");
                System.out.println("si queres seguir retrocediendo agregando 's' para continuar");
                continuar = sc.next().equalsIgnoreCase("s") ? true : false;
                if (continuar == true) {
                    System.out.println("pone los pasos");
                    pasosAtras = sc.nextInt();
                }
            }
            if (bateria.getCarga() - ((unidades_consumidas_por_paso * pasosAtras) / 100) < 0) {
                System.out.println("No hay suficiente carga para realizar los pasos pedidos");
            }
            if (continuar != true) {
                System.out.println("proceso de avance terminado");
            }
        }
        if (levantar != true) {
            System.out.println("robot Apagado, no se puede continuar");
        }
    }

    public void recargar() {
        System.out.println("la bateria antes de descargar: " + getBateria().toString());
        bateria.setCarga(1000);
        System.out.println("la bateria despues de descargar: " + getBateria().toString());
        System.out.println();
    }


    public boolean bateriaLlena() {
        if (bateria.getCarga() == 1000) {
            System.out.println("la bateria esta llena");
            return true;
        } else {
            System.out.println("no esta llena");
            return false;
        }
    }

    public boolean bateriaVacia() {
        if (bateria.getCarga() == 0) {
            System.out.println("la bateria esta vacia");
            energiaActual();
            System.out.println();
            return true;
        } else {
            System.out.println("la bateria no esta vacia " );
            energiaActual();
            System.out.println();
            return false;
        }
    }

    public void energiaActual(){
        System.out.println("la energia actual de la bateria es "+bateria.getCarga());
        System.out.println();

    }

    public boolean dormirRobot(){
        despertar = false;
        System.out.println("ESTOY EN EL METODO.... robot desactivado, atributo despertar= "+this.despertar);
        return false;
    }


}






























