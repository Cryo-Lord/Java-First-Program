import java.util.Scanner;
import elementos.Juego;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Juego data1 = new Juego();
        data1.setNombre("Dota"); 
        data1.setSinopsis("Juego de 5 vs 5 en el cual el objetivo es destruir la base enemiga");
        data1.setPuntaje(4.0);
        while (true) {
            
            System.out.println("Juegos disponibles");
            System.out.println("Juego: " + data1.getNombre());
            System.out.println("Tus opciones son: Ver ficha tecnica (1) o Salir (0)");

            int election = teclado.nextInt();
            switch (election) {
                case 1:
                    data1.mostrarTodo();
                    break;
                
                case 0:
                    System.out.println("\n ¡Hasta luego!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Esa opción no existe");
                    System.out.println("------------------------- \n");
                    break;
            }
            
        }

    }

};