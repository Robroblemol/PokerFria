import java.util.ArrayList;
public class main {
  public static void main(String[] args) {

    ArrayList<String>listaarray = new ArrayList<String>();
    listaarray.add("R0");
    listaarray.add("R1");
    listaarray.add("R2");
    listaarray.add("R3");
    listaarray.add("R4");
    listaarray.add("R5");
    listaarray.add("R6");
    listaarray.add("R7");
    listaarray.add("R8");
    listaarray.add("R9");
    listaarray.add("R10");
    listaarray.add("R11");
    listaarray.add("R12");


    System.out.println("dato primero: "+listaarray.get(0));
    System.out.println("tamaño del ArrayList "+listaarray.size());
    //metodo size obtengo el tamaño de 1 a n
    System.out.println("el ultimo datos es: "+listaarray.get(listaarray.size()-1));
    //buscar la pocision de un elemento
    System.out.println("la pocision de R8 es "+listaarray.indexOf("R8"));
  }
}
