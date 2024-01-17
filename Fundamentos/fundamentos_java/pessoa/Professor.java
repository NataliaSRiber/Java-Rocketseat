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
  
}
