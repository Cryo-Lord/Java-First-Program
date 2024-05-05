package elementos;
import java.util.Scanner;

public class Menu {

    public void mostrarMenu() {
        
        int opcion = 0;
        
        Scanner teclado = new Scanner(System.in);
        Juego data1 = new Juego();
        data1.setNombre("Dota"); 
        data1.setSinopsis("Juego de 5 vs 5 en el cual el objetivo es destruir la base enemiga");
        data1.setPuntaje(4.0);
        data1.setDuracion(30);

        while (opcion != 9) {
            System.out.println("Juegos disponibles");
            System.out.println("Juego: " + data1.getNombre());
            System.out.println("Tus opciones son: Ver ficha tecnica (1), Modificar (2), Calcular partidas por tiempo (3) o Salir (9)");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1:
                    data1.mostrarTodo();
                    break;
                
                case 2:
                    System.out.println("Ingrese el nombre del juego: ");
                    data1.setNombre(teclado.nextLine());
                    System.out.println("Ingrese la sinopsis: ");
                    data1.setSinopsis(teclado.nextLine());
                    System.out.println("ingrese el puntaje del juego del 0 al 5: ");
                    data1.setPuntaje(teclado.nextDouble());
                    System.out.println("ingrese la duración promedio en minutos de una partida: ");
                    data1.setDuracion(teclado.nextInt());
                    System.out.println("Se mostrará la ficha tecnica del ingreso de datos ");
                    data1.mostrarTodo();
                    break;

                case 3:
                    System.out.println("Ingrese la cantidad de horas que dedicaria al juego en un día: ");
                    data1.calcularPartidas(teclado.nextInt());
                    break;

                case 9:
                    break;
                    
                default:
                    System.out.println("Esa opción no existe");
                    System.out.println("------------------------- \n \n");
                    break;
                }
            }
        teclado.close();
        System.out.println("\n ¡Hasta luego!");
    }
    
}
