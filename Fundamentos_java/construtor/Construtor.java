package construtor;

public class Construtor {
  private int numero;

  // o construtor necessiat ter o mesmo nome da classe
  public Construtor(int numero) {
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
