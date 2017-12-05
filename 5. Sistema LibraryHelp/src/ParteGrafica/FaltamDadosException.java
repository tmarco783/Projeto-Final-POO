package ParteGrafica;
/**
 *Classe de tratamento de exceção em 
 *caso de dados insuficientes.
 * @author Mathews
 */
import javax.swing.JOptionPane;

public class FaltamDadosException extends Exception{
    public FaltamDadosException(String mensagem){
		super(mensagem);
	}
	
	public void View(){
            JOptionPane.showMessageDialog(null, "PREENCHA TODOS OS CAMPOS", "!!!WARNING!!!", JOptionPane.WARNING_MESSAGE);
	}
}
