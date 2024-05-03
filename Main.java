import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        String name = "Dota"; 
        String sinopsis = "Juego de 5 vs 5 en el cual el objetivo es destruir la base enemiga  ";
        double rating = 4.0;
        while (true) {
            
            System.out.println("Juegos disponibles");
            System.out.println("Juego: " + name);
            System.out.println("Tus opciones son: Ver sinopsis (1), Ver puntaje (2) o Salir (0)");

            int election = teclado.nextInt();
            switch (election) {
                case 1:
                    System.out.println("Sinopsis: " + sinopsis);
                    System.out.println("-------------------------");
                    break;
                
                case 2:
                    System.out.println("Puntaje: " + rating);
                    System.out.println("-------------------------");
                    break;

                case 0:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Esa opción no existe");
                    System.out.println("-------------------------");
                    break;
            }
            
        }

    }

};