import java.util.ArrayList;
public class main {
  public static void main(String[] args) {
    juegoPoker juego = new juegoPoker();
    jugadoresPoker jugador = new jugadoresPoker ();

    juego.barajar();
    //juego.repartir(jugador);
    //jugador.mostrarMano();

    int num = 1, i = 0;
    String cad = null;

    ArrayList<jugadoresPoker>jugadores = new ArrayList<jugadoresPoker>();
    java.util.Scanner input = new java.util.Scanner(System.in);

    System.out.println("\n=========================\n"+
                       "Simulacion de juego poker\n"+
                       "=========================\n");
//ingreasar numero de jugadoes<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    juego.ingJugadores(jugadores);
// entregar cartas a cada jugador>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><
    i = 0;
    while(i < (jugadores.size()-1)){
      juego.repartir(jugadores.get(i));
      i++;
    }
// mostramos cartas de cada jugador>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><
  juego.mostarCartasJugadores(jugadores);
// apuesta de jugadores >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><
    num = 0;
    i = 0;
    int apuesta = 0;
    System.out.println("\n");
    while(i < (jugadores.size()-1)){
      System.out.println("jugador "+(i + 1)+" debe apostar\npresione (1) para apostar");
      num = input.nextInt();
      if(num == 1){
        if(jugadores.get(i).apostar()){
          apuesta+=50;
        }else {System.out.println("jugador "+(i+1)+" no puede a postar\n");
        juego.returnCartasMaso(jugadores.get(i));
        jugadores.remove(i);
      }
      }
      else{
        System.out.println("jugador "+(i+1)+" se retira del juego\n");
        juego.returnCartasMaso(jugadores.get(i));
        jugadores.remove(i);
      }
      num = 0;
      i++;
    }
  juego.mostarCartasJugadores(jugadores);
      System.out.println("");
  i=0;
    while(i < (jugadores.size()-1)){
      System.out.println("\njugador "+(i+1)+" desea sacar una carta (1) ");
      num=input.nextInt();
      if(num == 1){
        System.out.println("Que carta desea sacar?");
        num=input.nextInt();
        jugadores.get(i).sacaCartas(num);
      }
      i++;
    }
    juego.mostarCartasJugadores(jugadores);
    juego.defJuego(jugadores.get(0));


  }
  }
