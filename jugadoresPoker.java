import java.util.ArrayList;
public class jugadoresPoker{

  ArrayList<String>mano = new ArrayList<String>();
  String carta = "";
  int money = 100;

  public void setMano(String carta){
    mano.add(carta);
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
