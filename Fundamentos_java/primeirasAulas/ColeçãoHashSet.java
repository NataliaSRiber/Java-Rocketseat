package primeirasAulas;

import java.util.HashSet;
import java.util.Set;

public class ColeçãoHashSet {
  // coleção de elementos únicos, não há uma ordenação
  // ele não consola valores repetidos como o hashmap
  public static void main(String[] args) {
    Set<Integer> numeros = new HashSet<>();
    numeros.add(10);
    numeros.add(11);
    numeros.add(12);
    numeros.add(13);
    numeros.add(13);

    for (Integer elemento : numeros) {
      System.out.println(elemento);
    }
  }

}
