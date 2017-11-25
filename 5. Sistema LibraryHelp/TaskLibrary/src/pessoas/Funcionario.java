package pessoas;
public class Funcionario extends Pessoa{
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
    
    public void cadastrarFuncionario() {
        
    }
    
    public void alterarRegistroFuncionario() {
    
    }
    
    public void buscarFuncionario() {
        
    }
    
    public void exlcuirFuncionario() {
        
    }
    
    @Override
    public String toString() {
        return "ID: " + this.getId() + "Matrícula: " + this.getMatricula() + " | Nome: " + this.getNome() + 
               " | Idade: " + this.getIdade() + "\n Endereço: " + this.getEndereco() +
               " | E-mail: " + this.getEmail();
    }
}
