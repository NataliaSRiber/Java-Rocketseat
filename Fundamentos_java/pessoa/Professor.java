package pessoa;


// extends permite que o professor herde as caracteristicas da classe pessoa
public class Professor extends Pessoa {

  private double salario;

  public double getSalario() {
    return salario;
  }
  
  public void setSalario(double salario) {
    this.salario = salario;
  }

  // polimorfismo: sobreescreveu o método imprimirDadosDaPessoa
  String imprimirDadosdaPessoa() {
    // o super quer dizer que a função vai na classe pai e herda o que há na função imprimirDados..
    System.out.println(super.imprimirDadosdaPessoa());
    return "Você é professor";
  }
  
}
