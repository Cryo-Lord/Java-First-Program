package elementos;

public class Juego {

    private String nombre;
    private String sinopsis;
    private double puntaje;
    private int duracion;

    public String getNombre() {
        return nombre;
    }

    public void setDuracion(int tiempo) {
        this.duracion = tiempo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setSinopsis(String sinopsis) {
         this.sinopsis = sinopsis;
     }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    public void mostrarTodo() {
        System.out.println("--------- Ficha tecnica ----------");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Sinopsis: " + this.sinopsis);
        System.out.println("Puntaje: " + this.puntaje);
        System.out.println("Duración por partida: " + this.duracion + " minutos");
        System.out.println("----------------------------------");
    }

    public void calcularPartidas(double tiempoDedicado) {
        double total = (tiempoDedicado*60) / this.duracion;
        System.out.println("Cantidad de partidas posibles por día: " + total + " partidas. \n");
    }
}
