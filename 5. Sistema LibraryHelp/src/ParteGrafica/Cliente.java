package ParteGrafica;

/**
 *Classe que representa os clientes da biblioteca
 * @author Mathews
 */
public class Cliente extends Pessoa{
    private String email;
    private Acesso acesso;
    
    /**
     * Construtor para a classe cliente.
     * @param cpf
     * @param login
     * @param senha 
     */
    public Cliente(String cpf ,String login, String senha){
        this.cpf = cpf;
        acesso = new Acesso();
        acesso.setLogin(login);
        acesso.setSenha(senha);
    }
    
    /**
     * Método que retorna o acesso de um cliente.
     * @return Acesso
     */
    public Acesso getAcesso(){
        return acesso;
    }
    
    /**
     * Método que retorna o CPF de um usuário.
     * @return String
     */
    public String getCpf(){
        return cpf;
    }

    /**
     * Método que configura o email de um usuário.
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }
        
}
