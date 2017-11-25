package pessoas;
public class Usuario extends Pessoa{
    private int matricula;
    private Acesso acesso;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Acesso getAcesso() {
        return acesso;
    }

    public void setAcesso(Acesso acesso) {
        this.acesso = acesso;
    }
    
    public void cadastrarUsuario() {
        
    }
    
    public void alterarRegistroUsuario() {
    
    }
    
    public void buscarUsuario() {
        
    }
    
    public void exlcuirUsuario() {
        
    }
    
    @Override
    public String toString() {
        return "ID: " + this.getId() + "Matrícula: " + this.getMatricula() + " | Nome: " + this.getNome() + 
               " | Idade: " + this.getIdade() + "\n Endereço: " + this.getEndereco() +
               " | E-mail: " + this.getEmail();
    }
}
