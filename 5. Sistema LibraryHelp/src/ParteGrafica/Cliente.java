package ParteGrafica;

/**
 *
 * @author Mathews
 */
public class Cliente extends Pessoa{
    private String email;
    private Acesso acesso;
    
    
    public Cliente(String cpf ,String login, String senha){
        this.cpf = cpf;
        acesso = new Acesso();
        acesso.setLogin(login);
        acesso.setSenha(senha);
    }
    
    public Acesso getAcesso(){
        return acesso;
    }
    
    public String getCpf(){
        return cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }
        
}
