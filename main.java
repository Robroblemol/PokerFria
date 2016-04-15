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
//numero de jugadoes<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    while(num ==1){
    System.out.println("Ingres un nuevo jugador (1)\n"+
                       "para continuar (2)");
    jugadoresPoker jug = new jugadoresPoker ();
    jugadores.add(jug);
    num = input.nextInt();
    }
// entregar cartas a cada jugador>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><
    i = 0;
    while(i < (jugadores.size()-1)){
      juego.repartir(jugadores.get(i));
      i++;
    }
// mostramos cartas de cada jugador>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><
    i = 0;
        System.out.println("");
    while(i < (jugadores.size()-1)){
      System.out.println("\nCartas de jugador "+(i+1));
      jugadores.get(i).mostrarMano();
      i++;
    }
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
        }else System.out.println("jugador "+i+" no puede a postar\n");
      }else System.out.println("jugador "+i+" se retira del juego\n");
      i++;
    }



  }
}
