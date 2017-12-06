package ParteGrafica;

import java.io.Serializable;

/**
 *
 * @author Mathews
 */
public class Cliente extends Pessoa implements Serializable{
    private String email;
    private Acesso acesso;
    
    
    public Cliente(String cpf ,String login, String senha){
        this.cpf = cpf;
        acesso = new Acesso();
        acesso.setLogin(login);
        acesso.setSenha(senha);
    }
    
    public Cliente(Acesso acesso, String nome, String sexo, String email, String telefone, String celular, Data dataNasc){
        this.acesso = acesso;
        this.nome = nome;
        this.sexo = sexo;
        this.email = email;
        this.telefoneFixo = telefone;
        this.telefoneCelular = celular;
        this.dataNasc = dataNasc;
    }
    
    public Acesso getAcesso(){
        return acesso;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    
    
   
        
}
