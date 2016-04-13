import java.util.ArrayList;
import java.lang.Math;

public class juegoPoker{
ArrayList<String>maso = new ArrayList<String>();

int alet = 0, i = 0;

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
  public void repartir(){}

}
