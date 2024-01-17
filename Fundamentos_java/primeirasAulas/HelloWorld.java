package primeirasAulas;
/*
 * HelloWorld = Nome da minha classe
 * public = Tipo de acesso da classe
 * class = Tipo da classe
 * p/ executar java nomedoarquivo
 * main = nome do método é padrão, é o ponto de partida
 * vai receber uma lista, array de string
 */

public class HelloWorld {
  // Todo conteúdo deverá ser inserido aqui dentro
    public static void main(String[] args) { //ponto de partida da classe
      /*
       * valores (int, double, float, long)
       * texto (String)
       * Booleanos (boolean)
       * existem outros os acima são os tipos primitivos
       */
      int dadoDoTipoInt = 10; // tipo da variável, nome e atribuição
      double dadoDoTipoDouble = 3.14; // melhor precisão do que o float
      float dadoDoTipoFloat = 3.14f;
      long dadoDoTipoLong =  312314124141414L;  // valores inteiros grandes
      String dadoDoTipoString = "Colocar o texto";
      boolean dadoDoTipoBoolean = false;

      // if - else
      if(dadoDoTipoInt == 11) {
        // sysout (informação printada no terminal)
        System.out.println("Entrou no if do 10");
      } else if(dadoDoTipoInt == 12){
        System.out.println("Entrou no if do 12");
      }
      else {
        System.out.println("Entrou no else");
      }

      // while (enquanto algo for verdadeiro)
      int ValoInicial = 0;
      while (ValoInicial < 3) {
        System.out.println("O valor é menor que 3");
        ValoInicial++;
        
      }
      System.out.println("Iniciando o for");
      // For
      for(int i = 0; i < 4; i++) {
        System.out.println("O valor do i é " + i);
      }
      System.out.println("Finalizando o for");

  }
}