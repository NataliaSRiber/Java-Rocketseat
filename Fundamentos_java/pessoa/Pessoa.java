package pessoa;

public class Pessoa {
  // Atributos que são as características
  private String nome;
  private int idade;
  private String cpf;

  // getters and setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  // Métodos que são as ações

  String imprimirDadosdaPessoa() {
    return "O nome da pessoa é " + nome + " a idade é " + idade + " e o documento é " + cpf;
  }
}
