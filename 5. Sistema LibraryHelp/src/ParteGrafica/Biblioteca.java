package ParteGrafica;

import pessoas.*;
import java.util.ArrayList;
/**
 *
 * @author Mathews
 */
public final class Biblioteca {
    public static Biblioteca instancia;
    private final String nome = "LibraryHelp";
    ArrayList<Livro> livros = new ArrayList();
    ArrayList<Cliente> clientes = new ArrayList();
    ArrayList<Emprestimo> emprestimos = new ArrayList();
    Funcionario funcionario;
 
    
    public static Biblioteca getInstancia(){
        if(instancia == null)
            instancia = new Biblioteca();
        
        return instancia;
    }
    
    public boolean validarCadastroLivro(String titulo){
        for (int i=0; i<livros.size(); i++){
            if (livros.get(i).getTitulo().equalsIgnoreCase(titulo)){
		return true;
            }
	}
        return false;
    }
    
    public boolean validarCadastroCliente(String cpf ,String login){
        for(int i=0; i<clientes.size(); i++){
            if(clientes.get(i).getAcesso().getLogin().equals(login)){
               return true;
            }
            if(clientes.get(i).getCpf().equals(cpf)){
                return true;
            }
        }
        return false;
    }
    
    public void addLivro(Livro livro){
        livros.add(livro);
    }
    
    public ArrayList getLivros(){
        return livros;
    }
    
    
}
