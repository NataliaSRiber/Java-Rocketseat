package excecoes;

public class Excecoes {
  // lidar com erros

  // checked exceptions - nós conseguimos prever e  tratar (maioria das vezes extends de Exception que extends uma throwable)

  // unchecked exceptions - excessões nas quais não temos controle (RuntimeExceptions)

  public static void main(String[] args) throws Exception {
    // validarNumero();
    // try and catch
    try {
      validarNumero();
    } catch (Exception e) {
     System.out.println("Quebrou");
     e.printStackTrace();
    }
    }

    // o static permite seu método seja acessado sem ser instanciado

    public static void validarNumero() throws Exception {
      int numero = 10;
      if(numero < 100) {
        throw new Exception("O número é menor que 100");
    }
  }
}
