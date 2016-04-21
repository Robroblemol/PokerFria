import java.util.ArrayList;
public class jugadoresPoker{

  ArrayList<String>mano = new ArrayList<String>();
  String carta = "",jugada = "";
  int money = 100,top = 0;

  public void setJugada (String juego,int toR){
    if(top < toR){
      jugada = juego;
      top = toR;
    }
  }
  public String getJugada(){
    return jugada;
  }
  public void setMano(String carta){
    mano.add(carta);
  }
  public String getCarta (int index){
    return carta = mano.get(index);
  }
  public String sacaCartas(int index){
    carta=mano.get(index);
    mano.remove(index);
    return carta;
  }
  public boolean apostar(){
    if(money >= 50){
      money=money-50;
      return true;
    }
    else return false;
  }
  public void setMoney(int suma){
    money=money+suma;
  }
  public void mostrarMano(){
    for (int i=0;i<mano.size();i++ ) {
      System.out.print("["+mano.get(i)+"]");
    }
  }
  public int numCarta(){
    return mano.size();
  }
}
