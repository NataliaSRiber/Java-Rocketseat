package primeirasAulas;
import java.util.HashMap;
import java.util.Map;

public class Colecoes {
  // so digitar main que forma a função abaixo
  public static void main(String[] args) {
    // o map nao aceita um tipo primitivo então devemos utilizar o integer que é dele, se vc colocar varias keys com o mesmo nome no println so saira o ultimo
    Map<String, Integer> notas = new HashMap<>();
    notas.put("Belinha", 9);
    notas.put("Kalifa", 9);
    notas.put("Tufão", 10);
    notas.put("Mel", 10);

    var nota = notas.get("Mel");
    System.out.println(nota);

    // entryset faz uma manipulação da coleção do map
    for (Map.Entry<String, Integer> entry: notas.entrySet()) {
      String key = entry.getKey();
      Integer value = entry.getValue();

      System.out.println("A chave é " + key + " e o valor é " + value);
    }

    // se o hashmap receber duas chaves com o mesmo nome, prevalecera o ultimo ele nao utilizara os outros, pois trabalha com chave única

  }
}
