package pessoa;

public class Aluno extends Pessoa {

  private String matricula;

  public String getMatricula() {
    return matricula;
  }
  
  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  String imprimirDadosdaPessoa() {
    System.out.println(super.imprimirDadosdaPessoa());
    return "Você é Aluno";
  }

}
