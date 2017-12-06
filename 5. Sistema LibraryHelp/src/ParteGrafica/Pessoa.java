package ParteGrafica;

import java.io.Serializable;

/**
 *
 * @author Mathews
 */
public abstract class Pessoa implements Serializable {
    protected String nome;
    protected Data dataNasc;
    protected String sexo;
    protected String cpf;
    protected String telefoneFixo;
    protected String telefoneCelular; 
    
    public String getCpf(){
        return cpf;
    }

    public String getNome() {
        return nome;
    }
    
    
    
    
}
