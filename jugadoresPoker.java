import java.util.ArrayList;
public class jugadoresPoker{

  ArrayList<String>mano = new ArrayList<String>();
  String carta = "";
  int money = 100;

  public void setCartas(ArrayList<String>mano){
    this.mano = mano;
  }
  public String sacaCartas(int index){
    carta=mano.get(index);
    mano.remove(index);
    return carta;
  }
}
