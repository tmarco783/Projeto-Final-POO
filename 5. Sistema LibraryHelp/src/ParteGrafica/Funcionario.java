package ParteGrafica;

/**
 *
 * @author Mathews
 */
public class Funcionario extends Pessoa{
    private double salario;
    private Acesso acesso; 
  
    public Acesso getAcesso() {
        return acesso;
    }
    
    public void setAcesso(Acesso acesso){
        this.acesso = acesso;
    }
    
    
}
