package pessoa;

public class TesteDePessoa {
  public static void main(String[] args) {
    // sempre que estamos trabalhando com objetos é preciso criar uma instância deste objeto
    // a instancia é um objeto exclusivo criado à partir de uma classe e essa info fica salva. Ex: new ..
    // Pessoa pessoa = new Pessoa();
    // podemos ter várias instancias ou varias pessoas como pessoa1, pessoa2, etc
    // pessoa.setCpf("3332211100");
    // pessoa.setNome("Natalia");
    // pessoa.setIdade(25);

    // System.out.println(pessoa.imprimirDadosdaPessoa(1));

    Professor professor = new Professor();
    professor.setCpf("3332211100");
    professor.setNome("Natalia");
    professor.setIdade(25);
    professor.setSalario(5000);

    System.out.println(professor.imprimirDadosdaPessoa(1));

    Aluno aluno = new Aluno();
    aluno.setCpf("5832211100");
    aluno.setNome("Maria");
    aluno.setIdade(18);
    aluno.setMatricula("12345");

    System.out.println(aluno.imprimirDadosdaPessoa(1));
  }


}
