import java.util.ArrayList;
import java.lang.Math;

public class juegoPoker{
ArrayList<String>maso = new ArrayList<String>();
ArrayList<String>masop = new ArrayList<String>();//arraypara prueba
java.util.Scanner input = new java.util.Scanner(System.in);

int alet = 0, i = 0, apuesta = 0, num = 0;
String cad = "";

String [] cartas = {"CA","C2","C3","C4","C5","C6","C7","C8","C9","C10","CJ","CQ","CK",
                      "PA","P2","P3","P4","P5","P6","P7","P8","P9","P10","PJ","PQ","PK",
                      "DA","D2","D3","D4","D5","D6","D7","D8","D9","D10","DJ","DQ","DK",
                      "TA","T2","T3","T4","T5","T6","T7","T8","T9","T10","TJ","TQ","TK",
                    };

public void barajar(){
  while(i<cartas.length){
    alet = (int) (Math.random()*52+0);
    if(cartas [alet].equals(" ")==false){
      maso.add(cartas [alet]);
      cartas[alet]=" ";
    }
    i++;
  }
}
  public void repartir(jugadoresPoker jugador){
    masop.add("C2");
    masop.add("T3");
    masop.add("D4");
    masop.add("C5");
    masop.add("C6");
    for (int i=0;i<=4 ;i++ ) {
      jugador.setMano(masop.get(i));
      maso.remove(i);
    }
  }
  public void returnCartasMaso(jugadoresPoker jugador){
    int i = 0;
    while(i<jugador.numCarta()){
      maso.add(jugador.sacaCartas(i));
      i++;
    }
  }
  public void returnCartasMaso(String carta){
    maso.add(carta);
  }
  public void setApuesta(int a){
    apuesta=apuesta+a;
  }
  public int getApuesta(){
    return apuesta;
  }
  public void ingJugadores(  ArrayList<jugadoresPoker>jugadores){
    int num = 1;
    while(num ==1){
    System.out.println("Ingres un nuevo jugador (1)\n"+
                       "para continuar (2)");
    jugadoresPoker jug = new jugadoresPoker ();
    jugadores.add(jug);
    num = input.nextInt();
    }
  }
  public void mostarCartasJugadores(ArrayList<jugadoresPoker>jugadores){
    int i = 0;
        System.out.println("");
    while(i < (jugadores.size()-1)){
      System.out.println("\nCartas de jugador "+(i+1));
      jugadores.get(i).mostrarMano();
      i++;
    }
  }
  public void defJuego(jugadoresPoker jugador){
    char palo = ' ', num = ' ';
    char[] numero = {'2','3','4','5','6','7','8','9','1','J','Q','K','A'};
    int [] countPal = new int [4];
    int [] countNum =new int [13];
    String carta = null;
    boolean flagPar = false,flagPDoble = false;
    i = 0;
    while(i<jugador.numCarta()){
      carta = jugador.getCarta(i);
      palo = carta.charAt(0);
      num = carta.charAt(1);

      if(palo == 'C'){
        countPal[0]=countPal[0]+1;
      //  System.out.println("\ncontPal 0: "+countPal[0]);
      }else if (palo == 'P'){
        countPal[1]=countPal[1]+1;
      //  System.out.println("\ncontPal 1: "+countPal[1]);
      }else if (palo == 'D'){
        countPal[2]=countPal[2]+1;
        //System.out.println("\ncontPal 2: "+countPal[2]);
      }else if (palo == 'T'){
        countPal[3]=countPal[3]+1;
        //System.out.println("\ncontPal 3: "+countPal[3]);
      }

      for(int i=0;i<numero.length;i++){
        if(num == numero[i]){
          countNum[i]=countNum[i]+1;
          //System.out.println("contNum "+i+"="+countNum[i]);
        }
      }
      i++;



    }
    System.out.println("\n");
    for(int i = 0;i< countPal.length; i++){
       System.out.print(" ContPal "+i+" = "+countPal[i]);
    }
    System.out.println("\n");
    for(int i = 0;i< countNum.length; i++){
       System.out.print(" contNum "+i+" = "+countNum[i]);
       if(i%2==1)System.out.println(" ");
    }
    i=0;
    num = 0;
      for(int j =0;j<countNum.length;j++){
        if(countNum[j] == 2){
          num ++;
        }
        }

    if(num == 1){
      cad = "pareja";
      jugador.setJugada(cad,1);
      System.out.println("\n"+cad);
      flagPar=true;
    }else if(num==2){
            jugador.setJugada("Doble parejas",2);
            System.out.println("Doble parejas");
            flagPDoble = true;
    }
    num=0;
    for(int j =0;j<countNum.length;j++){
      if(countNum[j] == 3){
        num ++;
      }
      }
    if(num == 1){
      jugador.setJugada("Trio",3);
        System.out.println("uhmm Trio!");
    }
    int aco=0;
    for(int j =0;j<countNum.length;j++){
      if(countNum[j] == 1){
        aco ++;
          //System.out.println(" num= "+aco);
      }else if (aco != 5)aco =0;
      //else aco=0;
      }
      //System.out.println(" Lnum= "+aco);
    if(aco == 5){
      jugador.setJugada("Escalera",4);
        System.out.println("Escalera");
    }

  }

}
