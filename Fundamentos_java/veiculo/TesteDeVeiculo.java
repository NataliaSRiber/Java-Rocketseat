package Fundamentos_java.veiculo;

public class TesteDeVeiculo {
  // não podemos instanciar uma interface
  public static void main(String[] args) {
    Veiculo carro = new Carro();
    Veiculo moto = new Moto();

    carro.acelerar();
    carro.frear();

    moto.acelerar();
    moto.frear();
    
  }
}
