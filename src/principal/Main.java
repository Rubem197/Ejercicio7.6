package principal;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Hora hora1 = new Hora();
        LocalDate fecha = LocalDate.now();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la hora:");
        int hora= sc.nextInt();
        System.out.println("Introduce los minutos:");
        int minutos= sc.nextInt();
        System.out.println("Introduce los segundos:");
        int segundos=sc.nextInt();

        hora1.setHora(hora);
        hora1.setMinutos(minutos);
        hora1.setSegundos(segundos);
        System.out.println("Introduce la cantidad de segundos que quieres aumentar:");
        int aumentoSegundos=sc.nextInt();

        for (int i=0; i<aumentoSegundos; i++){
            hora1.aumentarSegundos();
            System.out.println(hora1.toString());
        }

    }
}
