package pessoa;

public class TesteDePessoa {
  public static void main(String[] args) {
    // sempre que estamos trabalhando com objetos é preciso criar uma instância deste objeto
    // a instancia é um objeto exclusivo criado à partir de uma classe e essa info fica salva. Ex: new ..
    Pessoa pessoa = new Pessoa();
    // podemos ter várias instancias ou varias pessoas como pessoa1, pessoa2, etc
    pessoa.cpf = "3332211100";
    pessoa.nome = "Natalia";
    pessoa.idade = 25;

    System.out.println(pessoa.imprimirDadosdaPessoa(1));
  }
}
