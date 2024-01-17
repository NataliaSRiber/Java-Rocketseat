package conta;

public class ContaBancaria {
  // o encapsulamento nos permite proteger os nossos dados
  // o private nao deixa manipular o campo - protege os dados, entao é necessário utilizar o get para pegar uma info e o set para manipular estas infos
  private String numero;
  private String titular;
  private double saldo;

  // Encapsulamento - metodos para manipularmos e recuperar infos dentro dos atributos privados
  // getters and setters

  // ao ser criada a conta o saldo inicial é R$0.0
  public ContaBancaria() {
    saldo = 0.0;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getNumero() {
    // como a função não recebe nenhum parãmetro não é necessário o this.
    return this.numero;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public String getTitular() {
    return titular;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public double getSaldo() {
    return saldo;
  }

  // depositar
  void depositar(double valor) {
    if (valor > 0) {
      saldo = saldo + valor;
      System.out.println("Depósito de R$" + valor + ". O saldo atual é de R$ " + saldo);
    } else {
      System.out.println("O valor do depósito é inválido");
    }
  }

  // sacar
  void sacar(double valor) {
    if(valor > 0 && valor <= saldo) {
      saldo = saldo - valor;
      System.out.println("saque de R$" + valor + ". O saldo atual é de R$ " + saldo);
    }
  }
}
