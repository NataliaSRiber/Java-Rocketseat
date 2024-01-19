package construtor;

public class Construtor {
  private int numero;

  // o construtor necessita ter o mesmo nome da classe
  public Construtor(int numero, String text) {
    this.numero = numero;
  }

  public Construtor() {
    //TODO Auto-generated constructor stub
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getNumero() {
    return numero;
  }
}
