import java.util.ArrayList;
public class main {
  public static void main(String[] args) {
    juegoPoker juego = new juegoPoker();
    jugadoresPoker jugador = new jugadoresPoker ();

    juego.barajar();
    juego.repartir(jugador);
    jugador.mostrarMano();

    ArrayList<jugadoresPoker>jugadores = new ArrayList<String>();
  }
}
