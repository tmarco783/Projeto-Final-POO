package pessoas;
public class Administrador extends Pessoa{
    private Acesso acesso;

    public Acesso getAcesso() {
        return acesso;
    }

    public void setAcesso(Acesso acesso) {
        this.acesso = acesso;
    }
    
    public void cadastrarAdministrador() {
        
    }
    
    public void alterarCadastroAdministrador(int id) {
        
    }
    
    public void buscarAdministrador(int id) {
        
    }
    
    public void excluirAdministrador(int id) {
        
    }
    
    @Override
    public String toString() {
        return "ID: " + this.getId() + " | Nome: " + this.getNome() + 
               " | Idade: " + this.getIdade() + "\n Endereço: " + this.getEndereco() +
               " | E-mail: " + this.getEmail();
    }
}
